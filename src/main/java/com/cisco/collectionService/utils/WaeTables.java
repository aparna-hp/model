package com.cisco.collectionService.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class WaeTables {

    private static final Logger logger = LogManager.getLogger(WaeTables.class);
    private static final String REAL = "REAL";
    private static final String INTEGER = "INTEGER";
    private static final String BLOB = "BLOB";
    private static List<String> tableAndKey;
    private static Map<String, String> tableKeyMap;
    private static Map<String, String> tableColumns;
    private static Map<String, String> numColumns;
    private static List<String> blobColumns;
    private static String resourceFolderPath = System.getProperty("user.dir").concat("/packages/cisco-wae-dare/priv/etc/");
    private static Map<String, Map<String, String>> tableRule;
    private static List<String> tableWithSwapableValues;

    public static void populate() {
        try {
            //emptyPlanFile = DareApplication.dareDataDir
            // + File.separator + "EmptyPlanFile.pln";
            tableWithSwapableValues = new ArrayList<>();
            populateWaeTableKeys();
            numColumns = new HashMap<>();
            blobColumns = new ArrayList<>();
            populateWaeTableColumns();
            logger.debug("Size of tableKey " + tableAndKey.size() + " TableColumn " + tableColumns.size());
        } catch (Exception e) {
            logger.error("Exception occurred", e);
        }
    }

    private static void populateWaeTableKeys() throws IOException {
        String tableKeyFile = "table_key.txt";
        tableAndKey = new ArrayList<>();
        tableKeyMap = new HashMap<>();
        Resource resource = new ClassPathResource(tableKeyFile);
        File file = resource.getFile();
        try (Stream<String> stream = Files.lines(file.toPath())) {
            stream.forEach(line -> {
                if (!line.trim().startsWith("#")) { // exclude comment lines
                    tableAndKey.add(line.trim());
                    String[] temp = line.split("_");
                    tableKeyMap.put(temp[0].trim(), temp[1].trim());
                    if (temp[1].trim().contains("A]") && temp[1].trim().contains("B]")) {
                        tableWithSwapableValues.add(temp[0].trim());
                    }
                }
            });
        } catch (Exception e) {
            logger.error("Error populating the table and key values: ", e);
        }
    }

    public static void populateWaeTableColumns() {
        String waeTableSql = "all-wae-columns.txt";
        tableColumns = new HashMap<>();
        logger.info("Start populating the Wae table columns");

        try {
            Resource resource = new ClassPathResource(waeTableSql);
            File file = resource.getFile();
            logger.info("Column file : {}", file.getAbsolutePath());
            try (Stream<String> stream = Files.lines(file.toPath())) {

                // Create a pattern to search open and close brackets
                Pattern pattern = Pattern.compile("\\[(.*?)\\]");

                stream.forEach(line -> {
                    sqlParser(line, pattern);
                });
                for (String key : tableColumns.keySet()) {
                    logger.info(key + " :" + tableColumns.get(key));
                }
                logger.info("Done populating the Wae table columns");
            } catch (Exception e) {
                logger.error("Error populating the Wae Table columns", e);
            }
        } catch (Exception e) {
            logger.error("Error populating the Wae table columns", e);
        }
    }

    private static void sqlParser(String line, Pattern pattern) {
        Matcher m = pattern.matcher(line);
        boolean first = true;
        String table = "", separator = "", numColumnSeperator = "";
        StringBuilder column = new StringBuilder();
        StringBuilder numColumn = new StringBuilder();
        while (m.find()) {
            String value = line.substring(m.start(), m.end());
            if (value.contains("::")) {
                logger.trace("Ignore the mate pln column" + value);
                continue;
            }
            if (first) {
                table = value;
            } else {
                column.append(separator).append(value);
                separator = ",";
                int typeStringEndIndex = line.indexOf(",", m.end() + 1);
                if (typeStringEndIndex < 0) {
                    typeStringEndIndex = line.length();
                }
                String typeString = line.substring(m.end() + 1, typeStringEndIndex);
                if (typeString.contains(REAL) || typeString.contains(INTEGER)) {
                    numColumn.append(numColumnSeperator).append(value);
                    numColumnSeperator = ",";
                    logger.trace("Found a number column " + value + " belonging to table " + table);
                } else if (typeString.contains(BLOB)) {
                    blobColumns.add(value);
                    logger.trace("Found a BLOB column " + value);
                }
            }
            first = false;
        }

        logger.trace("Table " + table + "_" + column);
        tableColumns.put(table, column.toString());
        numColumns.put(table, numColumn.toString());
    }


    public static List<String> getTableAndKey() {
        return tableAndKey;
    }

    public static Map<String, String> getTableColumns() {
        return tableColumns;
    }

    public static String getTableColumnsWithoutUserProperties(String tableName) {
        String columns = tableColumns.get(tableName);
        List<String> columnList = new ArrayList<>(Arrays.asList(columns.split(",")));
        columnList.removeIf(s -> s.contains("::"));
        columns = String.join(",", columnList);
        return columns;
    }

    public static boolean isNumColumn(String tableName, String key) {
        return numColumns.get(tableName) != null && numColumns.get(tableName).contains(key);
    }

    public static List<String> getBlobColumns() {
        return blobColumns;
    }


    public static Map<String, Map<String, String>> getTableRule() {
        return tableRule;
    }

    public static String getTableKeys(String tableName) {
        return tableKeyMap.get(tableName);
    }


    public static List<String> getTableWithSwapableValues() {
        return tableWithSwapableValues;
    }

    public static String getEmptyDbFileWithSchema() {
        return null;
    }

    public static String getResourceFolderPath() {
        return resourceFolderPath;
    }

    //This will be called only from Test class.
    public static void setResourceFolderPath(String resourceFolderPath) {
        WaeTables.resourceFolderPath = resourceFolderPath;
    }

    public static String getColumnValue(String tableName, String columnName, String columnValue) {
        if (null == columnValue || (columnValue != null && columnValue.equals("null"))) {
            return null;
        }

        if (!getTableKeys(tableName).contains(columnName) && isNumColumn(tableName, columnName)
                && columnValue != null && columnValue.trim().isEmpty()) {
            columnValue = null;
        }

        if (!isNumColumn(tableName, columnName) && null != columnValue) {
            columnValue = "'" + columnValue.replaceAll("'", "'||char(39)||'").replaceAll("\\n", "'||char(10)||'") + "'";
        }

        return columnValue;
    }

}
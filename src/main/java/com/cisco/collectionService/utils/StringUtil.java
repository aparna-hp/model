package com.cisco.collectionService.utils;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Utility class for String functions.
 */
public class StringUtil {

    /**
     * Checks if the input String is null or empty.
     *
     * @param inString input String
     * @return true if empty, false otherwise
     */
    public static boolean isEmpty(String inString) {
        return null == inString || inString.isEmpty();
    }

    public static boolean isTrue(String value) {
        return "T".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value);
    }

    /*
    Returns blank string instead of null.
     */
    public static String nullToEmpty(@Nullable String string) {
        return (string == null) ? "" : string;
    }

    /**
     * Strip the enclosing {} from s.
     *
     * @param s the string from which to strip curlies
     * @return
     */
    public static String stripCurlies(String s) {
        if (s == null)
            return s;
        if (s.startsWith("{") && s.endsWith("}"))
            return s.substring(1, s.length() - 1).trim();
        return s;
    }


    /**
     * Join a collection of strings to a single string with separator, skip empty strings.
     */
    public static String join(Collection<String> collection, String separator) {
        if (null == collection || collection.size() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (String s : collection) {
            if (isEmpty(s)) {
                continue;
            }
            if (first) {
                stringBuilder.append(s);
                first = false;
            } else {
                stringBuilder.append(separator).append(s);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Convert an InputStream into a String.
     * Used for reading contents of a file or socket.
     *
     * @return String representation of InputStream
     */
    public static String inputStreamToString(InputStream is) throws Exception {
        try (java.util.Scanner s = new java.util.Scanner(is)) {
            return s.useDelimiter("\\A").hasNext() ? s.next() : "";
        }
    }

    /**
     * Convert string to InputStream.
     *
     * @param inputString input string
     * @return InputStream representation for string
     */
    public static InputStream stringToInputStream(String inputString) throws Exception {
        return new ByteArrayInputStream(inputString.getBytes());
    }

    /**
     * Remove last step in Xpath
     * Example: Input: /wae:networks/wae:network{bgl}/wae:nimos/wae:nimo
     * Return value: /wae:networks/wae:network{bgl}/wae:nimos/
     *
     * @param inputXpath input string
     * @return String representation for parentXpath
     */
    public static String getParentXpath(String inputXpath) throws Exception {
        if (inputXpath.isEmpty()) {
            throw new Exception("Input Xpath is empty or null");
        }
        String[] parts = inputXpath.split("/");
        parts = Arrays.copyOfRange(parts, 0, parts.length - 1);
        return join(Arrays.asList(parts), "/") + "/";
    }

    public static List<String> getListFromString(String data) {
        return Lists.newArrayList(Splitter.onPattern("[,;]").omitEmptyStrings().trimResults().split(data));
    }

    public static String escapeXMl(String originalUnprotectedString) {
        if (originalUnprotectedString == null) {
            return null;
        }
        boolean anyCharactersProtected = false;

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < originalUnprotectedString.length(); i++) {
            char ch = originalUnprotectedString.charAt(i);

            boolean controlCharacter = ch < 32;
            boolean unicodeButNotAscii = ch > 126;
            boolean characterWithSpecialMeaningInXML = ch == '<' || ch == '&' || ch == '>';

            if (characterWithSpecialMeaningInXML || unicodeButNotAscii || controlCharacter) {
                stringBuffer.append("&#" + (int) ch + ";");
                anyCharactersProtected = true;
            } else {
                stringBuffer.append(ch);
            }
        }
        if (!anyCharactersProtected) {
            return originalUnprotectedString;
        }

        return stringBuffer.toString();
    }

}

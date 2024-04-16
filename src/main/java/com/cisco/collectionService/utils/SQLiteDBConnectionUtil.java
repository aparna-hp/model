package com.cisco.collectionService.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;

public class SQLiteDBConnectionUtil implements AutoCloseable {

    private static final int BATCH_SIZE = 1000;
    private final Logger logger = LogManager.getLogger(SQLiteDBConnectionUtil.class);
    private final boolean initialized;
    private final Connection connection;
    private boolean closed;


    public SQLiteDBConnectionUtil(File aInDBFile) throws SQLException {
        String url = "jdbc:sqlite:/" + aInDBFile.getAbsolutePath();
        try {
            closed = false;
            connection = DriverManager.getConnection(url);
            connection.setAutoCommit(false);
            initialized = true;
            logger.debug("opening DB: [" + getOneLinerId() + "]");
        } catch (SQLException e) {
            logger.error("Error connecting to db: {}", e.getMessage());
            throw e;
        }
    }

    public boolean isInitialized() {
        return initialized;
    }

    @Override
    public void close() throws SQLException {
        if (closed && connection == null) {
            return;
        }
        try {
            //connection.commit(); // close doesn't guarantee commit
            connection.close();

        } catch (SQLException e) {
            logger.error("Error closing the connection", e);
            throw e;
        }
        closed = true;
    }

    private String getOneLinerId() throws SQLException {
        return " initialized:" + initialized + ", closed:" + closed + ", connection.getAutoCommit():" + connection.getAutoCommit();
    }

    public Connection getConnection() {
        return connection;
    }


    public void commitAll(List<StringBuilder> statements) throws SQLException {
        int count = 0;
        long st = System.currentTimeMillis();
        logger.debug("committing records: {}  to database ", statements.size());
        try (Statement statement = connection.createStatement()) {
            for (StringBuilder sql : statements) {
                statement.addBatch(sql.toString());
                if (++count % BATCH_SIZE == 0) {
                    statement.executeBatch();
                }
            }
            statement.executeBatch();
            connection.commit();
            logger.debug("finished committing records: {}  to database in milliseconds: {}", statements.size(), (System.currentTimeMillis() - st));
        } catch (SQLException e) {
            logger.error("Error in committing records to database ", e);
            throw e;
        }
    }

    public void commitQueryAll(Set<String> statements) throws SQLException {
        int count = 0;
        try (Statement statement = connection.createStatement()) {
            for (String sql : statements) {
                statement.addBatch(sql);
                if (++count % BATCH_SIZE == 0) {
                    statement.executeBatch();
                }
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            logger.error("Error in committing records to database ", e);
            throw e;
        }
    }
}




package com.cisco.collectionService.model.common.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Enum representing different isis level type of Interface.
 */
public enum IsisLevelType {
    LEVEL1, LEVEL2, LEVEL1_2;

    private static final Logger logger = LogManager.getLogger(IsisLevelType.class);

    /**
     * Create enum from string.
     *
     * @return null if you can't find a match
     */
    public static IsisLevelType lookup(String isisLevelType) {
        if (isisLevelType == null) {
            throw new IllegalArgumentException("s cannot be null");
        }
        if (isisLevelType.trim().equalsIgnoreCase("level1")) {
            return LEVEL1;
        } else if (isisLevelType.trim().equalsIgnoreCase("level2")) {
            return LEVEL2;
        } else if (isisLevelType.trim().equalsIgnoreCase("level1-2")) {
            return LEVEL1_2;
        } else {
            logger.warn("Unknown isisLevelType: " + isisLevelType);
        }
        return null;
    }

    /**
     * Output schema defined string
     */
    @Override
    public String toString() {
        String name = name().replace("_", "-").toLowerCase();
        return name;
    }

    /**
     * Output plan file format string
     */
    public String toPlanString() {
        String name = name().replace("_", "-").toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }
}
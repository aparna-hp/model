package com.cisco.collectionService.model.common.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Enum representing different AS types.
 */
public enum AsType {
    INTERNAL, EXTERNAL;

    private static final Logger logger = LogManager.getLogger(AsType.class);

    /**
     * Convert string version of AS type to enum.
     *
     * @param asType AS type string
     * @return the enum AS type
     */
    public static AsType lookup(String asType) {
        if (asType == null) {
            throw new IllegalArgumentException("AS Type cannot be null");
        }
        try {
            return AsType.valueOf(asType.trim().replace("-", "_").toUpperCase());
        } catch (IllegalArgumentException ex) {
            logger.warn("Unknown asType: " + asType);
        }
        return null;
    }

    @Override
    public String toString() {
        return name().replace("_", "-").toLowerCase();
    }
}
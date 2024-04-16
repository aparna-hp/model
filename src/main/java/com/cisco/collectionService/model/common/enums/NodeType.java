package com.cisco.collectionService.model.common.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Enum representing different node types.
 */
public enum NodeType {
    PHYSICAL, VIRTUAL, PSN;

    private static final Logger logger = LogManager.getLogger(NodeType.class);

    /**
     * Convert string version of node type to enum.
     *
     * @param type node type string
     * @return the enum node type
     */
    public static NodeType lookup(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Node Type cannot be null");
        }
        try {
            return NodeType.valueOf(type.trim().replace("-", "_").toUpperCase());
        } catch (IllegalArgumentException ex) {
            logger.warn("Unknown node type: " + type);
        }
        return null;
    }

    @Override
    public String toString() {
        return name().replace("_", "-").toLowerCase();
    }
}

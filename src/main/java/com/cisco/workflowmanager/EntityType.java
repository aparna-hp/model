package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents the various entity types
 */
@Getter @AllArgsConstructor
public enum EntityType {
    WORKFLOW_JOB("JOB", "Workflow job"),
    DATA_COLLECTOR_SERVICE("COLLECTOR", "Collector"),
    COLLECTOR_TOOL("TOOL", "Tool"),
    SUBSCRIPTION("SUBSCRIPTION", "Subscription"),
    HISTORY("HISTORY", "History"),
    SERVICE_END_POINT("END_POINT", "Service end point"),
    EXTERNAL_SERVICE("EXT_SERVICE", "External service"),
    AGGREGATOR("AGGREGATOR", "Aggregator"),
    CONFIG("CONFIG", "Configuration"),
    AGENT("AGENT", "Agent"),
    NETWORK("NETWORK", "Network"),
    ARCHIVER("ARCHIVER", "Archiver"),
    ;

    private String type;
    private String display;

    @Override
    public String toString() {
        return name();
    }
}

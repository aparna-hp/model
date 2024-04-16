package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Executor for the services
 */
@AllArgsConstructor @Getter
public enum ServiceExecutor {
    CLI_TOOL_EXECUTOR("CLI service"),
    XTC_EXECUTOR("XTC service"),
    AGGREGATOR("Aggregator"),
    COLLECTION_SERVICE("Collection service"),
    WORKFLOW_MANAGER("Workflow service"),
    TRAFFIC_EXECUTOR("Traffic service"),
    NETFLOW_EXECUTOR("Netflow service"),
    TRAFFIC_DEMAND_EXECUTOR("Traffic demand service"),
    ARCHIVE_EXECUTOR("Archive service")
    ;

    private String service;

}

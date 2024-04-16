package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class AggrCollectorInfo {
    private long jobExecutionId;
    private long taskId;
    private long networkId;
    private String networkName;
    private ServiceType collectorType;
    private long collectorId;
    private ConsolidationType consolidationType;
}

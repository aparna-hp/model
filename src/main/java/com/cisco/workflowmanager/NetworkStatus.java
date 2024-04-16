package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class NetworkStatus {
    private long networkId;
    private String name = "";
    private long lastExecution;
    private long lastSuccessfulExecution;
    private List<JobStatus> jobStatusList;
    private Map<ExecutionStatus, Integer> jobExecutionStats;

}

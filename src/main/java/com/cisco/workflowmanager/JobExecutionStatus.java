package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class JobExecutionStatus {
    private long executionId;
    private ExecutionStatus status;
    private long startTime;
    private long endTime;
    private Map<ExecutionStatus, Integer> taskExecutionStats;
    private List<TaskStatus> tasks;
}

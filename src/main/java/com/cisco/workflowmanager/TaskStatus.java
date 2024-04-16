package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class TaskStatus {
    private long taskId;
    private long collectorId;
    private String name;
    private String type;
    private ExecutionStatus status;
    private String statusInfo;
    private long startTime;
    private long endTime;
}

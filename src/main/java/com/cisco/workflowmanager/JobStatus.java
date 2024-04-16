package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class JobStatus {
    private long jobId;
    private long networkId;
    private String name;
    private JobType type;
    private ScheduleInfo scheduleInfo;
    private ScheduleStatus scheduleStatus;
    private long nextExecutionTime;
    private JobExecutionStatus lastExecution;

}

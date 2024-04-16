package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter @ToString @NoArgsConstructor
public class JobTaskHistory {
    private long jobId;
    private Map<String, TaskHistory> tasks = new HashMap<>();

    public JobTaskHistory(long jobId) {
        this.jobId = jobId;
    }
}

package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor
public class JobConfig {
    private TaskFailurePolicy taskFailurePolicy;

    public JobConfig(){}
}

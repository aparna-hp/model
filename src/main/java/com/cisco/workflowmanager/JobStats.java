package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class JobStats {
    private int total;
    private Map<ExecutionStatus, AtomicInteger> stats;
}

package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum ExecutionStatus {
    SCHEDULED(1,  "Scheduled", "scheduled", false, false,false, false),
    RUNNING(2, "Running", "running", false, true,false, false),
    FINISHED(3, "Finished", "finished", true, true, true, false),
    FAILED(4, "Failed", "failed", true, true,false, true),
    WAITING(5, "Waiting", "waiting", false, true,false, false),
    ABORTED(6, "Aborted", "aborted", true, true,false, false),
    TIMEOUT(7, "Timeout", "timed out", true, true,false, true);

    private int id;
    private String display;
    private String reason;
    private boolean completed;
    private boolean allocated;
    private boolean success;
    private boolean failure;

    @Override
    public String toString() {
        return name();
    }
}

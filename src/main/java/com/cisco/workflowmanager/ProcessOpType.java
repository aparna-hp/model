package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum ProcessOpType {
    COLLECT ("Collection"),
    AGGREGATE("Aggregation"),
    RESYNC("Re-synchronization"),
    START("Start"),
    STOP("Stop"),
    RESTART("Restart"),
    PURGE("Purge"),
    UPLOAD("Upload"),
    CONFIG("Configuration"),
    NONE("None"),
    ;

    private String display;
}

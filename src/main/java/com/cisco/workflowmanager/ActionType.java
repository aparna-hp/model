package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum ActionType {
    COLLECT(1),
    RESYNC(2),
    ARCHIVE(3),
    AGGREGATE(4),
    START(5),
    STOP(6),
    RESTART(7),
    CONFIG(8),
    UPLOAD(9),
    ;

    private int id;
}

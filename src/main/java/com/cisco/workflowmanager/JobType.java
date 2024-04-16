package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum JobType {
    COLLECTION(1),
    RESYNC(2),
    AGENT(3),
    COLLECTION_TASK(4)
    ;

    private int value;

    @Override
    public String toString() {
        return this.name();
    }
}

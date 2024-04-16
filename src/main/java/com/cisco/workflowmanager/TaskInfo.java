package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class TaskInfo {
    private long id;
    private String name;
    private TaskType type;
    private long order;
    private String action;
    private ConsolidationType consolidationType;
}

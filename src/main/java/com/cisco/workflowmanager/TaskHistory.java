package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TaskHistory {
    private String name;
    private String type;
    private List<ExecutionInfo> history;
}

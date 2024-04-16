package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter @ToString
public class ServiceCompletionInfo {
    private ExecutionStatus status;
    private String info;
    private Map<String, String> properties = new HashMap<>();
}

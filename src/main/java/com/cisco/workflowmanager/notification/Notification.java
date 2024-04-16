package com.cisco.workflowmanager.notification;

import com.cisco.workflowmanager.EntityType;
import com.cisco.workflowmanager.ExecutionStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter @Setter @ToString
public class Notification {
    private EntityType type;
    private long id;
    private String name;
    private ExecutionStatus status;
    private String info;
    private Map<String, String> callbackPayload;
}



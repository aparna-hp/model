package com.cisco.workflowmanager.notification;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class DataCollectionNotification extends Notification {
    private String collectorName;
    private long collectorId;
    private String action;
}

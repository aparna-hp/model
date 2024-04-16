package com.cisco.workflowmanager.notification;

import com.cisco.workflowmanager.TaskType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ToolNotification extends Notification{
    private TaskType toolType;
}

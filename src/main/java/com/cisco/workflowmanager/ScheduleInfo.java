package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ScheduleInfo {
    private RecurrenceType recurrenceType;
    private String cronExpr;

    public ScheduleInfo(){}
}

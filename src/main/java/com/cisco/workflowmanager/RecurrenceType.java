package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RecurrenceType {
    RUN_NOW,
    CRON_EXPR;
}
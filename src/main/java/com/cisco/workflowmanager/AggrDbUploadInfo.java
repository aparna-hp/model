package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.EnumSet;

@Getter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class AggrDbUploadInfo {
    private long jobExecutionId;
    private long taskId;
    private long networkId;
    private String networkName;
    private EnumSet<ConsolidationType> dbs;
}

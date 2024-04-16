package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class AggrNetworkCollectors {
    private long jobExecutionId;
    private long taskId;
    private long networkId;
    private String networkName;
    @Builder.Default
    private List<CollectorInfo> collectors = new ArrayList<>();
}

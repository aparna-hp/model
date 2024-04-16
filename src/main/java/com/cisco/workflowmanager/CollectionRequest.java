package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter @Setter @ToString
public class CollectionRequest {
    private long networkId;
    private String networkName;
    private String action;
    private long id;
    private ServiceType type;
    private long jobExecutionId;
    private long jobId;
    private long collectorId;
    private boolean archive;
    private RESTEndpoint callbackInfo;
    private RESTEndpoint toolScheduleInfo;
    private Map<String, Object> config;
    private Map<String,String> params;
}

package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter @Setter @ToString
public class DataCollectionRequest extends DataCollectionInfo{
    private long networkId;
    private String networkName;
    private RESTEndpoint callback;
    public Optional<RESTEndpoint> getCallback(){
        return Optional.ofNullable(callback);
    }
}

package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class CollectorToolInfo {
    private CollectorToolType type;
    private Map<String, String> params = new HashMap<>();
    private RESTEndpoint callbackInfo;
}

package com.cisco.workflowmanager;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter @Setter
public class CollectorToolRequest {
    private TaskType type;
    private Map<String, Object> config = new HashMap<>();
    private RESTEndpoint callback;
    private ActionType action = ActionType.COLLECT;
    private Map<String, String> callbackPayload;
    private long timeout;

    public Optional<RESTEndpoint> getCallback(){
        return Optional.ofNullable(callback);
    }

    public String getInfo(){
        return "["+ type.name()+"-"+action+"]";
    }
}

package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class RESTEndpoint{
    private HTTPMethod httpMethod;
    private String url;

    @Override
    public String toString() {
        return "RESTEndpoint{" +
                 httpMethod + "-" + url + "}";
    }
}

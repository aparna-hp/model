package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class RequestAck {
    private int httpStatusCode;
    private long id;
    private String message;
    private ServiceType type;
}

package com.cisco.configService.model.netflow.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ControllerStatus {

    @JsonProperty("startTime")
    private String startTime;

    @JsonProperty("upTime")
    private String upTime;

    @JsonProperty("lastHBReceived")
    private String lastHbReceived;

    @JsonProperty("lastHBAge")
    private String lastHbAge;

    @JsonProperty("jvmMemUtilitzation")
    private String jvmMemUtilitzation;

}

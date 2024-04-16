package com.cisco.configService.model.netflow.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AgentStatus {

    @JsonProperty("startTime")
    private String startTime;

    @JsonProperty("upTime")
    private String upTime;

    @JsonProperty("lastHBReceived")
    private String lastHbReceived;

    @JsonProperty("lastHBAge")
    private String lastHbAge;

    @JsonProperty("skewTime")
    private String skewTime;

    @JsonProperty("computationSequence")
    private Integer computationSequence;

    @JsonProperty("computationModel")
    private String computationModel;

    @JsonProperty("computingIAS")
    private Boolean computingIas;

    @JsonProperty("jvmMemUtilitzation")
    private String jvmMemUtilitzation;

    @JsonProperty("daemonperiod")
    private String daemonperiod;

    @JsonProperty("daemonStatus")
    private String daemonStatus;

    @JsonProperty("bgpPort")
    private String bgpPort;

    @JsonProperty("bgpPortStatus")
    private String bgpPortStatus;

    @JsonProperty("netflowPort")
    private String netflowPort;

    @JsonProperty("netflowPortStatus")
    private String netflowPortStatus;

    @JsonProperty("netflowDroppedPackets")
    private String netflowDroppedPackets;

    @JsonProperty("netflowTrafficTotal")
    private String netflowTrafficTotal;

    @JsonProperty("netflowTrafficPerSource")
    private String netflowTrafficPerSource;
}

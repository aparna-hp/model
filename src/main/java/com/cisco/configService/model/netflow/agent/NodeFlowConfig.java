package com.cisco.configService.model.netflow.agent;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class NodeFlowConfig {

    @JsonProperty("name")
    private String name;

    @JsonProperty("samplingRate")
    private Integer samplingRate;

    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
            message = "Invalid Ip address specified for the Netflow source IP.")
    @JsonProperty("flowSourceIP")
    private String flowSourceIP;

    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
            message = "Invalid Ip address specified for the Netflow BGP Source IP.")
    @JsonProperty("bGPSourceIP")
    private String bGPSourceIP;

    @JsonProperty("bGPPassword")
    private String bGPPassword;
}

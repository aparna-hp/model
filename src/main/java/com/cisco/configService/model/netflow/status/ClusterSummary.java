package com.cisco.configService.model.netflow.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClusterSummary {

    @JsonProperty("configuredSize")
    private Integer configuredSize;

    @JsonProperty("agentsUp")
    private Integer agentsUp;

    @JsonProperty("daemonsUp")
    private Integer daemonsUp;

    @JsonProperty("computationMode")
    private String computationMode;

    @JsonProperty("lastResultTime")
    private Object lastResultTime;

    @JsonProperty("lastNo-resultTime")
    private Object lastNoResultTime;

    @JsonProperty("lastComputationDone")
    private Object lastComputationDone;

    @JsonProperty("maxDiffTime")
    private Object maxDiffTime;

    @JsonProperty("maxDiffTimeOK")
    private Object maxDiffTimeOk;

    @JsonProperty("clusterAllOK")
    private Boolean clusterAllOk;

}

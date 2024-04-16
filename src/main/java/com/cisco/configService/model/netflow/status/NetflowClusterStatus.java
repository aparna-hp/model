package com.cisco.configService.model.netflow.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NetflowClusterStatus {

    @JsonProperty("AgentStatus")
    private List<AgentStatus> agents = new ArrayList<AgentStatus>();

    @JsonProperty("controller")
    private ControllerStatus controller;

    @JsonProperty("clusterSummary")
    private ClusterSummary clusterSummary;

    @JsonProperty("agents")
    public List<AgentStatus> getAgents() {
        return agents;
    }

}


package com.cisco.configService.model.topoIgp;


import com.cisco.configService.model.common.Interfaces;
import com.cisco.configService.model.common.Nodes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IgpCollectorAdvanced {

    @JsonProperty("nodes")
    public Nodes nodes = new Nodes();

    @JsonProperty("interfaces")
    public Interfaces interfaces = new Interfaces();

}

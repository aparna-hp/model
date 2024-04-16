package com.cisco.configService.model.topoBgpls;

import com.cisco.configService.model.common.Interfaces;
import com.cisco.configService.model.common.Nodes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BgpLsCollectorAdvanced {

    @JsonProperty("SR_PCE")
    private SrpceAdvanced xtc = new SrpceAdvanced();

    @JsonProperty("nodes")
    private Nodes nodes = new Nodes();

    @JsonProperty("interfaces")
    private Interfaces interfaces = new Interfaces();
}

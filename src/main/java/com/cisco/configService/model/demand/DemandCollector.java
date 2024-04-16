package com.cisco.configService.model.demand;


import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class DemandCollector extends ConfigParams {

    private List<DemandStep> demandSteps = new ArrayList<DemandStep>();

    @JsonProperty("demandSteps")
    public List<DemandStep> getDemandSteps() {
        return demandSteps;
    }

    @JsonProperty("demandSteps")
    public void setDemandSteps(List<DemandStep> demandSteps) {
        this.demandSteps = demandSteps;
    }

}

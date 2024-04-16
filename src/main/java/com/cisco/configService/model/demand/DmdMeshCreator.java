package com.cisco.configService.model.demand;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DmdMeshCreator extends ConfigParams {

    @JsonProperty("bothDirections")
    private Boolean bothDirections = true;

    @JsonProperty("deleteSameName")
    private Boolean deleteSameName = true;

    @JsonProperty("serviceClass")
    private String serviceClass;

    @JsonProperty("topology")
    private String topology;

    @JsonProperty("advanced")
    private DemandMeshAdvanced advanced = new DemandMeshAdvanced();

    public Boolean getBothDirections() {
        return bothDirections;
    }

    public void setBothDirections(Boolean bothDirections) {
        this.bothDirections = bothDirections == null || bothDirections;
    }

    public Boolean getDeleteSameName() {
        return deleteSameName;
    }

    public void setDeleteSameName(Boolean deleteSameName) {
        this.deleteSameName = deleteSameName == null || deleteSameName;
    }

    @JsonProperty("serviceClass")
    public String getServiceClass() {
        return serviceClass;
    }

    @JsonProperty("serviceClass")
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    @JsonProperty("topology")
    public String getTopology() {
        return topology;
    }

    @JsonProperty("topology")
    public void setTopology(String topology) {
        this.topology = topology;
    }

    @JsonProperty("advanced")
    public DemandMeshAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(DemandMeshAdvanced advanced) {
        this.advanced = advanced;
    }

}

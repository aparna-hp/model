package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DmdMeshCreatorView extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;


    @XmlElement(name = "both-directions", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("bothDirections")
    private Boolean bothDirections = true;

    @XmlElement(name = "delete-same-name", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("deleteSameName")
    private Boolean deleteSameName = true;

    @XmlElement(name = "service-class", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("serviceClass")
    private String serviceClass;

    @XmlElement(name = "topology", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("topology")
    private String topology;

    @XmlElement(name = "advanced", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("advanced")
    private DemandMeshAdvancedView demandMeshAdvancedView = new DemandMeshAdvancedView();

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

    @JsonIgnore
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonIgnore
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("advanced")
    public DemandMeshAdvancedView getDemandMeshAdvancedView() {
        return demandMeshAdvancedView;
    }

    @JsonProperty("advanced")
    public void setDemandMeshAdvancedView(DemandMeshAdvancedView demandMeshAdvancedView) {
        this.demandMeshAdvancedView = demandMeshAdvancedView;
    }

}

package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.demand.DmdsForP2mplsps;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DmdsForP2mplspsView extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;

    @XmlElement(name = "set-traffic", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("setTraffic")
    private DmdsForP2mplsps.DemandTraffic p2mpDemandTraffic = DmdsForP2mplsps.DemandTraffic.ZERO;

    @XmlElement(name = "service-class", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("serviceClass")
    private String serviceClass;

    @XmlElement(name = "advanced", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("advanced")
    private DemandForP2mpAdvancedView demandForP2mpAdvancedView = new DemandForP2mpAdvancedView();

    @JsonProperty("setTraffic")
    public DmdsForP2mplsps.DemandTraffic getP2mpDemandTraffic() {
        return p2mpDemandTraffic;
    }

    @JsonProperty("setTraffic")
    public void setP2mpDemandTraffic(DmdsForP2mplsps.DemandTraffic p2mpDemandTraffic) {
        this.p2mpDemandTraffic = p2mpDemandTraffic == null ? DmdsForP2mplsps.DemandTraffic.ZERO : p2mpDemandTraffic;
    }

    @JsonProperty("serviceClass")
    public String getServiceClass() {
        return serviceClass;
    }

    @JsonProperty("serviceClass")
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
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
    public DemandForP2mpAdvancedView getDemandForP2mpAdvancedView() {
        return demandForP2mpAdvancedView;
    }

    @JsonProperty("advanced")
    public void setDemandForP2mpAdvancedView(DemandForP2mpAdvancedView demandForP2mpAdvancedView) {
        this.demandForP2mpAdvancedView = demandForP2mpAdvancedView;
    }
}

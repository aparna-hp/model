package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.demand.DmdsForLsps;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DmdsForLspsView extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;

    @XmlElement(name = "private", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("private")
    private Boolean privateFlag = false;

    @XmlElement(name = "set-traffic", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("setTraffic")
    private DmdsForLsps.LspDemandTraffic demandTraffic = DmdsForLsps.LspDemandTraffic.BW;

    @XmlElement(name = "service-class", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("serviceClass")
    private String serviceClass;

    @XmlElement(name = "advanced", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("advanced")
    private DemandForLspAdvancedView demandForLspAdvancedView = new DemandForLspAdvancedView();

    @JsonProperty("private")
    public Boolean getPrivateFlag() {
        return privateFlag;
    }

    @JsonProperty("private")
    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag = privateFlag != null && privateFlag;
    }

    @JsonProperty("setTraffic")
    public DmdsForLsps.LspDemandTraffic getDemandTraffic() {
        return demandTraffic;
    }

    @JsonProperty("setTraffic")
    public void setDemandTraffic(DmdsForLsps.LspDemandTraffic demandTraffic) {
        this.demandTraffic = demandTraffic == null ? DmdsForLsps.LspDemandTraffic.BW : demandTraffic;
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
    public DemandForLspAdvancedView getDemandForLspAdvancedView() {
        return demandForLspAdvancedView;
    }

    @JsonProperty("advanced")
    public void setDemandForLspAdvancedView(DemandForLspAdvancedView demandForLspAdvancedView) {
        this.demandForLspAdvancedView = demandForLspAdvancedView;
    }

}

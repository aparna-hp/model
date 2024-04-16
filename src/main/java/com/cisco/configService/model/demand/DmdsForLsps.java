package com.cisco.configService.model.demand;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DmdsForLsps extends ConfigParams {

    public enum LspDemandTraffic {
        BW, TRAFFIC, ZERO
    }

    @JsonProperty("private")
    private Boolean privateFlag = false;

    @JsonProperty("setTraffic")
    private LspDemandTraffic demandTraffic = LspDemandTraffic.BW;

    @JsonProperty("serviceClass")
    private String serviceClass;

    @JsonProperty("advanced")
    private DemandForLspAdvanced advanced = new DemandForLspAdvanced();

    @JsonProperty("private")
    public Boolean getPrivateFlag() {
        return privateFlag;
    }

    @JsonProperty("private")
    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag = privateFlag != null && privateFlag;
    }

    @JsonProperty("setTraffic")
    public LspDemandTraffic getDemandTraffic() {
        return demandTraffic;
    }

    @JsonProperty("setTraffic")
    public void setDemandTraffic(LspDemandTraffic demandTraffic) {
        this.demandTraffic = demandTraffic == null ? LspDemandTraffic.BW : demandTraffic;
    }

    @JsonProperty("serviceClass")
    public String getServiceClass() {
        return serviceClass;
    }

    @JsonProperty("serviceClass")
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    @JsonProperty("advanced")
    public DemandForLspAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(DemandForLspAdvanced advanced) {
        this.advanced = advanced;
    }

}

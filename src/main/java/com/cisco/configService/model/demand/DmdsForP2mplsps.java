package com.cisco.configService.model.demand;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DmdsForP2mplsps extends ConfigParams {

    public enum DemandTraffic {
        BW,  ZERO
    }

    @JsonProperty("setTraffic")
    private DemandTraffic demandTraffic = DemandTraffic.ZERO;

    @JsonProperty("serviceClass")
    private String serviceClass;

    @JsonProperty("advanced")
    private DemandForP2mpAdvanced advanced = new DemandForP2mpAdvanced();

    @JsonProperty("setTraffic")
    public DemandTraffic getDemandTraffic() {
        return demandTraffic;
    }

    @JsonProperty("setTraffic")
    public void setDemandTraffic(DemandTraffic demandTraffic) {
        this.demandTraffic = demandTraffic == null ? DemandTraffic.ZERO : demandTraffic;
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
    public DemandForP2mpAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(DemandForP2mpAdvanced advanced) {
        this.advanced = advanced;
    }
}

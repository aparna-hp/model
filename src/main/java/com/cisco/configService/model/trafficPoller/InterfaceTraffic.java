package com.cisco.configService.model.trafficPoller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InterfaceTraffic {

    @JsonProperty("enabled")
    private Boolean enabled = false;

    @JsonProperty("period")
    private Integer period = 60;

    @JsonProperty("qosEnabled")
    private Boolean qosEnabled = false;

    @JsonProperty("vpnEnabled")
    private Boolean vpnEnabled = false;

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled != null && enabled;
    }

    @JsonProperty("period")
    public Integer getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Integer period) {
        this.period = period == null ? 60 : period;
    }

    @JsonProperty("qosEnabled")
    public Boolean getQosEnabled() {
        return qosEnabled;
    }

    @JsonProperty("qosEnabled")
    public void setQosEnabled(Boolean qosEnabled) {
        this.qosEnabled = qosEnabled != null && qosEnabled;
    }

    @JsonProperty("vpnEnabled")
    public Boolean getVpnEnabled() {
        return vpnEnabled;
    }

    @JsonProperty("vpnEnabled")
    public void setVpnEnabled(Boolean vpnEnabled) {
        this.vpnEnabled = vpnEnabled != null && vpnEnabled;
    }

}

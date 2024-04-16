package com.cisco.configService.model.topoVpn;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.Debug;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpnCollector extends ConfigParams {

    public enum VpnType {
        VPWS, L3VPN
    }

    @JsonProperty("vpnType")
    private List<VpnType> vpnType = new ArrayList<>();

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @JsonProperty("vpnType")
    public List<VpnType> getVpnType() {
        return vpnType;
    }

    @JsonProperty("vpnType")
    public void setVpnType(List<VpnType> vpnType) {
        this.vpnType = vpnType;
    }

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }

}

package com.cisco.configService.model.trafficPoller;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrafficCollector extends ConfigParams {

    @JsonProperty("enabled")
    private Boolean enabled = false;

    @JsonProperty("interfaceTraffic")
    private InterfaceTraffic interfaceTraffic = new InterfaceTraffic();

    @JsonProperty("lspTraffic")
    private LspTraffic lspTraffic = new LspTraffic();

    @JsonProperty("macTraffic")
    private MacTraffic macTraffic = new MacTraffic();

    @JsonProperty("snmpTrafficPoller")
    private SnmpTrafficPoller snmpTrafficPoller = new SnmpTrafficPoller();

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled != null && enabled;
    }

    @JsonProperty("interfaceTraffic")
    public InterfaceTraffic getInterfaceTraffic() {
        return interfaceTraffic;
    }

    @JsonProperty("interfaceTraffic")
    public void setInterfaceTraffic(InterfaceTraffic interfaceTraffic) {
        this.interfaceTraffic = interfaceTraffic;
    }

    @JsonProperty("lspTraffic")
    public LspTraffic getLspTraffic() {
        return lspTraffic;
    }

    @JsonProperty("lspTraffic")
    public void setLspTraffic(LspTraffic lspTraffic) {
        this.lspTraffic = lspTraffic;
    }

    @JsonProperty("macTraffic")
    public MacTraffic getMacTraffic() {
        return macTraffic;
    }

    @JsonProperty("macTraffic")
    public void setMacTraffic(MacTraffic macTraffic) {
        this.macTraffic = macTraffic;
    }

    public SnmpTrafficPoller getSnmpTrafficPoller() {
        return snmpTrafficPoller;
    }

    public void setSnmpTrafficPoller(SnmpTrafficPoller snmpTrafficPoller) {
        this.snmpTrafficPoller = snmpTrafficPoller;
    }
}

package com.cisco.configService.model.lspSnmp;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.Debug;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LspSnmpCollector extends ConfigParams {

    @JsonProperty("getFrrLsps")
    private Boolean getFrrLsps = false;

    @JsonProperty("advanced")
    private Advanced advanced = new Advanced();

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @JsonProperty("getFrrLsps")
    public Boolean getGetFrrLsps() {
        return getFrrLsps;
    }

    @JsonProperty("getFrrLsps")
    public void setGetFrrLsps(Boolean getFrrLsps) {
        this.getFrrLsps = getFrrLsps != null && getFrrLsps;
    }

    @JsonProperty("advanced")
    public Advanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
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

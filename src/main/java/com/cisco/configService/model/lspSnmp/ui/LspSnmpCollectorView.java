package com.cisco.configService.model.lspSnmp.ui;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LspSnmpCollectorView extends ConfigParams {

    @JsonProperty("getFrrLsps")
    private Boolean getFrrLsps = false;

    @JsonProperty("advanced")
    private AdvancedView advanced = new AdvancedView();

    @JsonProperty("getFrrLsps")
    public Boolean getGetFrrLsps() {
        return getFrrLsps;
    }

    @JsonProperty("getFrrLsps")
    public void setGetFrrLsps(Boolean getFrrLsps) {
        this.getFrrLsps = getFrrLsps != null && getFrrLsps;
    }

    @JsonProperty("advanced")
    public AdvancedView getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(AdvancedView advanced) {
        this.advanced = advanced;
    }

    @Override
    public String toString() {
        return "LspSnmpCollectorView{" +
                "getFrrLsps=" + getFrrLsps +
                ", advanced=" + advanced +
                '}';
    }
}

package com.cisco.configService.model.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Advanced {

    private Integer actionTimeout = 30;

    private GetInventoryOptions getInventoryOptions = new GetInventoryOptions();

    private BuildInventoryOptions buildInventoryOptions = new BuildInventoryOptions();

    @JsonProperty("actionTimeout")
    public Integer getActionTimeout() {
        return actionTimeout;
    }

    @JsonProperty("actionTimeout")
    public void setActionTimeout(Integer actionTimeout) {
        this.actionTimeout = actionTimeout == null ? 30 : actionTimeout;
    }

    @JsonProperty("getInventoryOptions")
    public GetInventoryOptions getGetInventoryOptions() {
        return getInventoryOptions;
    }

    @JsonProperty("getInventoryOptions")
    public void setGetInventoryOptions(GetInventoryOptions getInventoryOptions) {
        this.getInventoryOptions = getInventoryOptions;
    }

    @JsonProperty("buildInventoryOptions")
    public BuildInventoryOptions getBuildInventoryOptions() {
        return buildInventoryOptions;
    }

    @JsonProperty("buildInventoryOptions")
    public void setBuildInventoryOptions(BuildInventoryOptions buildInventoryOptions) {
        this.buildInventoryOptions = buildInventoryOptions;
    }

}

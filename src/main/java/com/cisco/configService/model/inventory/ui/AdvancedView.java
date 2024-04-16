package com.cisco.configService.model.inventory.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdvancedView {

    @JsonProperty("actionTimeout")
    private Integer actionTimeout = 30;

    @JsonProperty("getInventoryOptions")
    private GetInventoryOptionsView getInventoryOptions = new GetInventoryOptionsView();

    @JsonProperty("buildInventoryOptions")
    private BuildInventoryOptionsView buildInventoryOptions = new BuildInventoryOptionsView();
}

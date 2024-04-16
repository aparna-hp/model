package com.cisco.configService.model.inventory;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryCollector extends ConfigParams {

    private Advanced advanced = new Advanced();

    @JsonProperty("advanced")
    public Advanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
    }

}

package com.cisco.configService.model.inventory.ui;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class InventoryCollectorView extends ConfigParams {

    private AdvancedView advanced = new AdvancedView();

}

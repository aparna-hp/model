package com.cisco.configService.model.topoBgp.ui;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BgpCollectorView extends ConfigParams {

    @JsonProperty("advanced")
    private AdvancedView advanced = new AdvancedView();

}

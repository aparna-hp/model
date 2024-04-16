package com.cisco.configService.model.parseConfig.ui;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ParseConfigCollectorView extends ConfigParams {

    @JsonProperty("getConfig")
    GetConfigView getConfig = new GetConfigView();

    @JsonProperty("parseConfig")
    ParseConfigView parseConfig = new ParseConfigView();

}

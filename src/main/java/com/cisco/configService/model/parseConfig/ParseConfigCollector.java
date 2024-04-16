package com.cisco.configService.model.parseConfig;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ParseConfigCollector extends ConfigParams {

    @JsonProperty("getConfig")
    GetConfig getConfig = new GetConfig();

    @JsonProperty("parseConfig")
    ParseConfig parseConfig = new ParseConfig();

}

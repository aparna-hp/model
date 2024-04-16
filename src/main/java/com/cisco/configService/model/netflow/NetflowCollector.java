package com.cisco.configService.model.netflow;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NetflowCollector extends ConfigParams {

    @JsonProperty("CommonConfigs")
    private CommonConfigs commonConfigs = new CommonConfigs();

    @JsonProperty("IASConfigs")
    private IASConfigs iASConfigs = new IASConfigs();

    @JsonProperty("DemandConfigs")
    private DemandConfigs demandConfigs = new DemandConfigs();

}

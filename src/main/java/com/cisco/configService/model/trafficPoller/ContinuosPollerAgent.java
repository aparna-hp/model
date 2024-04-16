package com.cisco.configService.model.trafficPoller;

import com.cisco.configService.model.ConfigParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class ContinuosPollerAgent extends ConfigParams {

    @NotNull
    Long networkId;
}

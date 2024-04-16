package com.cisco.configService.model.demand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class DemandStep {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("stepNumber")
    private Integer stepNumber;

    @NotNull
    @JsonProperty("tool")
    private DemandTool tool;

    @JsonProperty("enabled")
    private Boolean enabled = false;
}

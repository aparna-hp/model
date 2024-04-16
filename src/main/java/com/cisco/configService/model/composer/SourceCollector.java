package com.cisco.configService.model.composer;

import com.cisco.configService.enums.CollectorTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class SourceCollector {

    @NotNull
    Long id;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String name;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private CollectorTypes type;

}

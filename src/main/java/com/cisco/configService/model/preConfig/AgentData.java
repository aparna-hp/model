package com.cisco.configService.model.preConfig;

import com.cisco.configService.enums.AgentTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class AgentData {

    private static final Logger logger = LogManager.getLogger(AgentData.class);

    @JsonProperty(value = "id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("type")
    private AgentTypes type;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;

    @NotBlank
    @JsonProperty("params")
    private String params;

}

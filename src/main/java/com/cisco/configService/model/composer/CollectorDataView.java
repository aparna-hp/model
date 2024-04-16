package com.cisco.configService.model.composer;

import com.cisco.configService.enums.CollectorTypes;
import com.cisco.configService.model.preConfig.AllAgentData;
import com.cisco.workflowmanager.ConsolidationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class CollectorDataView {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("type")
    private CollectorTypes type;

    @JsonProperty(value = "consolidationType")
    private ConsolidationType consolidationType = ConsolidationType.DARE;

    @JsonProperty("params")
    private String params;

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("sourceCollector")
    private SourceCollector sourceCollector;

    @JsonProperty("agents")
    private Set<AllAgentData> agents = new HashSet<>();

}

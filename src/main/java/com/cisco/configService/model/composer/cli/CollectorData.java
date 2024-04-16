package com.cisco.configService.model.composer.cli;

import com.cisco.configService.enums.CollectorTypes;
import com.cisco.configService.model.composer.SourceCollector;
import com.cisco.configService.model.preConfig.AllAgentData;
import com.cisco.configService.model.preConfig.AllNodeProfileData;
import com.cisco.configService.model.preConfig.NodeFilterData;
import com.cisco.workflowmanager.ConsolidationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class CollectorData {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("type")
    private CollectorTypes type;

    @JsonProperty(value = "networkId")
    private Long networkId;

    @JsonProperty(value = "consolidationType")
    private ConsolidationType consolidationType = ConsolidationType.DARE;

    @JsonProperty(value = "nodeProfileData")
    private AllNodeProfileData nodeProfileData;

    @JsonProperty("params")
    private String params;

    @JsonProperty("planFileName")
    private String planFileName;

    @JsonProperty("sourceCollector")
    private SourceCollector sourceCollector;

    @JsonProperty("agents")
    private Set<AllAgentData> agents = new HashSet<>();

    @JsonProperty(value = "nodeFilters")
    private List<NodeFilterData> nodeFilterDataList = new ArrayList<>();

    private int timeout;
}

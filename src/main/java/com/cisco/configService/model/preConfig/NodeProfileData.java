package com.cisco.configService.model.preConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Validated
@Data
@NoArgsConstructor
public class NodeProfileData {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @JsonProperty("defaultAuthGroup")
    private String defaultAuthGroup;

    @JsonProperty("defaultSnmpGroup")
    private String defaultSnmpGroup;

    @JsonProperty("useNodeListAsIncludeFilter")
    private Boolean useNodeListAsIncludeFilter = false;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;

    @JsonProperty("nodeList")
    private Set<@Valid NodeListData> nodeLists = new HashSet<>();

    @JsonProperty("nodeFilter")
    private Set<@Valid NodeFilterData> nodeFilters = new HashSet<>();

    @Override
    public String toString() {
        return "NodeProfileData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultAuthGroup='" + defaultAuthGroup + '\'' +
                ", defaultSnmpGroup='" + defaultSnmpGroup + '\'' +
                ", useNodeListAsIncludeFilter=" + useNodeListAsIncludeFilter +
                ", updateDate=" + updateDate +
                ", nodeLists=" + Arrays.toString(nodeLists.toArray()) +
                ", nodeFilters=" + Arrays.toString(nodeFilters.toArray()) +
                '}';
    }
}

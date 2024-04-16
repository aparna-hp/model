package com.cisco.configService.model.composer;

import com.cisco.configService.model.preConfig.AllNodeProfileData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class NetworkDataView {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @JsonProperty("draft")
    private boolean draft = false;

    @JsonProperty("draftConfig")
    private String draftConfig;

    @JsonProperty("collectors")
    private Set<CollectorDataView>  collectors = new HashSet<>();

    @NotNull
    private AllNodeProfileData nodeProfileData;
}





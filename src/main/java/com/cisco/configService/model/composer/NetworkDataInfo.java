package com.cisco.configService.model.composer;

import com.cisco.workflowmanager.NetworkStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class NetworkDataInfo {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @JsonProperty("draft")
    private boolean draft = false;

    @JsonProperty("nodeProfile")
    private String nodeProfile;

    @JsonProperty("nodeProfileId")
    private Long nodeProfileId;

    @JsonProperty("networkStatus")
    NetworkStatus networkStatus;

}





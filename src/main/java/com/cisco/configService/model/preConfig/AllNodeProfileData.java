package com.cisco.configService.model.preConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AllNodeProfileData {

    @JsonProperty("id")
    Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("useNodeListAsIncludeFilter")
    private Boolean useNodeListAsIncludeFilter = false;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;
}

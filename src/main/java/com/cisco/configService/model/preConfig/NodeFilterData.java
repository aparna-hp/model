package com.cisco.configService.model.preConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class NodeFilterData {

    public enum Type {
        HOST_INDIVIDUAL, HOST_REGEX, IP_CIDR, IP_REGEX, IP_INDIVIDUAL
    }

    public enum Condition {
        INCLUDE, EXCLUDE
    }

    @JsonProperty("id")
    private Long id;

    @NotNull
    private Type type;

    @NotNull
    private String value;

    @NotNull
    private Condition condition;

    private Boolean enabled = Boolean.TRUE;
}

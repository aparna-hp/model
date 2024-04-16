package com.cisco.aggregator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "collector-id", "collector", "enabled", "capabilities"})
public class CollectorCapabilitiesConfig {

    @JsonProperty(required = true)
    private String collector;

    @JsonProperty(required = true)
    private Map<String, TableColumnsConfig> capabilities;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @Setter
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({"all-columns", "columns"})
    public static class TableColumnsConfig {
        @JsonProperty(value = "all-columns", required = true)
        private boolean allColumns;

        @JsonProperty
        private Set<String> columns;
    }
}

package com.cisco.aggregator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class TablePrioritiesConfig {
    private String table;
    //Priority map for the collectors
    private Map<String, TablePriority> priorities;
}

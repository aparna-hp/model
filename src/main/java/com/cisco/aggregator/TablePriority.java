package com.cisco.aggregator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter @ToString
public class TablePriority {
    private int priority;
    private Set<String> priorityColumns =  new HashSet<>();

    public boolean hasPriorityCols(){
        return priorityColumns != null && priorityColumns.size() > 0;
    }
}

package com.cisco.aggregator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor @Getter
public enum AgeingFlag {
    L1_NODE("L1Nodes"),
    L1_PORT("L1Ports"),
    L1_LINK("L1Links"),
    L3_NODE("Nodes"),
    L3_PORT("Ports"),
    L3_CIRCUIT("Circuits"),
    ;
    private String tableName;

    private static Map<String, AgeingFlag> tableMap = new HashMap<>();
    static {
        for(AgeingFlag table : AgeingFlag.values()){
            tableMap.put(table.getTableName(), table);
        }
    }

    public static AgeingFlag findByTableName(String tableName){
        return tableMap.get(tableName);
    }
}

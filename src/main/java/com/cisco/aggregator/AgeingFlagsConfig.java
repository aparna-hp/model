package com.cisco.aggregator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AgeingFlagsConfig {
    private boolean enabled;
    //AgeingFlag to timeout in minutes mapping
    private Map<AgeingFlag, Integer> tables = new TreeMap<>();
}

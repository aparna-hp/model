package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class ArchivalConfig {
    private long networkId;
    private String networkName;
    private List<ArchivalDb> dbList;
}

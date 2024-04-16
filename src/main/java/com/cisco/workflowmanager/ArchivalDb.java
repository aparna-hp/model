package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class ArchivalDb {
    private CollectorDb sourceDb;
    private RESTEndpoint uploadApi;
    private String uploadName;
    private String archiveName;
}

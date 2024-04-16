package com.cisco.collectionService.model.srPce.status;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class XtcAgentStatusDto {
    private Long agentID;
    private List<CollectionWorkerDto> collectionWorkers;
    public void addWorkerDto(CollectionWorkerDto dto) {
        if (collectionWorkers == null) {
            collectionWorkers = new ArrayList<>();
        }
        collectionWorkers.add(dto);
    }
}

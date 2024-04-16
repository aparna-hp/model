package com.cisco.collectionService.model.srPce.status;


import com.cisco.configService.model.srPce.status.WorkerStatus;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CollectionWorkerDto {
    WorkerStatus.WorkerType workerType;
    CollectionWorkerStatusDto workerStatus;
}

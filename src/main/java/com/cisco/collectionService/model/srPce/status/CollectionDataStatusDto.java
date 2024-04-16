package com.cisco.collectionService.model.srPce.status;

import com.cisco.configService.model.srPce.status.WorkerDataCollectionStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CollectionDataStatusDto {
    private WorkerDataCollectionStatus.DataCollectionStatusEnum dataCollectionStatus;
    private String lastFullCollectionTime;
    private String lastNotificationTime;
    private String lastCollectionId;
    private Long eventsCount;
    private String dataReceived;
    private boolean bufferingEvents;

}

package com.cisco.configService.model.srPce.status;

import java.time.LocalDateTime;
import java.util.Objects;

public class WorkerDataCollectionStatus {
    private DataCollectionStatusEnum dataCollectionStatus;
    private boolean firstCollectionDone;
    private LocalDateTime lastFullCollectionTime;
    private LocalDateTime lastNotificationTime;
    private Long eventsCount;
    private Double dataReceived;
    private Long lastCollectionId;
    private boolean bufferingEvents;

    public boolean isBufferingEvents() {
        return bufferingEvents;
    }

    public void setBufferingEvents(boolean bufferingEvents) {
        this.bufferingEvents = bufferingEvents;
    }

    public DataCollectionStatusEnum getDataCollectionStatus() {
        return Objects.requireNonNullElse(dataCollectionStatus, DataCollectionStatusEnum.invalid_data);
    }

    public void setDataCollectionStatus(DataCollectionStatusEnum dataCollectionStatus) {
        this.dataCollectionStatus = dataCollectionStatus;
    }

    @Override
    public String toString() {
        return "WorkerDataCollectionStatus{" + "dataCollectionStatus=" + dataCollectionStatus + ", firstCollectionDone=" + firstCollectionDone + ", lastFullCollectionTime=" + lastFullCollectionTime + ", lastNotificationTime=" + lastNotificationTime + ", eventsCount=" + eventsCount + ", dataReceived=" + dataReceived + ", lastCollectionId=" + lastCollectionId + '}';
    }

    public Long getEventsCount() {
        return Objects.requireNonNullElse(eventsCount, 0L);
    }

    public void setEventsCount(Long eventsCount) {
        this.eventsCount = eventsCount;
    }

    public Double getDataReceived() {
        return Objects.requireNonNullElse(dataReceived, 0.0);
    }

    public void setDataReceived(Double dataReceived) {
        this.dataReceived = dataReceived;
    }

    public boolean isFirstCollectionDone() {
        return firstCollectionDone;
    }

    public void setFirstCollectionDone(boolean firstCollectionDone) {
        this.firstCollectionDone = firstCollectionDone;
    }

    public LocalDateTime getLastNotificationTime() {
        return Objects.requireNonNullElse(lastNotificationTime, LocalDateTime.MIN);
    }

    public void setLastNotificationTime(LocalDateTime lastNotificationTime) {
        this.lastNotificationTime = lastNotificationTime;
    }

    public LocalDateTime getLastFullCollectionTime() {
        return Objects.requireNonNullElse(lastFullCollectionTime, LocalDateTime.MIN);
    }

    public void setLastFullCollectionTime(LocalDateTime lastFullCollectionTime) {
        this.lastFullCollectionTime = lastFullCollectionTime;
    }

    public Long getLastCollectionId() {
        return lastCollectionId;
    }

    public void setLastCollectionId(Long lastCollectionId) {
        this.lastCollectionId = lastCollectionId;
    }

    public void resetReportsAndStatusFields() {
        dataCollectionStatus = DataCollectionStatusEnum.invalid_data;
        firstCollectionDone = false;
        eventsCount = 0L;
        dataReceived = 0.0;
    }

    public enum DataCollectionStatusEnum {
        processing_data, valid_data, invalid_data
    }
}

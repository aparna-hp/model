package com.cisco.configService.model.srPce.status;

import java.util.Objects;

public class WorkerStatus {
    private Long agentID;
    private ConnectionStatusEnum connectionStatus;
    private WorkerDataCollectionStatus workerDataCollectionStatus;

    private WorkerType workerType;

    public WorkerStatus(Long agentID) {
        this.agentID = agentID;
        this.workerDataCollectionStatus = new WorkerDataCollectionStatus();
    }

    public WorkerType getWorkerType() {
        return workerType;
    }

    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType;
    }

    @Override
    public String toString() {
        return "WorkerStatus{" + "agentID=" + agentID + ", connectionStatus=" + connectionStatus + ", workerDataCollectionStatus=" + workerDataCollectionStatus + '}';
    }

    public WorkerDataCollectionStatus getCollectionDataStatus() {
        return workerDataCollectionStatus;
    }

    public void setCollectionDataStatus(WorkerDataCollectionStatus workerDataCollectionStatus) {
        this.workerDataCollectionStatus = workerDataCollectionStatus;
    }

    public ConnectionStatusEnum getConnectionStatus() {
        return Objects.requireNonNullElse(connectionStatus, ConnectionStatusEnum.not_connected);
    }

    public void setConnectionStatus(ConnectionStatusEnum connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public Long getAgentID() {
        return agentID;
    }

    public void setAgentID(Long agentID) {
        this.agentID = agentID;
    }

    public enum ConnectionStatusEnum {
        closed, connecting, connected, not_connected
    }

    public enum WorkerType {
        LSP, TOPOLOGY
    }
}

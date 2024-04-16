
package com.cisco.configService.model.common;


import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.preConfig.NodeFilterData;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Nodes {

    private Boolean performanceData = false;

    private List<String> removeNodeSuffix = new ArrayList<>();

    private Boolean discoverQosQueue = true;

    private List<NodeFilterData> qosNodeFilterList;

    private Integer timeout = 60;

    private Integer verbosity = 30;

    private RecordMode netRecorder = RecordMode.OFF;

    @JsonProperty("performanceData")
    public Boolean getPerformanceData() {
        return performanceData;
    }

    @JsonProperty("performanceData")
    public void setPerformanceData(Boolean performanceData) {
        this.performanceData = performanceData != null && performanceData;
    }

    @JsonProperty("removeNodeSuffix")
    public List<String> getRemoveNodeSuffix() {
        return removeNodeSuffix;
    }

    @JsonProperty("removeNodeSuffix")
    public void setRemoveNodeSuffix(List<String> removeNodeSuffix) {
        this.removeNodeSuffix = removeNodeSuffix;
    }

    @JsonProperty("discoverQosQueue")
    public Boolean getDiscoverQosQueue() {
        return discoverQosQueue;
    }

    @JsonProperty("discoverQosQueue")
    public void setDiscoverQosQueue(Boolean discoverQosQueue) {
        this.discoverQosQueue = discoverQosQueue == null || discoverQosQueue;
    }

    public List<NodeFilterData> getQosNodeFilterList() {
        return qosNodeFilterList;
    }

    public void setQosNodeFilterList(List<NodeFilterData> qosNodeFilterList) {
        this.qosNodeFilterList = qosNodeFilterList;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 30 : verbosity;
    }

    @JsonProperty("netRecorder")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("netRecorder")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }


}

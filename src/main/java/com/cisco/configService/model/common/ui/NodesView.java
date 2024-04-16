
package com.cisco.configService.model.common.ui;

import com.cisco.configService.model.preConfig.NodeFilterData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class NodesView {

    @XmlElement( name = "performance-data",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean performanceData = false;

    @XmlElement( name = "remove-node-suffix",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonIgnore
    private List<NodeSuffix> removeNodeSuffixList = new ArrayList<>();

    private List<String> removeNodeSuffix = new ArrayList<>();

    @XmlElement( name = "qos-queue",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean discoverQosQueue = true;

    private List<NodeFilterData> qosNodeFilterList = new ArrayList<>();

    @XmlElement( name = "connect-timeout",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer timeout = 60;

    @JsonIgnore
    @XmlElement(name = "net-recorder",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String netRecorder;

    @JsonIgnore
    @XmlElement(name = "verbosity",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer verbosity;

    private DebugView debug = new DebugView();

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

    @JsonProperty("debug")
    public DebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(DebugView debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public List<NodeSuffix> getRemoveNodeSuffixList() {
        return removeNodeSuffixList;
    }

    @JsonIgnore
    public void setRemoveNodeSuffixList(List<NodeSuffix> removeNodeSuffixList) {
        this.removeNodeSuffixList = removeNodeSuffixList;
    }

    @JsonIgnore
    public String getNetRecorder() {
        return netRecorder;
    }

    @JsonIgnore
    public void setNetRecorder(String netRecorder) {
        this.netRecorder = netRecorder;
    }

    @JsonIgnore
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonIgnore
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }

    @Override
    public String toString() {
        return "NodesView{" +
                "performanceData=" + performanceData +
                ", removeNodeSuffix=" + removeNodeSuffix +
                ", discoverQosQueue=" + discoverQosQueue +
                ", qosNodeFilterList=" + qosNodeFilterList +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }

    @NoArgsConstructor
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class NodeSuffix{

        @XmlElement( name = "suffix",namespace = "http://cisco.com/ns/wae/xtc-topology")
        private String suffix;

    }
}

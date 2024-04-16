package com.cisco.configService.model.multicast.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = false)
public class SnmpPollMulticastCollectorView extends ConfigParams {

    private Long id;

    @XmlElement(name = "connect-timeout", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Integer timeout = 60;

    @XmlElement(name = "no-of-samples", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Integer noOfSamples = 1;

    @XmlElement(name = "polling-interval", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Integer pollingInterval = 300;

    @XmlElement(name = "traffic-level-name", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private String trafficLevelName;

    @XmlElement(name = "traffic-filtering", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private String trafficFiltering;

    private DebugView debug = new DebugView();

    @JsonIgnore
    @XmlElement(name = "net-recorder", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private String recordMode;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    @JsonProperty("noOfSamples")
    public Integer getNoOfSamples() {
        return noOfSamples;
    }

    @JsonProperty("noOfSamples")
    public void setNoOfSamples(Integer noOfSamples) {
        this.noOfSamples = noOfSamples == null ? 1 : noOfSamples;
    }

    @JsonProperty("pollingInterval")
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    @JsonProperty("pollingInterval")
    public void setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval == null ? 300 : pollingInterval;;
    }

    @JsonProperty("trafficLevelName")
    public String getTrafficLevelName() {
        return trafficLevelName;
    }

    @JsonProperty("trafficLevelName")
    public void setTrafficLevelName(String trafficLevelName) {
        this.trafficLevelName = trafficLevelName;
    }

    @JsonProperty("trafficFiltering")
    public String getTrafficFiltering() {
        return trafficFiltering;
    }

    @JsonProperty("trafficFiltering")
    public void setTrafficFiltering(String trafficFiltering) {
        this.trafficFiltering = trafficFiltering;
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
    public String getRecordMode() {
        return recordMode;
    }

    @JsonIgnore
    public void setRecordMode(String recordMode) {
        this.recordMode = recordMode;
    }
}

package com.cisco.configService.model.multicast;

import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SnmpPollMulticastCollector extends ConfigParams {

    private Long id;

    private Integer timeout = 60;

    private Integer noOfSamples = 1;

    private Integer pollingInterval = 300;

    private String trafficLevelName;

    private String trafficFiltering;

    private RecordMode netRecorder = RecordMode.OFF;

    private Integer verbosity = 30;

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

    @JsonProperty("netRecorder")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("netRecorder")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 30 : verbosity;
    }
}

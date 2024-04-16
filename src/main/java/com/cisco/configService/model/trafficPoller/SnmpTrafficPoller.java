package com.cisco.configService.model.trafficPoller;

import com.cisco.configService.model.common.Debug;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnmpTrafficPoller {

    @JsonProperty("minWindowLengthStats")
    private Integer minWindowLengthStats = 300;

    @JsonProperty("maxWindowLengthStats")
    private Integer maxWindowLengthStats = 450;

    @JsonProperty("rawCounterTTL")
    private Integer rawCounterTTL = 15;

    @JsonProperty("discardOverCapacity")
    private Boolean discardOverCapacity = true;

    @JsonProperty("logFile")
    private String logFile;

    @JsonProperty("netRecorderFileMaxSize")
    private Integer netRecorderFileMaxSize = 1000;

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @JsonProperty("minWindowLengthStats")
    public Integer getMinWindowLengthStats() {
        return minWindowLengthStats;
    }

    @JsonProperty("minWindowLengthStats")
    public void setMinWindowLengthStats(Integer minWindowLengthStats) {
        this.minWindowLengthStats = minWindowLengthStats == null ? 300 : minWindowLengthStats;
    }

    @JsonProperty("maxWindowLengthStats")
    public Integer getMaxWindowLengthStats() {
        return maxWindowLengthStats;
    }

    @JsonProperty("maxWindowLengthStats")
    public void setMaxWindowLengthStats(Integer maxWindowLengthStats) {
        this.maxWindowLengthStats = maxWindowLengthStats == null ? 450 : maxWindowLengthStats;
    }

    @JsonProperty("rawCounterTTL")
    public Integer getRawCounterTTL() {
        return rawCounterTTL;
    }

    @JsonProperty("rawCounterTTL")
    public void setRawCounterTTL(Integer rawCounterTTL) {
        this.rawCounterTTL = rawCounterTTL == null ? 15: rawCounterTTL;
    }

    @JsonProperty("discardOverCapacity")
    public Boolean getDiscardOverCapacity() {
        return discardOverCapacity;
    }

    @JsonProperty("discardOverCapacity")
    public void setDiscardOverCapacity(Boolean discardOverCapacity) {
        this.discardOverCapacity = discardOverCapacity == null || discardOverCapacity;
    }

    @JsonProperty("logFile")
    public String getLogFile() {
        return logFile;
    }

    @JsonProperty("logFile")
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    @JsonProperty("netRecorderFileMaxSize")
    public Integer getNetRecorderFileMaxSize() {
        return netRecorderFileMaxSize;
    }

    @JsonProperty("netRecorderFileMaxSize")
    public void setNetRecorderFileMaxSize(Integer netRecorderFileMaxSize) {
        this.netRecorderFileMaxSize = netRecorderFileMaxSize == null ? 1000 : netRecorderFileMaxSize;
    }

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }


}

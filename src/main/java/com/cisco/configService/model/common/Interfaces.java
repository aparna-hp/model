
package com.cisco.configService.model.common;


import com.cisco.configService.enums.RecordMode;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Interfaces {

    public enum IpGuessing {
        SAFE, FULL, OFF
    }

    public enum LagPortMatch {
        GUESS, EXACT, COMPLETE, NONE
    }

    private Boolean findParallelLinks = false;

    private IpGuessing ipGuessing = IpGuessing.SAFE;

    private boolean discoverLags = false;

    private LagPortMatch lagPortMatch = LagPortMatch.GUESS;

    private Boolean circuitCleanup = false;

    private Boolean copyDescription = false;

    private Boolean collectPhysicalPort = false;

    private Integer minIPGuessPrefixLength = 0;

    private Integer minPrefixLength = 30;

    private Integer timeout = 60;

    private Integer verbosity = 30;

    private RecordMode netRecorder = RecordMode.OFF;

    @JsonProperty("findParallelLinks")
    public Boolean getFindParallelLinks() {
        return findParallelLinks;
    }

    @JsonProperty("findParallelLinks")
    public void setFindParallelLinks(Boolean findParallelLinks) {
        this.findParallelLinks = findParallelLinks != null && findParallelLinks;
    }

    @JsonProperty("ipGuessing")
    public IpGuessing getIpGuessing() {
        return ipGuessing;
    }

    @JsonProperty("ipGuessing")
    public void setIpGuessing(IpGuessing ipGuessing) {
        this.ipGuessing = ipGuessing == null ? IpGuessing.SAFE : ipGuessing;
    }

    @JsonProperty("discoverLags")
    public Boolean getDiscoverLags() {
        return discoverLags;
    }

    @JsonProperty("discoverLags")
    public void setDiscoverLags(Boolean discoverLags) {
        this.discoverLags = discoverLags != null && discoverLags;
    }

    @JsonProperty("lagPortMatch")
    public LagPortMatch getLagPortMatch() {
        return lagPortMatch;
    }

    @JsonProperty("lagPortMatch")
    public void setLagPortMatch(LagPortMatch lagPortMatch) {
        this.lagPortMatch = lagPortMatch == null ? LagPortMatch.GUESS : lagPortMatch;
    }

    @JsonProperty("circuitCleanup")
    public Boolean getCircuitCleanup() {
        return circuitCleanup;
    }

    @JsonProperty("circuitCleanup")
    public void setCircuitCleanup(Boolean circuitCleanup) {
        this.circuitCleanup = circuitCleanup != null && circuitCleanup;
    }

    @JsonProperty("copyDescription")
    public Boolean getCopyDescription() {
        return copyDescription;
    }

    @JsonProperty("copyDescription")
    public void setCopyDescription(Boolean copyDescription) {
        this.copyDescription = copyDescription != null && copyDescription;
    }

    @JsonProperty("collectPhysicalPort")
    public Boolean getCollectPhysicalPort() {
        return collectPhysicalPort;
    }

    @JsonProperty("collectPhysicalPort")
    public void setCollectPhysicalPort(Boolean collectPhysicalPort) {
        this.collectPhysicalPort = collectPhysicalPort != null && collectPhysicalPort;
    }

    @JsonProperty("minIPGuessPrefixLength")
    public Integer getMinIPGuessPrefixLength() {
        return minIPGuessPrefixLength;
    }

    @JsonProperty("minIPGuessPrefixLength")
    public void setMinIPGuessPrefixLength(Integer minIPGuessPrefixLength) {
        this.minIPGuessPrefixLength = minIPGuessPrefixLength == null ? 0 : minIPGuessPrefixLength;
    }

    @JsonProperty("minPrefixLength")
    public Integer getMinPrefixLength() {
        return minPrefixLength;
    }

    @JsonProperty("minPrefixLength")
    public void setMinPrefixLength(Integer minPrefixLength) {
        this.minPrefixLength = minPrefixLength == null ? 30 : minPrefixLength;
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

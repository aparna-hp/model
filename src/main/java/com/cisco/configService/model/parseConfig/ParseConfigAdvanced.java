package com.cisco.configService.model.parseConfig;

import com.cisco.configService.model.common.Interfaces;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParseConfigAdvanced {

    public enum CircuitMatch {
        SAME_IGP, ALL
    }

    CircuitMatch circuitMatch = CircuitMatch.SAME_IGP;

    Interfaces.LagPortMatch lagPortMatch = Interfaces.LagPortMatch.GUESS;

    private List<Integer> ospfProcessIds = new ArrayList<>();

    private List<Integer> isisProcessIds = new ArrayList<>();

    Integer selectLoopBackInt = 0;

    Boolean resolveReferences = true;

    Boolean useMultiThreading = false;

    Boolean filterShowCommands = false;

    Boolean buildTopology = true;

    Boolean sharedMedia = true;

    List<Map<String, String>> advancedToolOptions = new ArrayList<>();

    @JsonProperty("timeout")
    private Integer timeout = 60;

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

    @JsonProperty("circuitMatch")
    public CircuitMatch getCircuitMatch() {
        return circuitMatch;
    }

    @JsonProperty("circuitMatch")
    public void setCircuitMatch(CircuitMatch circuitMatch) {
        this.circuitMatch = circuitMatch == null ? CircuitMatch.SAME_IGP : circuitMatch;
    }

    @JsonProperty("lagPortMatch")
    public Interfaces.LagPortMatch getLagPortMatch() {
        return lagPortMatch;
    }

    @JsonProperty("lagPortMatch")
    public void setLagPortMatch(Interfaces.LagPortMatch lagPortMatch) {
        this.lagPortMatch = lagPortMatch == null ? Interfaces.LagPortMatch.GUESS : lagPortMatch;
    }

    @JsonProperty("ospfProcessIds")
    public List<Integer> getOspfProcessIds() {
        return ospfProcessIds;
    }

    @JsonProperty("ospfProcessIds")
    public void setOspfProcessIds(List<Integer> ospfProcessIds) {
        this.ospfProcessIds = ospfProcessIds;
    }

    @JsonProperty("isisProcessIds")
    public List<Integer> getIsisProcessIds() {
        return isisProcessIds;
    }

    @JsonProperty("isisProcessIds")
    public void setIsisProcessIds(List<Integer> isisProcessIds) {
        this.isisProcessIds = isisProcessIds;
    }

    @JsonProperty("selectLoopBackInt")
    public Integer getSelectLoopBackInt() {
        return selectLoopBackInt;
    }

    @JsonProperty("selectLoopBackInt")
    public void setSelectLoopBackInt(Integer selectLoopBackInt) {
        this.selectLoopBackInt = selectLoopBackInt == null ? 0 : selectLoopBackInt;
    }

    @JsonProperty("resolveReferences")
    public Boolean getResolveReferences() {
        return resolveReferences;
    }

    @JsonProperty("resolveReferences")
    public void setResolveReferences(Boolean resolveReferences) {
        this.resolveReferences = resolveReferences == null || resolveReferences;
    }

    @JsonProperty("useMultiThreading")
    public Boolean getUseMultiThreading() {
        return useMultiThreading;
    }

    @JsonProperty("useMultiThreading")
    public void setUseMultiThreading(Boolean useMultiThreading) {
        this.useMultiThreading = useMultiThreading != null && useMultiThreading;
    }

    @JsonProperty("filterShowCommands")
    public Boolean getFilterShowCommands() {
        return filterShowCommands;
    }

    @JsonProperty("filterShowCommands")
    public void setFilterShowCommands(Boolean filterShowCommands) {
        this.filterShowCommands = filterShowCommands != null && filterShowCommands;
    }

    @JsonProperty("buildTopology")
    public Boolean getBuildTopology() {
        return buildTopology;
    }

    @JsonProperty("buildTopology")
    public void setBuildTopology(Boolean buildTopology) {
        this.buildTopology = buildTopology == null || buildTopology;
    }

    @JsonProperty("sharedMedia")
    public Boolean getSharedMedia() {
        return sharedMedia;
    }

    @JsonProperty("sharedMedia")
    public void setSharedMedia(Boolean sharedMedia) {
        this.sharedMedia = sharedMedia == null || sharedMedia;
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

    @JsonProperty("advancedToolOptions")
    public List<Map<String, String>> getAdvancedToolOptions() {
        return advancedToolOptions;
    }

    @JsonProperty("advancedToolOptions")
    public void setAdvancedToolOptions(List<Map<String, String>> advancedToolOptions) {
        this.advancedToolOptions = advancedToolOptions;
    }
}

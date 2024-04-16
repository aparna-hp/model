package com.cisco.configService.model.demand;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DemandMeshAdvanced {

    public enum ExternalMesh {
        RESPECT, OVERRIDE
    }

    @JsonProperty("sourceList")
    private List<String> sourceList;

    @JsonProperty("sourceNodes")
    private String sourceNodes;

    @JsonProperty("sourceSites")
    private String sourceSites;

    @JsonProperty("sourceAs")
    private String sourceAs;

    @JsonProperty("sourceEndpoints")
    private String sourceEndpoints;

    @JsonProperty("destNodes")
    private String destNodes;

    @JsonProperty("destSites")
    private String destSites;

    @JsonProperty("destAs")
    private String destAs;

    @JsonProperty("destEndpoints")
    private String destEndpoints;

    @JsonProperty("demandmeshTable")
    private String demandmeshTable;

    @JsonProperty("outDemandmeshTable")
    private String outDemandmeshTable;

    @JsonProperty("outDemandsTable")
    private String outDemandsTable;

    @JsonProperty("externalAsInterfaceEndpoints")
    private Boolean externalAsInterfaceEndpoints = true;

    @JsonProperty("respectAsRelationships")
    private Boolean respectAsRelationships = true;

    @JsonProperty("externalMesh")
    private ExternalMesh externalMesh = ExternalMesh.RESPECT;

    @JsonProperty("setName")
    private String setName;

    @JsonProperty("setTagList")
    private String setTagList;

    @JsonProperty("optionsFile")
    private String optionsFile;

    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @JsonProperty("destEqualSource")
    private Boolean destEqualSource = false;

    @JsonProperty("destList")
    private List<String> destList;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("includeDemandToSelf")
    private Boolean includeDemandToSelf = true;

    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

    @JsonProperty("sourceList")
    public List<String> getSourceList() {
        return sourceList;
    }

    @JsonProperty("sourceList")
    public void setSourceList(List<String> sourceList) {
        this.sourceList = sourceList;
    }

    @JsonProperty("sourceNodes")
    public String getSourceNodes() {
        return sourceNodes;
    }

    @JsonProperty("sourceNodes")
    public void setSourceNodes(String sourceNodes) {
        this.sourceNodes = sourceNodes;
    }

    @JsonProperty("sourceSites")
    public String getSourceSites() {
        return sourceSites;
    }

    @JsonProperty("sourceSites")
    public void setSourceSites(String sourceSites) {
        this.sourceSites = sourceSites;
    }

    @JsonProperty("sourceAs")
    public String getSourceAs() {
        return sourceAs;
    }

    @JsonProperty("sourceAs")
    public void setSourceAs(String sourceAs) {
        this.sourceAs = sourceAs;
    }

    @JsonProperty("sourceEndpoints")
    public String getSourceEndpoints() {
        return sourceEndpoints;
    }

    @JsonProperty("sourceEndpoints")
    public void setSourceEndpoints(String sourceEndpoints) {
        this.sourceEndpoints = sourceEndpoints;
    }

    @JsonProperty("destNodes")
    public String getDestNodes() {
        return destNodes;
    }

    @JsonProperty("destNodes")
    public void setDestNodes(String destNodes) {
        this.destNodes = destNodes;
    }

    @JsonProperty("destSites")
    public String getDestSites() {
        return destSites;
    }

    @JsonProperty("destSites")
    public void setDestSites(String destSites) {
        this.destSites = destSites;
    }

    @JsonProperty("destAs")
    public String getDestAs() {
        return destAs;
    }

    @JsonProperty("destAs")
    public void setDestAs(String destAs) {
        this.destAs = destAs;
    }

    @JsonProperty("destEndpoints")
    public String getDestEndpoints() {
        return destEndpoints;
    }

    @JsonProperty("destEndpoints")
    public void setDestEndpoints(String destEndpoints) {
        this.destEndpoints = destEndpoints;
    }

    @JsonProperty("demandmeshTable")
    public String getDemandmeshTable() {
        return demandmeshTable;
    }

    @JsonProperty("demandmeshTable")
    public void setDemandmeshTable(String demandmeshTable) {
        this.demandmeshTable = demandmeshTable;
    }

    @JsonProperty("outDemandmeshTable")
    public String getOutDemandmeshTable() {
        return outDemandmeshTable;
    }

    @JsonProperty("outDemandmeshTable")
    public void setOutDemandmeshTable(String outDemandmeshTable) {
        this.outDemandmeshTable = outDemandmeshTable;
    }

    @JsonProperty("outDemandsTable")
    public String getOutDemandsTable() {
        return outDemandsTable;
    }

    @JsonProperty("outDemandsTable")
    public void setOutDemandsTable(String outDemandsTable) {
        this.outDemandsTable = outDemandsTable;
    }

    @JsonProperty("externalAsInterface-endpoints")
    public Boolean getExternalAsInterfaceEndpoints() {
        return externalAsInterfaceEndpoints;
    }

    @JsonProperty("externalAsInterface-endpoints")
    public void setExternalAsInterfaceEndpoints(Boolean externalASInterfaceEndpoints) {
        this.externalAsInterfaceEndpoints = externalASInterfaceEndpoints == null || externalASInterfaceEndpoints;
    }

    public Boolean getRespectAsRelationships() {
        return respectAsRelationships;
    }

    public void setRespectAsRelationships(Boolean respectAsRelationships) {
        this.respectAsRelationships = respectAsRelationships == null || respectAsRelationships;
    }

    public ExternalMesh getExternalMesh() {
        return externalMesh;
    }

    public void setExternalMesh(ExternalMesh externalMesh) {
        this.externalMesh = externalMesh == null ? ExternalMesh.RESPECT : externalMesh;
    }

    @JsonProperty("setName")
    public String getSetName() {
        return setName;
    }

    @JsonProperty("setName")
    public void setSetName(String setName) {
        this.setName = setName;
    }

    @JsonProperty("setTagList")
    public String getSetTagList() {
        return setTagList;
    }

    @JsonProperty("setTagList")
    public void setSetTagList(String setTagList) {
        this.setTagList = setTagList;
    }

    @JsonProperty("optionsFile")
    public String getOptionsFile() {
        return optionsFile;
    }

    @JsonProperty("optionsFile")
    public void setOptionsFile(String optionsFile) {
        this.optionsFile = optionsFile;
    }

    @JsonProperty("noGlobalOptions")
    public Boolean getNoGlobalOptions() {
        return noGlobalOptions;
    }

    @JsonProperty("noGlobalOptions")
    public void setNoGlobalOptions(Boolean noGlobalOptions) {
        this.noGlobalOptions = noGlobalOptions != null && noGlobalOptions;
    }

    @JsonProperty("destEqualSource")
    public Boolean getDestEqualSource() {
        return destEqualSource;
    }

    @JsonProperty("destEqualSource")
    public void setDestEqualSource(Boolean destEqualSource) {
        this.destEqualSource = destEqualSource != null && destEqualSource;
    }

    @JsonProperty("destList")
    public List<String> getDestList() {
        return destList;
    }

    @JsonProperty("destList")
    public void setDestList(List<String> destList) {
        this.destList = destList;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("includeDemandToSelf")
    public Boolean getIncludeDemandToSelf() {
        return includeDemandToSelf;
    }

    @JsonProperty("includeDemandToSelf")
    public void setIncludeDemandToSelf(Boolean includeDemandToSelf) {
        this.includeDemandToSelf = includeDemandToSelf == null || includeDemandToSelf;
    }

    @JsonProperty("suppressProgress")
    public Boolean getSuppressProgress() {
        return suppressProgress;
    }

    @JsonProperty("suppressProgress")
    public void setSuppressProgress(Boolean suppressProgress) {
        this.suppressProgress = suppressProgress != null && suppressProgress;
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

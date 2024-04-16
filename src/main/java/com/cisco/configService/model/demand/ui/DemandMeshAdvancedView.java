package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.demand.DemandMeshAdvanced;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandMeshAdvancedView {

    @XmlElement(name = "source-list", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("sourceList")
    private List<String> sourceList;

    @XmlElement(name = "source-nodes", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("sourceNodes")
    private String sourceNodes;

    @XmlElement(name = "source-sites", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("sourceSites")
    private String sourceSites;

    @XmlElement(name = "source-as", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("sourceAs")
    private String sourceAs;

    @XmlElement(name = "source-endpoints", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("sourceEndpoints")
    private String sourceEndpoints;

    @XmlElement(name = "dest-nodes", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destNodes")
    private String destNodes;

    @XmlElement(name = "dest-sites", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destSites")
    private String destSites;

    @XmlElement(name = "dest-as", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destAs")
    private String destAs;

    @XmlElement(name = "dest-endpoints", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destEndpoints")
    private String destEndpoints;

    @XmlElement(name = "demandmesh-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("demandmesh-table")
    private String demandmeshTable;

    @XmlElement(name = "out-demandmesh-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("outDemandmeshTable")
    private String outDemandmeshTable;

    @XmlElement(name = "out-demands-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("outDemandsTable")
    private String outDemandsTable;

    @XmlElement(name = "external-AS-interface-endpoints", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("externalAsInterfaceEndpoints")
    private Boolean externalAsInterfaceEndpoints = true;

    @XmlElement(name = "respect-as-Relationships", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("respectAsRelationships")
    private Boolean respectAsRelationships = true;

    @XmlElement(name = "external-mesh", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("externalMesh")
    private DemandMeshAdvanced.ExternalMesh externalMesh = DemandMeshAdvanced.ExternalMesh.RESPECT;

    @XmlElement(name = "set-name", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("setName")
    private String setName;

    @XmlElement(name = "set-tag-list", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("setTagList")
    private String setTagList;

    @XmlElement(name = "options-file", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("optionsFile")
    private String optionsFile;

    @XmlElement(name = "no-global-options", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @XmlElement(name = "dest-equal-source", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destEqualSource")
    private Boolean destEqualSource = false;

    @XmlElement(name = "dest-list", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destList")
    private List<String> destList;

    @XmlElement(name = "destination", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("destination")
    private String destination;

    @XmlElement(name = "include-demand-to-self", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("includeDemandToSelf")
    private Boolean includeDemandToSelf = true;

    @XmlElement(name = "suppress-progress", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @XmlElement(name = "verbosity", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonIgnore
    private Integer verbosity;

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

    public DemandMeshAdvanced.ExternalMesh getExternalMesh() {
        return externalMesh;
    }

    public void setExternalMesh(DemandMeshAdvanced.ExternalMesh externalMesh) {
        this.externalMesh = externalMesh == null ? DemandMeshAdvanced.ExternalMesh.RESPECT : externalMesh;
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

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonIgnore
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }

}

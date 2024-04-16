package com.cisco.collectionService.model.srPce.topo.node;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcFlexAlgorithms {
    private String nodeIdentifier;
    // Link-state node identifier
    @JsonProperty("igp-id")
    private String igpId; // ISIS, OSPF

    @JsonProperty("system-id")
    private String systemId;
    @JsonProperty("level")
    private String level; // when igp-id = isis

    @JsonProperty("router-id")
    private String routerId;
    @JsonProperty("area")
    private String area; // when igp-id = ospf

    private String algosParticipation; // Algos participated by this node
    @JsonProperty("domain-identifier")
    private String domainIdentifier;

    // grouping PCE-FA-DEFINITION description "Flex-algo definition";
    @JsonProperty("number")
    private String number; // Flex-Algo Number
    @JsonProperty("local-priority")
    private String localPriority;

    /*
     * Metric Type possible ENUMS and their values.. metric-type-none, value
     * metric-type-igp, value 1; metric-type-te, value 2; metric-type-hop-count,
     * value 3 metric-type-msd, value 11 metric-type-latency, value 12
     */
    @JsonProperty("metric-type")
    private String metricType;
    @JsonProperty("affinity-exclude-any")
    private String affinityExcludeAny;
    @JsonProperty("affinity-include-any")
    private String affinityIncludeAny;
    @JsonProperty("affinity-include-all")
    private String affinityIncludeAll;

    public String getIgpId() {
        return igpId;
    }

    public void setIgpId(String igpId) {
        this.igpId = igpId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocalPriority() {
        return localPriority;
    }

    public void setLocalPriority(String localPriority) {
        this.localPriority = localPriority;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getAffinityExcludeAny() {
        return affinityExcludeAny;
    }

    public void setAffinityExcludeAny(String affinityExcludeAny) {
        this.affinityExcludeAny = affinityExcludeAny;
    }

    public String getAffinityIncludeAny() {
        return affinityIncludeAny;
    }

    public void setAffinityIncludeAny(String affinityIncludeAny) {
        this.affinityIncludeAny = affinityIncludeAny;
    }

    public String getAffinityIncludeAll() {
        return affinityIncludeAll;
    }

    public void setAffinityIncludeAll(String affinityIncludeAll) {
        this.affinityIncludeAll = affinityIncludeAll;
    }

    public String getDomainIdentifier() {
        return domainIdentifier;
    }

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getAlgosParticipation() {
        return algosParticipation;
    }

    public void setAlgosParticipation(String algosParticipation) {
        this.algosParticipation = algosParticipation;
    }

    public String getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(String nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    @Override
    public String toString() {
        return "NetIntXtcFlexAlgorithms{" + "nodeIdentifier='" + nodeIdentifier + '\'' + ", igpId='" + igpId + '\''
                + ", systemId='" + systemId + '\'' + ", level='" + level + '\'' + ", routerId='" + routerId + '\''
                + ", area='" + area + '\'' + ", algosParticipation='" + algosParticipation + '\''
                + ", domainIdentifier='" + domainIdentifier + '\'' + ", number='" + number + '\'' + ", localPriority='"
                + localPriority + '\'' + ", metricType='" + metricType + '\'' + ", affinityExcludeAny='"
                + affinityExcludeAny + '\'' + ", affinityIncludeAny='" + affinityIncludeAny + '\''
                + ", affinityIncludeAll='" + affinityIncludeAll + '\'' + '}';
    }
}

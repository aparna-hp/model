package com.cisco.collectionService.model.srPce.topo.node;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcIGPSRGBInfo {
    private String nodeIdentifier;

    private String isLinkState;
    @JsonProperty("igp-id")
    private String igpId;// ENUM(ISIS,OSPF, BGP)
    @JsonProperty("system-id")
    private String isisSystemId;
    @JsonProperty("level")
    private String isIsLevel;
    private String ospfRouterId;
    @JsonProperty("area")
    private String ospfArea;
    private String bgpRouterId;
    @JsonProperty("confed-asn")
    private String confederationAsn;// bgp info
    @JsonProperty("ls-identifier")
    private String lsIdentifier;
    @JsonProperty("start")
    private String start;
    @JsonProperty("size")
    private String size;
    @JsonProperty("domain-identifier")
    private String domainIdentifier;
    @JsonProperty("autonomous-system-number")
    private String asn;

    public String getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(String nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public String getIsLinkState() {
        return isLinkState;
    }

    public void setIsLinkState(String isLinkState) {
        this.isLinkState = isLinkState;
    }

    public String getIgpId() {
        return igpId;
    }

    public void setIgpId(String igpId) {
        this.igpId = igpId;
    }

    public String getIsisSystemId() {
        return isisSystemId;
    }

    public void setIsisSystemId(String isisSystemId) {
        this.isisSystemId = isisSystemId;
    }

    public String getIsIsLevel() {
        return isIsLevel;
    }

    public void setIsIsLevel(String isIsLevel) {
        this.isIsLevel = isIsLevel;
    }

    public String getOspfRouterId() {
        return ospfRouterId;
    }

    public void setOspfRouterId(String ospfRouterId) {
        this.ospfRouterId = ospfRouterId;
    }

    public String getOspfArea() {
        return ospfArea;
    }

    public void setOspfArea(String ospfArea) {
        this.ospfArea = ospfArea;
    }

    public String getBgpRouterId() {
        return bgpRouterId;
    }

    public void setBgpRouterId(String bgpRouterId) {
        this.bgpRouterId = bgpRouterId;
    }

    public String getConfederationAsn() {
        return confederationAsn;
    }

    public void setConfederationAsn(String confederationAsn) {
        this.confederationAsn = confederationAsn;
    }

    public String getLsIdentifier() {
        return lsIdentifier;
    }

    public void setLsIdentifier(String lsIdentifier) {
        this.lsIdentifier = lsIdentifier;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDomainIdentifier() {
        return domainIdentifier;
    }

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    @Override
    public String toString() {
        return "NetIntXtcIGPSRGBInfo{" + "nodeIdentifier='" + nodeIdentifier + '\'' + ", isLinkState='" + isLinkState
                + '\'' + ", igpId='" + igpId + '\'' + ", isisSystemId='" + isisSystemId + '\'' + ", isIsLevel='"
                + isIsLevel + '\'' + ", ospfRouterId='" + ospfRouterId + '\'' + ", ospfArea='" + ospfArea + '\''
                + ", bgpRouterId='" + bgpRouterId + '\'' + ", confederationAsn='" + confederationAsn + '\''
                + ", lsIdentifier='" + lsIdentifier + '\'' + ", start='" + start + '\'' + ", size='" + size + '\''
                + ", domainIdentifier='" + domainIdentifier + '\'' + ", asn='" + asn + '\'' + '}';
    }

    public enum IGP_ID {
        isis, bgp, ospf
    }
}

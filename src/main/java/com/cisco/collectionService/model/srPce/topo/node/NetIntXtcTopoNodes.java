package com.cisco.collectionService.model.srPce.topo.node;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcTopoNodes {

    @JsonProperty("node-identifier")
    private String nodeIdentifier;// KEY

    @JsonProperty("node-name")
    private String nodeName;
    @JsonProperty("ipv4bgp-router-id-set")
    private String ipv4bgpRouterIdSet;
    @JsonProperty("ipv4bgp-router-id")
    private String ipv4bgpRouterId;
    @JsonProperty("ipv4te-router-id-set")
    private String ipv4teRouterIdSet;
    @JsonProperty("ipv4te-router-id")
    private String ipv4teRouterId;
    @JsonProperty("ipv6-router-id-set")
    private String ipv6RouterIdSet;
    @JsonProperty("ipv6-router-id")
    private String ipv6RouterId;
    @JsonProperty("common-ipv4-router-id")
    private String commonIpv4RouterId;
    @JsonProperty("system-id")
    private String systemId;
    @JsonProperty("node-identifier-xr")
    private String nodeIdentifierXr;
    @JsonProperty("overload")
    private String overload;

    public String getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(String nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getIpv4bgpRouterIdSet() {
        return ipv4bgpRouterIdSet;
    }

    public void setIpv4bgpRouterIdSet(String ipv4bgpRouterIdSet) {
        this.ipv4bgpRouterIdSet = ipv4bgpRouterIdSet;
    }

    public String getIpv4bgpRouterId() {
        return ipv4bgpRouterId;
    }

    public void setIpv4bgpRouterId(String ipv4bgpRouterId) {
        this.ipv4bgpRouterId = ipv4bgpRouterId;
    }

    public String getIpv4teRouterIdSet() {
        return ipv4teRouterIdSet;
    }

    public void setIpv4teRouterIdSet(String ipv4teRouterIdSet) {
        this.ipv4teRouterIdSet = ipv4teRouterIdSet;
    }

    public String getIpv4teRouterId() {
        return ipv4teRouterId;
    }

    public void setIpv4teRouterId(String ipv4teRouterId) {
        this.ipv4teRouterId = ipv4teRouterId;
    }

    public String getCommonIpv4RouterId() {
        return commonIpv4RouterId;
    }

    public void setCommonIpv4RouterId(String commonIpv4RouterId) {
        this.commonIpv4RouterId = commonIpv4RouterId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getNodeIdentifierXr() {
        return nodeIdentifierXr;
    }

    public void setNodeIdentifierXr(String nodeIdentifierXr) {
        this.nodeIdentifierXr = nodeIdentifierXr;
    }

    public String getOverload() {
        return overload;
    }

    public void setOverload(String overload) {
        this.overload = overload;
    }

    public String getIpv6RouterIdSet() {
        return ipv6RouterIdSet;
    }

    public void setIpv6RouterIdSet(String ipv6RouterIdSet) {
        this.ipv6RouterIdSet = ipv6RouterIdSet;
    }

    public String getIpv6RouterId() {
        return ipv6RouterId;
    }

    public void setIpv6RouterId(String ipv6RouterId) {
        this.ipv6RouterId = ipv6RouterId;
    }

    @Override
    public String toString() {
        return "NetIntXtcTopoNodes{" + "NodeIdentifier='" + nodeIdentifier + '\'' + ", nodeName='" + nodeName + '\''
                + '}';
    }
}

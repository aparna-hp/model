package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcLinkRemoteNodePID {

    @JsonProperty("node-name")
    private String remoteNodeName;
    @JsonProperty("igp-id")
    private String remoteIgpId;
    @JsonProperty("ipv4te-router-id")
    private String remoteIpv4teRouterId;
    @JsonProperty("ipv4bgp-router-id")
    private String remoteIpv4bgpRouterId;
    @JsonProperty("system-id")
    private String remoteIsisSystemId;
    @JsonProperty("router-id")
    private String remoteOspfRouterId;
    @JsonProperty("ipv4te-router-id-set")
    private String remoteIpv4teRouterIdSet;
    @JsonProperty("ipv4bgp-router-id-set")
    private String remoteIpv4bgpRouterIdSet;

    @Override
    public String toString() {
        return "NetIntXtcLinkRemoteNodePID{" + "remoteNodeName='" + remoteNodeName + '\'' + ", remoteIgpId='" + remoteIgpId + '\'' + ", remoteIpv4teRouterId='" + remoteIpv4teRouterId + '\'' + ", remoteIpv4bgpRouterId='" + remoteIpv4bgpRouterId + '\'' + ", remoteIsisSystemId='" + remoteIsisSystemId + '\'' + ", remoteOspfRouterId='" + remoteOspfRouterId + '\'' + ", remoteIpv4teRouterIdSet='" + remoteIpv4teRouterIdSet + '\'' + ", remoteIpv4bgpRouterIdSet='" + remoteIpv4bgpRouterIdSet + '\'' + '}';
    }

}

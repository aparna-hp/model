package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcLinkKey {
    private String LinkIdentifier;
    private String nodeIdentifier;
    @JsonProperty("local-ipv4-address")
    private String localIpv4Address;
    @JsonProperty("remote-ipv4-address")
    private String remoteIpv4Address;
    @JsonProperty("local-ipv6-address")
    private String localIpv6Address;
    @JsonProperty("remote-ipv6-address")
    private String remoteIpv6Address;

    @Override
    public String toString() {
        return "NetIntXtcLinkKey{" + "LinkIdentifier=" + LinkIdentifier + ", nodeIdentifier='" + nodeIdentifier + '\'' + ", localIpv4Address='" + localIpv4Address + '\'' + ", remoteIpv4Address='" + remoteIpv4Address + '\'' + ", localIpv6Address='" + localIpv6Address + '\'' + ", remoteIpv6Address='" + remoteIpv6Address + '\'' + '}';
    }
}

package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcLinkLocalIGPInfo {

    @JsonProperty("igp-id")
    private String localIgpId;

    //when "../igp-id = 'isis'"
    @JsonProperty("system-id")
    private String localIsisSystemId;
    @JsonProperty("level")
    private String localIsisLevel;
    @JsonProperty("area-id") //area-address
    private String areaId;

    //when "../igp-id = 'ospf'"
    private String localOspfRouterId;
    @JsonProperty("area")
    private String localOspfArea;

    //when "../igp-id = 'bgp'"
    private String localIpv4BgpRouterId;
    @JsonProperty("confed-asn")
    private String confedASN;


    @JsonProperty("domain-identifier")
    private String localDomainIdentifier;

    @JsonProperty("autonomous-system-number")
    private String localASN;

    @Override
    public String toString() {
        return "NetIntXTCLinkLocalIGPInfo{" + "localIgpId='" + localIgpId + '\'' + ", localIsisSystemId='"
                + localIsisSystemId + '\'' + ", localIsisLevel='" + localIsisLevel + '\'' + ", localOspfRouterId='"
                + '\'' + ", localOspfArea='" + localOspfArea + '\'' + ", localIpv4BgpRouterId='"
                + localIpv4BgpRouterId + '\'' + ", localDomainIdentifier='" + localDomainIdentifier + '\''
                + ", localASN='" + localASN + '\'' + '}';
    }
}

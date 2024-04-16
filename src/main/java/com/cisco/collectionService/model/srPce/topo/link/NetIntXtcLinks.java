package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcLinks {
    private String nodeIdentifier;
    private String linkIdentifier;
    @JsonProperty("unidirectional-min-delay")
    private String unidirectionalMinDelay;
    @JsonProperty("te-metric")
    private String teMetric;
    @JsonProperty("igp-metric")
    private String igpMetric;
    @JsonProperty("maximum-link-bandwidth")
    private String maximumLinkBandwidth;
    @JsonProperty("max-reservable-bandwidth")
    private String maxReservableBandwidth;
    @JsonProperty("administrative-groups")
    private String administrativeGroups;
    @JsonProperty("flex-algo-asla-administrative-group")
    private String flexAlgoAslaAdminGroups; // Flex-algo specific Link Extended admin-groups
    @JsonProperty("srlgs")
    private String srlgs;

    private String remoteNodeName;
    private NetIntXtcLinkLocalIGPInfo localIGPInfo;

    @Override
    public String toString() {
        return "NetIntXtcLinks{" +
                "nodeIdentifier='" + nodeIdentifier + '\'' +
                ", linkIdentifier=" + linkIdentifier +
                ", unidirectionalMinDelay='" + unidirectionalMinDelay + '\'' +
                ", teMetric='" + teMetric + '\'' +
                ", igpMetric='" + igpMetric + '\'' +
                ", maximumLinkBandwidth='" + maximumLinkBandwidth + '\'' +
                ", maxReservableBandwidth='" + maxReservableBandwidth + '\'' +
                ", administrativeGroups='" + administrativeGroups + '\'' +
                ", flexAlgoAslaAdminGroups='" + flexAlgoAslaAdminGroups + '\'' +
                ", srlgs='" + srlgs + '\'' +
                ", localIGPInfo=" + localIGPInfo +
                '}';
    }
}

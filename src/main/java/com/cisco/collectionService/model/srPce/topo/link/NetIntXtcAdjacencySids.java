package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcAdjacencySids {
    private String nodeIdentifier;
    private String linkIdentifier;
    @JsonProperty("af-name")
    private String afName;// AFName:none(0), ipv4(1), ipv6(2)
    @JsonProperty("ipv4")
    private String ipv4Address;// IPv4 address, Set based on AFName
    @JsonProperty("ipv6")
    private String ipv6Address;// IPv6 address,Set based on AFName
    @JsonProperty("sid-type")
    private String sidType;
    @JsonProperty("mpls-label")
    private String mplsLabel;
    @JsonProperty("domain-identifier")
    private String domainIdentifier;
    @JsonProperty("algorithm")
    private String algorithm;// SID algorithm number
    @JsonProperty("rflag")
    private String Rflag;
    @JsonProperty("nflag")
    private String Nflag;
    @JsonProperty("pflag")
    private String Pflag;
    @JsonProperty("eflag")
    private String Eflag;
    @JsonProperty("vflag")
    private String Vflag;
    @JsonProperty("lflag")
    private String Lflag;


    @Override
    public String toString() {
        return "NetIntXtcAdjacencySids{" + "nodeIdentifier='" + nodeIdentifier + '\'' + ", linkIdentifier=" + linkIdentifier + ", afName='" + afName + '\'' + ", ipv4Address='" + ipv4Address + '\'' + ", ipv6Address='" + ipv6Address + '\'' + ", sidType='" + sidType + '\'' + ", mplsLabel='" + mplsLabel + '\'' + ", domainIdentifier='" + domainIdentifier + '\'' + ", algorithm='" + algorithm + '\'' + ", Rflag='" + Rflag + '\'' + ", Nflag='" + Nflag + '\'' + ", Pflag='" + Pflag + '\'' + ", Eflag='" + Eflag + '\'' + ", Vflag='" + Vflag + '\'' + ", Lflag='" + Lflag + '\'' + '}';
    }
}
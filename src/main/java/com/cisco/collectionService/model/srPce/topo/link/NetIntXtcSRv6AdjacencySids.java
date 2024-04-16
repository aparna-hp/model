package com.cisco.collectionService.model.srPce.topo.link;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcSRv6AdjacencySids {
    private String nodeIdentifier;
    private String linkIdentifier;

    //SRV6-SID-BAG
    @JsonProperty("srv6sid")
    private String srv6Sid;   //Full SRv6 SID
    @JsonProperty("endpoint-function")
    private String endpointFunction; //Endpoint Function or behavior of the SRv6SID

    /**
     * sr-protected-adj-sid, value 1
     * sr-unprotected-adj-sid, value 2
     * srbgp-egress-peer-engineering-sid, value 3
     * sr-reqular-prefix-sid, value 4
     * sr-strict-prefix-sid, value 5
     * sr-flex-algo-prefix-sid value 6
     **/
    @JsonProperty("type")
    private String type;  //SRv6 SID type
    @JsonProperty("flags")
    private String flags; //SRv6 SID flags
    @JsonProperty("algorithm")
    private String algorithm; //Flex-Algo value used for this SRv6SID
    @JsonProperty("weight")
    private String weight;

    //SRV6-SID-STRUCTURE-BAG, SRv6 MicroSID Structure
    @JsonProperty("locator-block-length")
    private String locatorBlockLength; //Block Length
    @JsonProperty("locator-node-length")
    private String locatorNodeLength;  //Node Length
    @JsonProperty("function-length")
    private String functionLength;   //Function Length
    @JsonProperty("argument-length")
    private String argumentLength; //Argument Length

    //Used in NodeSID Identifiers..
    @JsonProperty("autonomous-system-number")
    private String asn;
    @JsonProperty("ls-identifier")
    private String lsIdentifier;
    @JsonProperty("domain-identifier")
    private String domainIdentifier;

    @Override
    public String toString() {
        return "NetIntXtcSRv6AdjacencySids{" + "nodeIdentifier='" + nodeIdentifier + '\'' + ", linkIdentifier=" + linkIdentifier + ", srv6Sid='" + srv6Sid + '\'' + ", endpointFunction='" + endpointFunction + '\'' + ", type='" + type + '\'' + ", flags='" + flags + '\'' + ", algorithm='" + algorithm + '\'' + ", weight='" + weight + '\'' + ", locatorBlockLength='" + locatorBlockLength + '\'' + ", locatorNodeLength='" + locatorNodeLength + '\'' + ", functionLength='" + functionLength + '\'' + ", argumentLength='" + argumentLength + '\'' + ", asn='" + asn + '\'' + ", lsIdentifier='" + lsIdentifier + '\'' + ", domainIdentifier='" + domainIdentifier + '\'' + '}';
    }
}
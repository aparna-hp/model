package com.cisco.collectionService.model.srPce.topo.node;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcSRv6PrefixSids {
    private String nodeIdentifier;

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


    public String getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(String nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public String getSrv6Sid() {
        return srv6Sid;
    }

    public void setSrv6Sid(String srv6Sid) {
        this.srv6Sid = srv6Sid;
    }

    public String getEndpointFunction() {
        return endpointFunction;
    }

    public void setEndpointFunction(String endpointFunction) {
        this.endpointFunction = endpointFunction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLocatorBlockLength() {
        return locatorBlockLength;
    }

    public void setLocatorBlockLength(String locatorBlockLength) {
        this.locatorBlockLength = locatorBlockLength;
    }

    public String getLocatorNodeLength() {
        return locatorNodeLength;
    }

    public void setLocatorNodeLength(String locatorNodeLength) {
        this.locatorNodeLength = locatorNodeLength;
    }

    public String getFunctionLength() {
        return functionLength;
    }

    public void setFunctionLength(String functionLength) {
        this.functionLength = functionLength;
    }

    public String getArgumentLength() {
        return argumentLength;
    }

    public void setArgumentLength(String argumentLength) {
        this.argumentLength = argumentLength;
    }

    @Override
    public String toString() {
        return "NetIntXtcSRv6PrefixSids{" + "nodeIdentifier='" + nodeIdentifier + '\'' + ", srv6Sid='" + srv6Sid + '\'' + ", endpointFunction='" + endpointFunction + '\'' + ", type='" + type + '\'' + ", flags='" + flags + '\'' + ", algorithm='" + algorithm + '\'' + ", weight='" + weight + '\'' + ", locatorBlockLength='" + locatorBlockLength + '\'' + ", locatorNodeLength='" + locatorNodeLength + '\'' + ", functionLength='" + functionLength + '\'' + ", argumentLength='" + argumentLength + '\'' + ", asn='" + asn + '\'' + ", lsIdentifier='" + lsIdentifier + '\'' + ", domainIdentifier='" + domainIdentifier + '\'' + '}';
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getLsIdentifier() {
        return lsIdentifier;
    }

    public void setLsIdentifier(String lsIdentifier) {
        this.lsIdentifier = lsIdentifier;
    }

    public String getDomainIdentifier() {
        return domainIdentifier;
    }

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

}

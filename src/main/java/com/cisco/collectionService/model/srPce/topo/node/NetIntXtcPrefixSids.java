package com.cisco.collectionService.model.srPce.topo.node;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcPrefixSids {
    private String nodeIdentifier;
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

    public String getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(String nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public String getAfName() {
        return afName;
    }

    public void setAfName(String afName) {
        this.afName = afName;
    }

    public String getIpv4Address() {
        return ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getSidType() {
        return sidType;
    }

    public void setSidType(String sidType) {
        this.sidType = sidType;
    }

    public String getMplsLabel() {
        return mplsLabel;
    }

    public void setMplsLabel(String mplsLabel) {
        this.mplsLabel = mplsLabel;
    }

    public String getDomainIdentifier() {
        return domainIdentifier;
    }

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getRflag() {
        return Rflag;
    }

    public void setRflag(String rflag) {
        Rflag = rflag;
    }

    public String getNflag() {
        return Nflag;
    }

    public void setNflag(String nflag) {
        Nflag = nflag;
    }

    public String getPflag() {
        return Pflag;
    }

    public void setPflag(String pflag) {
        Pflag = pflag;
    }

    public String getEflag() {
        return Eflag;
    }

    public void setEflag(String eflag) {
        Eflag = eflag;
    }

    public String getVflag() {
        return Vflag;
    }

    public void setVflag(String vflag) {
        Vflag = vflag;
    }

    public String getLflag() {
        return Lflag;
    }

    public void setLflag(String lflag) {
        Lflag = lflag;
    }

    @Override
    public String toString() {
        return "NetIntXtcPrefixSids{" +
                "nodeIdentifier='" + nodeIdentifier + '\'' +
                ", afName='" + afName + '\'' +
                ", ipv4Address='" + ipv4Address + '\'' +
                ", ipv6Address='" + ipv6Address + '\'' +
                ", sidType='" + sidType + '\'' +
                ", mplsLabel='" + mplsLabel + '\'' +
                ", domainIdentifier='" + domainIdentifier + '\'' +
                ", algorithm='" + algorithm + '\'' +
                ", Rflag='" + Rflag + '\'' +
                ", Nflag='" + Nflag + '\'' +
                ", Pflag='" + Pflag + '\'' +
                ", Eflag='" + Eflag + '\'' +
                ", Vflag='" + Vflag + '\'' +
                ", Lflag='" + Lflag + '\'' +
                '}';
    }
}

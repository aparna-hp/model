package com.cisco.configService.model.netflow;

import com.cisco.configService.model.netflow.agent.NetflowAgent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonConfigs {

    public enum SplitASFlows {
        aggregate, mac_distribute
    }

    public enum AddressFamily {
        IPV4("ipv4"),

        IPV6("ipv6"),

        IPV4_IPV6("ipv4+ipv6");

        private String value;

        AddressFamily(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    public enum LogLevel {
        off, fatal, error, warn, notice, info, debug, trace
    }

    @JsonProperty("splitAsFlowsOnIngress")
    private SplitASFlows splitAsFlowsOnIngress = SplitASFlows.aggregate;

    @JsonIgnore
    @XmlElement(name = "split-as-flows-on-ingress", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String splitAsFlowsOnIngressStr ;


    @XmlElement(name = "asn", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    @JsonProperty("asn")
    private String asn;

    @JsonProperty("addressFamily")
    private List<AddressFamily> addressFamily = new ArrayList<>();

    @JsonIgnore
    @XmlElement(name = "address-family", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String addressFamilyStr;

    @JsonProperty("extNodeTags")
    private List<String> extNodeTags = new ArrayList<String>();

    @JsonIgnore
    @XmlElement(name = "ext-node-tags", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String extNodeTagString;

    @JsonProperty("splitAsFlowsOnEgress")
    private Boolean splitAsFlowsOnEgress = false;

    @JsonProperty("extraAggregation")
    private List<NetflowAgent.ExtraAggregation> extraAggregation = new ArrayList<>();

    @JsonIgnore
    @XmlElement(name = "extra-aggregation", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String extraAggregationStr;

    @JsonProperty("logLevel")
    private LogLevel logLevel = LogLevel.error;

    @JsonIgnore
    @XmlElement(name = "log-level", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String logLevelStr;

    @JsonProperty("numOfThreads")
    private Integer numOfThreads =16;

    @JsonProperty("splitAsFlowsOnIngress")
    public SplitASFlows getSplitAsFlowsOnIngress() {
        return splitAsFlowsOnIngress;
    }

    @JsonProperty("splitAsFlowsOnIngress")
    public void setSplitAsFlowsOnIngress(SplitASFlows splitAsFlowsOnIngress) {
        this.splitAsFlowsOnIngress = splitAsFlowsOnIngress == null ? SplitASFlows.aggregate : splitAsFlowsOnIngress;
    }

    @JsonProperty("asn")
    public String getAsn() {
        return asn;
    }

    @JsonProperty("asn")
    public void setAsn(String asn) {
        this.asn = asn;
    }

    @JsonProperty("addressFamily")
    public List<AddressFamily> getAddressFamily() {
        return addressFamily;
    }

    @JsonProperty("addressFamily")
    public void setAddressFamily(List<AddressFamily> addressFamily) {
        this.addressFamily =  addressFamily;
    }

    @JsonProperty("extNodeTags")
    public List<String> getExtNodeTags() {
        return extNodeTags;
    }

    @JsonProperty("extNodeTags")
    public void setExtNodeTags(List<String> extNodeTags) {
        this.extNodeTags = extNodeTags;
    }

    @JsonProperty("splitAsFlowsOnEgress")
    public Boolean getSplitAsFlowsOnEgress() {
        return splitAsFlowsOnEgress;
    }

    @JsonProperty("splitAsFlowsOnEgress")
    public void setSplitAsFlowsOnEgress(Boolean splitAsFlowsOnEgress) {
        this.splitAsFlowsOnEgress = splitAsFlowsOnEgress != null && splitAsFlowsOnEgress;
    }

    @JsonProperty("extraAggregation")
    public List<NetflowAgent.ExtraAggregation> getExtraAggregation() {
        return extraAggregation;
    }

    @JsonProperty("extraAggregation")
    public void setExtraAggregation(List<NetflowAgent.ExtraAggregation> extraAggregation) {
        this.extraAggregation = extraAggregation;
    }

    @JsonProperty("logLevel")
    public LogLevel getLogLevel() {
        return logLevel;
    }

    @JsonProperty("logLevel")
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @JsonProperty("numOfThreads")
    public Integer getNumOfThreads() {
        return numOfThreads;
    }

    @JsonProperty("numOfThreads")
    public void setNumOfThreads(Integer numOfThreads) {
        this.numOfThreads = (numOfThreads == null) ? 16 : numOfThreads;
    }

    @JsonIgnore
    public String getSplitAsFlowsOnIngressStr() {
        return splitAsFlowsOnIngressStr;
    }

    @JsonIgnore
    public void setSplitAsFlowsOnIngressStr(String splitAsFlowsOnIngressStr) {
        this.splitAsFlowsOnIngressStr = splitAsFlowsOnIngressStr;
    }

    @JsonIgnore
    public String getAddressFamilyStr() {
        return addressFamilyStr;
    }

    @JsonIgnore
    public void setAddressFamilyStr(String addressFamilyStr) {
        this.addressFamilyStr = addressFamilyStr;
    }

    @JsonIgnore
    public String getExtNodeTagString() {
        return extNodeTagString;
    }

    @JsonIgnore
    public void setExtNodeTagString(String extNodeTagString) {
        this.extNodeTagString = extNodeTagString;
    }

    @JsonIgnore
    public String getExtraAggregationStr() {
        return extraAggregationStr;
    }

    @JsonIgnore
    public void setExtraAggregationStr(String extraAggregationStr) {
        this.extraAggregationStr = extraAggregationStr;
    }

    @JsonIgnore
    public String getLogLevelStr() {
        return logLevelStr;
    }

    @JsonIgnore
    public void setLogLevelStr(String logLevelStr) {
        this.logLevelStr = logLevelStr;
    }

    @Override
    public String toString() {
        return "CommonConfigs{" +
                "splitAsFlowsOnIngress=" + splitAsFlowsOnIngress +
                ", splitAsFlowsOnIngressStr='" + splitAsFlowsOnIngressStr + '\'' +
                ", asn='" + asn + '\'' +
                ", addressFamily=" + addressFamily +
                ", addressFamilyStr='" + addressFamilyStr + '\'' +
                ", extNodeTags=" + extNodeTags +
                ", extNodeTagString='" + extNodeTagString + '\'' +
                ", splitAsFlowsOnEgress=" + splitAsFlowsOnEgress +
                ", extraAggregation=" + extraAggregation +
                ", extraAggregationStr='" + extraAggregationStr + '\'' +
                ", logLevel=" + logLevel +
                ", logLevelStr='" + logLevelStr + '\'' +
                ", numOfThreads=" + numOfThreads +
                '}';
    }
}

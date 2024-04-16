package com.cisco.configService.model.topoBgpls.ui;

import com.cisco.configService.enums.IgpProtocol;
import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = true)
public class BgpLsCollectorView extends ConfigParams {

    private Long primarySrPceAgent;

    private Long secondarySrPceAgent;

    @XmlElement( name = "asn",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer asn = 0;

    private IgpProtocol igpProtocol = IgpProtocol.ISIS;

    @XmlElement( name = "extended-topology-discovery",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean extendedTopologyDiscovery = true;

    private Boolean reactiveEnabled = true;

    @XmlElement( name = "enable-triggering-collection",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean enableTriggerCollection = true;

    @XmlElement( name = "advanced",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private BgpLsCollectorAdvancedView advanced = new BgpLsCollectorAdvancedView();

    @JsonIgnore
    @XmlElement(name="network-access", namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String networkAccess;

    @JsonIgnore
    @XmlElement(name="network-filter", namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String nodeFilter;

    @XmlElement( name = "xtc-host",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String xtcHost;

    @XmlElement( name = "backup-xtc-host",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String backupXtcHost;

    @JsonIgnore
    @XmlElement( name = "igp-protocol",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String igpProtocolStr;

    @XmlElement( name = "reactive-network",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonIgnore
    private ReactiveNetworkBgpLs reactiveNetwork = new ReactiveNetworkBgpLs();

    @NoArgsConstructor
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ReactiveNetworkBgpLs {

        @XmlElement( name = "enable",namespace = "http://cisco.com/ns/wae/xtc-topology")
        private Boolean enable = true;
    }

    @JsonProperty("asn")
    public Integer getAsn() {
        return asn;
    }

    @JsonProperty("asn")
    public void setAsn(Integer asn) {
        this.asn = asn == null ? 0 : asn;
    }

    @JsonProperty("igpProtocol")
    public IgpProtocol getIgpProtocol() {
        return igpProtocol;
    }

    @JsonProperty("igpProtocol")
    public void setIgpProtocol(IgpProtocol igpProtocol) {
        this.igpProtocol = igpProtocol == null ? IgpProtocol.ISIS : igpProtocol;
    }

    @JsonProperty("extendedTopologyDiscovery")
    public Boolean getExtendedTopologyDiscovery() {
        return extendedTopologyDiscovery;
    }

    @JsonProperty("extendedTopologyDiscovery")
    public void setExtendedTopologyDiscovery(Boolean extendedTopologyDiscovery) {
        this.extendedTopologyDiscovery = extendedTopologyDiscovery == null || extendedTopologyDiscovery;
    }

    @JsonProperty("reactiveEnabled")
    public Boolean getReactiveEnabled() {
        return reactiveEnabled;
    }

    @JsonProperty("reactiveEnabled")
    public void setReactiveEnabled(Boolean reactiveEnabled) {
        this.reactiveEnabled = reactiveEnabled == null || reactiveEnabled;
    }

    @JsonProperty("enable-trigger-collection")
    public Boolean getEnableTriggerCollection() {
        return enableTriggerCollection;
    }

    @JsonProperty("enable-trigger-collection")
    public void setEnableTriggerCollection(Boolean enableTriggerCollection) {
        this.enableTriggerCollection = enableTriggerCollection;
    }

    @JsonProperty("advanced")
    public BgpLsCollectorAdvancedView getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(BgpLsCollectorAdvancedView advanced) {
        this.advanced = advanced;
    }

    @JsonProperty("primarySrPceAgent")
    public Long getPrimarySrPceAgent() {
        return primarySrPceAgent;
    }

    @JsonProperty("primarySrPceAgent")
    public void setPrimarySrPceAgent(Long primarySrPceAgent) {
        this.primarySrPceAgent = primarySrPceAgent;
    }

    @JsonProperty("secondarySrPceAgent")
    public Long getSecondarySrPceAgent() {
        return secondarySrPceAgent;
    }

    @JsonProperty("secondarySrPceAgent")
    public void setSecondarySrPceAgent(Long secondarySrPceAgent) {
        this.secondarySrPceAgent = secondarySrPceAgent;
    }

    @JsonIgnore
    public String getNetworkAccess() {
        return networkAccess;
    }

    @JsonIgnore
    public void setNetworkAccess(String networkAccess) {
        this.networkAccess = networkAccess;
    }

    @JsonIgnore
    public String getNodeFilter() {
        return nodeFilter;
    }

    @JsonIgnore
    public void setNodeFilter(String nodeFilter) {
        this.nodeFilter = nodeFilter;
    }

    public String getXtcHost() {
        return xtcHost;
    }

    public void setXtcHost(String xtcHost) {
        this.xtcHost = xtcHost;
    }

    public String getBackupXtcHost() {
        return backupXtcHost;
    }

    public void setBackupXtcHost(String backupXtcHost) {
        this.backupXtcHost = backupXtcHost;
    }

    @JsonIgnore
    public String getIgpProtocolStr() {
        return igpProtocolStr;
    }

    @JsonIgnore
    public void setIgpProtocolStr(String igpProtocolStr) {
        this.igpProtocolStr = igpProtocolStr;
    }

    @JsonIgnore
    public ReactiveNetworkBgpLs getReactiveNetwork() {
        return reactiveNetwork;
    }

    @JsonIgnore
    public void setReactiveNetwork(ReactiveNetworkBgpLs reactiveNetwork) {
        this.reactiveNetwork = reactiveNetwork;
    }

    @Override
    public String toString() {
        return "BgpLsCollectorView{" +
                ", primarySrPceAgent=" + primarySrPceAgent +
                ", secondarySrPceAgent=" + secondarySrPceAgent +
                ", asn=" + asn +
                ", igpProtocol=" + igpProtocol +
                ", extendedTopologyDiscovery=" + extendedTopologyDiscovery +
                ", reactiveEnabled=" + reactiveEnabled +
                ", advanced=" + advanced +
                '}';
    }
}

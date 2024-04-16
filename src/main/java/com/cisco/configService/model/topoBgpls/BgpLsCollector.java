package com.cisco.configService.model.topoBgpls;

import com.cisco.configService.enums.IgpProtocol;
import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;

public class BgpLsCollector extends ConfigParams {

    @NotNull
    private Long primarySrPceAgent;

    private Long secondarySrPceAgent;

    private Integer asn = 0;

    private IgpProtocol igpProtocol = IgpProtocol.ISIS;

    private Boolean extendedTopologyDiscovery = true;

    private Boolean reactiveEnabled = true;

    private Boolean enableTriggerCollection = true;

    private BgpLsCollectorAdvanced advanced = new BgpLsCollectorAdvanced();

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
    public BgpLsCollectorAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(BgpLsCollectorAdvanced advanced) {
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
}

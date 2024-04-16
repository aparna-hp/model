package com.cisco.configService.model.netflow.agent;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Validated
@EqualsAndHashCode(callSuper = true)
@Data
public class NetflowAgent extends ConfigParams {

    public enum FlowSize {
        small, medium, large, lab
    }

    public enum ExtraAggregation {
        SRC_MASK,DST_MASK,SRC_NET, DST_NET, PROTO, TOS, PEER_SRC_AS, MPLS_VPN_RD
    }

    @JsonProperty("interval")
    private Integer interval = 900;

    @JsonProperty("bgp")
    private Boolean bgp = false;

    @JsonProperty("flowSize")
    private FlowSize flowSize = FlowSize.medium;

    @JsonProperty("extraAggregation")
    private List<ExtraAggregation> extraAggregation = new ArrayList<ExtraAggregation>();

    @JsonProperty("nodeFlowConfigs")
    private List<@Valid NodeFlowConfig> nodeFlowConfigs = new ArrayList<NodeFlowConfig>();

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval == null ? 900 : interval;
    }

    @JsonProperty("bgp")
    public Boolean getBgp() {
        return bgp;
    }

    @JsonProperty("bgp")
    public void setBgp(Boolean bgp) {
        this.bgp = bgp != null && bgp;
    }

    @JsonProperty("flowSize")
    public FlowSize getFlowSize() {
        return flowSize;
    }

    @JsonProperty("flowSize")
    public void setFlowSize(FlowSize flowSize) {
        this.flowSize = flowSize == null ? FlowSize.medium : flowSize;
    }

    @JsonProperty("extraAggregation")
    public List<ExtraAggregation> getExtraAggregation() {
        return extraAggregation;
    }

    @JsonProperty("extraAggregation")
    public void setExtraAggregation(List<ExtraAggregation> extraAggregation) {
        this.extraAggregation = extraAggregation;
    }

    @JsonProperty("nodeFlowConfigs")
    public List<NodeFlowConfig> getNodeFlowConfigs() {
        return nodeFlowConfigs;
    }

    @JsonProperty("nodeFlowConfigs")
    public void setNodeFlowConfigs(List<NodeFlowConfig> nodeFlowConfigs) {
        this.nodeFlowConfigs = nodeFlowConfigs;
    }

}

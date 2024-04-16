package com.cisco.configService.model.netflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class IASConfigs {

    @JsonProperty("trimInterAsFlows")
    @XmlElement(name = "trim-inter-as-flows", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private Integer trimInterAsFlows = 1;

    @JsonProperty("matchOnBgpExternalInfo")
    @XmlElement(name = "match-on-bgp-external-info", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private Boolean matchOnBgpExternalInfo = false;

    @JsonProperty("ingress-interface-flow-filter")
    @XmlElement(name = "ingress-interface-flow-filter", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String ingressInterfaceFlowFilter;

    @JsonProperty("egress-interface-flow-filter")
    @XmlElement(name = "egress-interface-flow-filter", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String egressInterfaceFlowFilter;

    @JsonProperty("backtrackMicroFlows")
    @XmlElement(name = "backtrack-micro-flows", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private Boolean backtrackMicroFlows = false;

    @JsonProperty("flowImportFlowIds")
    @XmlElement(name = "flow-import-flow-ids", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String flowImportFlowIds;

    @JsonProperty("ias-computation-timeout-in-minutes")
    @XmlElement(name = "ias-computation-timeout-in-minutes", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private Integer iasComputationTimeoutInMinutes = 60;

    @JsonProperty("trimInterAsFlows")
    public Integer getTrimInterAsFlows() {
        return trimInterAsFlows;
    }

    @JsonProperty("trimInterAsFlows")
    public void setTrimInterAsFlows(Integer trimInterAsFlows) {
        this.trimInterAsFlows = trimInterAsFlows == null ? 1 : trimInterAsFlows;
    }

    @JsonProperty("matchOnBgpExternalInfo")
    public Boolean getMatchOnBgpExternalInfo() {
        return matchOnBgpExternalInfo;
    }

    @JsonProperty("matchOnBgpExternalInfo")
    public void setMatchOnBgpExternalInfo(Boolean matchOnBgpExternalInfo) {
        this.matchOnBgpExternalInfo = matchOnBgpExternalInfo != null && matchOnBgpExternalInfo;
    }

    @JsonProperty("ingress-interface-flow-filter")
    public String getIngressInterfaceFlowFilter() {
        return ingressInterfaceFlowFilter;
    }

    @JsonProperty("ingress-interface-flow-filter")
    public void setIngressInterfaceFlowFilter(String ingressInterfaceFlowFilter) {
        this.ingressInterfaceFlowFilter = ingressInterfaceFlowFilter;
    }

    @JsonProperty("egress-interface-flow-filter")
    public String getEgressInterfaceFlowFilter() {
        return egressInterfaceFlowFilter;
    }

    @JsonProperty("egress-interface-flow-filter")
    public void setEgressInterfaceFlowFilter(String egressInterfaceFlowFilter) {
        this.egressInterfaceFlowFilter = egressInterfaceFlowFilter;
    }

    @JsonProperty("backtrackMicroFlows")
    public Boolean getBacktrackMicroFlows() {
        return backtrackMicroFlows;
    }

    @JsonProperty("backtrackMicroFlows")
    public void setBacktrackMicroFlows(Boolean backtrackMicroFlows) {
        this.backtrackMicroFlows = backtrackMicroFlows != null && backtrackMicroFlows;
    }

    @JsonProperty("flowImportFlowIds")
    public String getFlowImportFlowIds() {
        return flowImportFlowIds;
    }

    @JsonProperty("flowImportFlowIds")
    public void setFlowImportFlowIds(String flowImportFlowIds) {
        this.flowImportFlowIds = flowImportFlowIds;
    }

    @JsonProperty("ias-computation-timeout-in-minutes")
    public Integer getIasComputationTimeoutInMinutes() {
        return iasComputationTimeoutInMinutes;
    }

    @JsonProperty("ias-computation-timeout-in-minutes")
    public void setIasComputationTimeoutInMinutes(Integer iasComputationTimeoutInMinutes) {
        this.iasComputationTimeoutInMinutes = iasComputationTimeoutInMinutes == null ? 60 : iasComputationTimeoutInMinutes;
    }

    @Override
    public String toString() {
        return "IASConfigs{" +
                "trimInterAsFlows=" + trimInterAsFlows +
                ", matchOnBgpExternalInfo=" + matchOnBgpExternalInfo +
                ", ingressInterfaceFlowFilter='" + ingressInterfaceFlowFilter + '\'' +
                ", egressInterfaceFlowFilter='" + egressInterfaceFlowFilter + '\'' +
                ", backtrackMicroFlows=" + backtrackMicroFlows +
                ", flowImportFlowIds='" + flowImportFlowIds + '\'' +
                ", iasComputationTimeoutInMinutes=" + iasComputationTimeoutInMinutes +
                '}';
    }
}

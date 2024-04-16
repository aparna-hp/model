package com.cisco.configService.model.netflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandConfigs {

    @JsonProperty("demand-name")
    @XmlElement(name = "demand-name", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String demandName;

    @JsonProperty("demand-tag")
    @XmlElement(name = "demand-tag", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String demandTag;

    @JsonProperty("trim-demands")
    @XmlElement(name = "trim-demands", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private Integer trimDemands = 1;

    @JsonProperty("service-class")
    @XmlElement(name = "service-class", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String serviceClass;

    @JsonProperty("traffic-level")
    @XmlElement(name = "traffic-level", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String trafficLevel;

    @JsonProperty("missing-flows")
    @XmlElement(name = "missing-flows", namespace = "http://cisco.com/ns/wae/network/nimo/netflow")
    private String missingFlows;

    @JsonProperty("demand-name")
    public String getDemandName() {
        return demandName;
    }

    @JsonProperty("demand-name")
    public void setDemandName(String demandName) {
        this.demandName = demandName;
    }

    @JsonProperty("demand-tag")
    public String getDemandTag() {
        return demandTag;
    }

    @JsonProperty("demand-tag")
    public void setDemandTag(String demandTag) {
        this.demandTag = demandTag;
    }

    @JsonProperty("trim-demands")
    public Integer getTrimDemands() {
        return trimDemands;
    }

    @JsonProperty("trim-demands")
    public void setTrimDemands(Integer trimDemands) {
        this.trimDemands = trimDemands == null ? 1 : trimDemands;
    }

    @JsonProperty("service-class")
    public String getServiceClass() {
        return serviceClass;
    }

    @JsonProperty("service-class")
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    @JsonProperty("traffic-level")
    public String getTrafficLevel() {
        return trafficLevel;
    }

    @JsonProperty("traffic-level")
    public void setTrafficLevel(String trafficLevel) {
        this.trafficLevel = trafficLevel;
    }

    @JsonProperty("missing-flows")
    public String getMissingFlows() {
        return missingFlows;
    }

    @JsonProperty("missing-flows")
    public void setMissingFlows(String missingFlows) {
        this.missingFlows = missingFlows;
    }


    @Override
    public String toString() {
        return "DemandConfigs{" +
                "demandName='" + demandName + '\'' +
                ", demandTag='" + demandTag + '\'' +
                ", trimDemands=" + trimDemands +
                ", serviceClass='" + serviceClass + '\'' +
                ", trafficLevel='" + trafficLevel + '\'' +
                ", missingFlows='" + missingFlows + '\'' +
                '}';
    }
}

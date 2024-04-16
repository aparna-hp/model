package com.cisco.configService.model.demand;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Measurements {

    @XmlElement(name = "nodes", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean nodes = true;

    @XmlElement(name = "nodes-priority", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @Min(1) @Max(2)
    private Long nodesPriority = 2L;

    @XmlElement(name = "interfaces", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean interfaces = true;

    @XmlElement(name = "interfaces-priority", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @Min(1) @Max(2)
    private Long interfacesPriority = 1L;

    @XmlElement(name = "lsps", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean lsps = true;

    @XmlElement(name = "lsps-priority", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @Min(1) @Max(2)
    private Long lspsPriority = 2L;

    @XmlElement(name = "flows", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean flows = true;

    @XmlElement(name = "flows-priority", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @Min(1) @Max(2)
    private Long flowsPriority = 2L;

    public Boolean getNodes() {
        return nodes;
    }

    public void setNodes(Boolean nodes) {
        this.nodes = nodes == null || nodes;
    }

    public Long getNodesPriority() {
        return nodesPriority;
    }

    public void setNodesPriority(Long nodesPriority) {
        this.nodesPriority = nodesPriority == null ? 2 : nodesPriority;
    }

    public Boolean getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(Boolean interfaces) {
        this.interfaces = interfaces == null || interfaces;
    }

    public Long getInterfacesPriority() {
        return interfacesPriority;
    }

    public void setInterfacesPriority(Long interfacesPriority) {
        this.interfacesPriority = interfacesPriority == null ? 1 : interfacesPriority;
    }

    public Boolean getLsps() {
        return lsps;
    }

    public void setLsps(Boolean lsps) {
        this.lsps = lsps == null || lsps;
    }

    public Long getLspsPriority() {
        return lspsPriority;
    }

    public void setLspsPriority(Long lspsPriority) {
        this.lspsPriority = lspsPriority == null ? 2 : lspsPriority;
    }

    public Boolean getFlows() {
        return flows;
    }

    public void setFlows(Boolean flows) {
        this.flows = flows == null || flows;
    }

    public Long getFlowsPriority() {
        return flowsPriority;
    }

    public void setFlowsPriority(Long flowsPriority) {
        this.flowsPriority = flowsPriority == null ? 2 : flowsPriority;
    }
}

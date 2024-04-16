package com.cisco.configService.model.pcepLsp;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = true)
public class PcepLspCollector extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "source-network", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private String sourceNetwork;

    @JsonIgnore
    @XmlElement(name = "xtc-hosts", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private List<SrpceAgents> srpceAgentsList = new ArrayList<>();

    @JsonProperty("reactiveNetwork")
    @XmlElement(name = "reactive-network", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private ReactiveNetwork reactiveNetwork = new ReactiveNetwork();

    @JsonProperty("advanced")
    @XmlElement(name = "advanced", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Advanced advanced = new Advanced();

    @JsonProperty("reactiveNetwork")
    public ReactiveNetwork getReactiveNetwork() {
        return reactiveNetwork;
    }

    @JsonProperty("reactiveNetwork")
    public void setReactiveNetwork(ReactiveNetwork reactiveNetwork) {
        this.reactiveNetwork = reactiveNetwork;
    }

    @JsonProperty("advanced")
    public Advanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
    }

    @Data
    @NoArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class SrpceAgents {

        @XmlElement(name = "xtc-host", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
        private String srpceAgent;
    }

}

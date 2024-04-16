package com.cisco.configService.model.topoBgpls.ui;

import com.cisco.configService.model.common.ui.InterfacesView;
import com.cisco.configService.model.common.ui.NodesView;
import com.cisco.configService.model.topoBgpls.SrpceAdvanced;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class BgpLsCollectorAdvancedView {

    @XmlElement( name = "xtc",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonProperty("SR_PCE")
    private SrpceAdvanced xtc = new SrpceAdvanced();

    @XmlElement( name = "nodes",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonProperty("nodes")
    private NodesView nodes = new NodesView();

    @XmlElement( name = "interfaces",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonProperty("interfaces")
    private InterfacesView interfaces = new InterfacesView();
}

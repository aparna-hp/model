package com.cisco.configService.model.topoBgpls;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class SrpceAdvanced {

    @XmlElement( name = "single-ended-ebgp-discovery",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean singleEndedEbgpDiscovery = false;

    @JsonProperty("singleEndedEbgpDiscovery")
    public Boolean getSingleEndedEbgpDiscovery() {
        return singleEndedEbgpDiscovery;
    }

    @JsonProperty("singleEndedEbgpDiscovery")
    public void setSingleEndedEbgpDiscovery(Boolean singleEndedEbgpDiscovery) {
        this.singleEndedEbgpDiscovery = singleEndedEbgpDiscovery != null && singleEndedEbgpDiscovery;
    }

    @Override
    public String toString() {
        return "SrpceAdvanced{" +
                "singleEndedEbgpDiscovery=" + singleEndedEbgpDiscovery +
                '}';
    }
}

package com.cisco.configService.model.pcepLsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class ReactiveNetwork {

    @JsonProperty("enable")
    @XmlElement(name = "enable", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Boolean enable = false;

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable != null && enable;
    }

    @Override
    public String toString() {
        return "ReactiveNetwork{" +
                "enable=" + enable +
                '}';
    }
}

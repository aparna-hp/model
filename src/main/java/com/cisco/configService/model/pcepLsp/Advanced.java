package com.cisco.configService.model.pcepLsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Advanced {

    @JsonProperty("rsvpUseSignaledName")
    @XmlElement(name = "rsvp-use-signaled-name", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Boolean rsvpUseSignaledName = false;

    @JsonProperty("srUseSignaledName")
    @XmlElement(name = "sr-use-signaled-name", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Boolean srUseSignaledName = true;

    @JsonProperty("srAddIndex")
    @XmlElement(name = "sr-add-index", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Boolean srAddIndex = true;

    @JsonProperty("connectTimeout")
    @XmlElement(name = "connect-timeout", namespace = "http://cisco.com/ns/wae/lsp-pcep-xtc-nimo")
    private Integer connectTimeout = 60;

    @JsonProperty("rsvpUseSignaledName")
    public Boolean getRsvpUseSignaledName() {
        return rsvpUseSignaledName;
    }

    @JsonProperty("rsvpUseSignaledName")
    public void setRsvpUseSignaledName(Boolean rsvpUseSignaledName) {
        this.rsvpUseSignaledName = rsvpUseSignaledName != null && rsvpUseSignaledName;
    }

    @JsonProperty("srUseSignaledName")
    public Boolean getSrUseSignaledName() {
        return srUseSignaledName;
    }

    @JsonProperty("srUseSignaledName")
    public void setSrUseSignaledName(Boolean srUseSignaledName) {
        this.srUseSignaledName = srUseSignaledName == null || srUseSignaledName;
    }

    @JsonProperty("srAddIndex")
    public Boolean getSrAddIndex() {
        return srAddIndex;
    }

    @JsonProperty("srAddIndex")
    public void setSrAddIndex(Boolean srAddIndex) {
        this.srAddIndex = srAddIndex == null || srAddIndex;
    }

    @JsonProperty("connectTimeout")
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    @JsonProperty("connectTimeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout == null ? 60 : connectTimeout;
    }

    @Override
    public String toString() {
        return "Advanced{" +
                "rsvpUseSignaledName=" + rsvpUseSignaledName +
                ", srUseSignaledName=" + srUseSignaledName +
                ", srAddIndex=" + srAddIndex +
                ", connectTimeout=" + connectTimeout +
                '}';
    }
}

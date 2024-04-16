package com.cisco.configService.model.multicast.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = false)
public class SnmpFindMulticastCollectorView extends ConfigParams {

    private Long id;

    @XmlElement(name = "connect-timeout", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Integer timeout;

    private DebugView debug = new DebugView();

    @JsonIgnore
    @XmlElement(name = "net-recorder", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private String recordMode;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    @JsonProperty("debug")
    public DebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(DebugView debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public String getRecordMode() {
        return recordMode;
    }

    @JsonIgnore
    public void setRecordMode(String recordMode) {
        this.recordMode = recordMode;
    }
}

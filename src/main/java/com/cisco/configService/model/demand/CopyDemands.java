package com.cisco.configService.model.demand;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.composer.SourceCollector;
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
public class CopyDemands extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;

    @JsonIgnore
    @XmlElement(name = "network", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private String network;

    @JsonProperty("sourceCollector")
    private SourceCollector sourceCollector;
}

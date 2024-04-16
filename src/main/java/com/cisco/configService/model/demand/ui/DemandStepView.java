package com.cisco.configService.model.demand.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandStepView {

    @JsonProperty("id")
    private Long id;

    @XmlElement(name = "name", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("name")
    private String name;

    @NotNull
    @XmlElement(name = "step-number", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("stepNumber")
    private Integer stepNumber;

    @NotNull
    @XmlElement(name = "tool", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("tool")
    private DemandToolView tool;

    @JsonProperty("enabled")
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;
}

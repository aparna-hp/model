package com.cisco.configService.model.demand.ui;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandForLspAdvancedView {

    @XmlElement(name = "lsps-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("lspsTable")
    private String lspsTable;

    @XmlElement(name = "options-file", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("optionsFile")
    private String optionsFile;

    @XmlElement(name = "no-global-options", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @XmlElement(name = "suppress-progress", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @XmlElement(name = "verbosity", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonIgnore
    private Integer verbosity;

    @JsonProperty("lspsTable")
    public String getLspsTable() {
        return lspsTable;
    }

    @JsonProperty("lspsTable")
    public void setLspsTable(String lspsTable) {
        this.lspsTable = lspsTable;
    }

    @JsonProperty("optionsFile")
    public String getOptionsFile() {
        return optionsFile;
    }

    @JsonProperty("optionsFile")
    public void setOptionsFile(String optionsFile) {
        this.optionsFile = optionsFile;
    }

    @JsonProperty("noGlobalOptions")
    public Boolean getNoGlobalOptions() {
        return noGlobalOptions;
    }

    @JsonProperty("noGlobalOptions")
    public void setNoGlobalOptions(Boolean noGlobalOptions) {
        this.noGlobalOptions = noGlobalOptions != null && noGlobalOptions;
    }

    @JsonProperty("suppressProgress")
    public Boolean getSuppressProgress() {
        return suppressProgress;
    }

    @JsonProperty("suppressProgress")
    public void setSuppressProgress(Boolean suppressProgress) {
        this.suppressProgress = suppressProgress != null && suppressProgress;
    }

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonIgnore
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }

}

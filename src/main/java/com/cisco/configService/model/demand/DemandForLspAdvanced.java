package com.cisco.configService.model.demand;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DemandForLspAdvanced {

    @JsonProperty("lspsTable")
    private String lspsTable;

    @JsonProperty("optionsFile")
    private String optionsFile;

    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

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

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 30 : verbosity;
    }
}

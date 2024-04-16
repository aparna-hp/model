package com.cisco.configService.model.demand.ui;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Debug {

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 30 : verbosity;
    }
}

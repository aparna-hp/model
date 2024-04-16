package com.cisco.configService.model.inventory;

import com.cisco.configService.enums.RecordMode;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInventoryOptions {

    private Boolean loginAllowed = true;

    private RecordMode netRecorder = RecordMode.OFF;

    private Integer verbosity = 60;

    @JsonProperty("loginAllowed")
    public Boolean getLoginAllowed() {
        return loginAllowed;
    }

    @JsonProperty("loginAllowed")
    public void setLoginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed == null || loginAllowed;
    }

    @JsonProperty("netRecorder")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("netRecorder")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 60 : verbosity;
    }

}

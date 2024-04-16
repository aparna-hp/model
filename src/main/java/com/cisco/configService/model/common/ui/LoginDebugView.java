package com.cisco.configService.model.common.ui;

import com.cisco.configService.enums.RecordMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
    public class LoginDebugView {

    @JsonProperty("loginRecordMode")
    private RecordMode loginRecordMode = RecordMode.OFF;

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

    @JsonProperty("loginRecordMode")
    public RecordMode getNetRecorder() {
        return loginRecordMode;
    }

    @JsonProperty("loginRecordMode")
    public void setNetRecorder(RecordMode loginRecordMode) {
        this.loginRecordMode = loginRecordMode == null ? RecordMode.OFF : loginRecordMode;
    }
}
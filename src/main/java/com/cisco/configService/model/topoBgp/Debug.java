package com.cisco.configService.model.topoBgp;

import com.cisco.configService.enums.RecordMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Debug {

    @JsonProperty("timeout")
    private Integer timeout = 60;

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

    @JsonProperty("netRecorder")
    private RecordMode netRecorder = RecordMode.OFF;

    @JsonProperty("loginRecordMode")
    private RecordMode loginRecordMode = RecordMode.OFF;

    @JsonProperty("netRecorder")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("netRecorder")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }

    @JsonProperty("loginRecordMode")
    public RecordMode getLoginRecordMode() {
        return loginRecordMode;
    }

    @JsonProperty("loginRecordMode")
    public void setLoginRecordMode(RecordMode loginRecordMode) {
        this.loginRecordMode = loginRecordMode == null ? RecordMode.OFF : loginRecordMode;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
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

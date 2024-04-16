package com.cisco.configService.model.common.ui;

import com.cisco.configService.enums.RecordMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugView {

    @JsonProperty("netRecorder")
    private RecordMode netRecorder = RecordMode.OFF;

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

    @JsonProperty("netRecorder")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("netRecorder")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }

    @Override
    public String toString() {
        return "DebugView{" +
                "netRecorder=" + netRecorder +
                ", verbosity=" + verbosity +
                '}';
    }
}

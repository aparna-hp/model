package com.cisco.configService.model.lspSnmp.ui;

import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedView {

    @JsonProperty("useCalculatedHops")
    private Boolean useCalculatedHops = false;

    @JsonProperty("findActualPaths")
    private Boolean findActualPaths = true;

    @JsonProperty("getExtras")
    private Boolean getExtras = false;

    @JsonProperty("useSignaledName")
    private Boolean useSignaledName = false;

    @JsonProperty("autoBw")
    private Boolean autoBw = false;

    private Integer timeout = 60;

    private DebugView debug = new DebugView();

    @JsonProperty("useCalculatedHops")
    public Boolean getUseCalculatedHops() {
        return useCalculatedHops;
    }

    @JsonProperty("useCalculatedHops")
    public void setUseCalculatedHops(Boolean useCalculatedHops) {
        this.useCalculatedHops = useCalculatedHops != null && useCalculatedHops;
    }

    @JsonProperty("findActualPaths")
    public Boolean getFindActualPaths() {
        return findActualPaths;
    }

    @JsonProperty("findActualPaths")
    public void setFindActualPaths(Boolean findActualPaths) {
        this.findActualPaths = findActualPaths == null || findActualPaths;
    }

    @JsonProperty("getExtras")
    public Boolean getGetExtras() {
        return getExtras;
    }

    @JsonProperty("getExtras")
    public void setGetExtras(Boolean getExtras) {
        this.getExtras = getExtras != null && getExtras;
    }

    @JsonProperty("useSignaledName")
    public Boolean getUseSignaledName() {
        return useSignaledName;
    }

    @JsonProperty("useSignaledName")
    public void setUseSignaledName(Boolean useSignaledName) {
        this.useSignaledName = useSignaledName != null && useSignaledName;
    }

    @JsonProperty("autoBw")
    public Boolean getAutoBw() {
        return autoBw;
    }

    @JsonProperty("autoBw")
    public void setAutoBw(Boolean autoBw) {
        this.autoBw = autoBw != null && autoBw;
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

    @Override
    public String toString() {
        return "AdvancedView{" +
                "useCalculatedHops=" + useCalculatedHops +
                ", findActualPaths=" + findActualPaths +
                ", getExtras=" + getExtras +
                ", useSignaledName=" + useSignaledName +
                ", autoBw=" + autoBw +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }
}

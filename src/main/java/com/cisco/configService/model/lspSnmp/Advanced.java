package com.cisco.configService.model.lspSnmp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Advanced {

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

}

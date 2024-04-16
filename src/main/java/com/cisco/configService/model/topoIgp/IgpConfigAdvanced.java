
package com.cisco.configService.model.topoIgp;


import com.cisco.configService.enums.IsisLevel;
import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.common.LoginConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class IgpConfigAdvanced {

    private String backupRouter;

    private Boolean getSegment = false;

    private String isisLevel = IsisLevel.TWO.getValue();

    private String ospfArea = "0";

    private List<Integer> ospfProcessIds = new ArrayList<>();

    private List<Integer> isisProcessIds = new ArrayList<>();

    private Boolean removeNullProcessId = false;

    private RecordMode runIGPOffline = RecordMode.OFF;

    private String nodeTag;

    private LoginConfig loginConfig = new LoginConfig();

    private Integer timeout = 60;

    private Integer verbosity = 30;

    private RecordMode netRecorder = RecordMode.OFF;

    @JsonProperty("backupRouter")
    public String getBackupRouter() {
        return backupRouter;
    }

    @JsonProperty("backupRouter")
    public void setBackupRouter(String backupRouter) {
        this.backupRouter = backupRouter;
    }

    @JsonProperty("getSegment")
    public Boolean getGetSegment() {
        return getSegment;
    }

    @JsonProperty("getSegment")
    public void setGetSegment(Boolean getSegment) {
        this.getSegment = getSegment != null && getSegment;
    }

    @JsonProperty("isisLevel")
    public String getIsisLevel() {
        return isisLevel;
    }

    @JsonProperty("isisLevel")
    public void setIsisLevel(String isisLevel) {
        this.isisLevel = isisLevel == null ? IsisLevel.TWO.getValue() : isisLevel;
    }

    @JsonProperty("ospfArea")
    public String getOspfArea() {
        return ospfArea;
    }

    @JsonProperty("ospfArea")
    public void setOspfArea(String ospfArea) {
        this.ospfArea = ospfArea == null ? "0" : ospfArea;
    }

    @JsonProperty("ospfProcessIds")
    public List<Integer> getOspfProcessIds() {
        return ospfProcessIds;
    }

    @JsonProperty("ospfProcessIds")
    public void setOspfProcessIds(List<Integer> ospfProcessIds) {
        this.ospfProcessIds = ospfProcessIds;
    }

    @JsonProperty("isisProcessIds")
    public List<Integer> getIsisProcessIds() {
        return isisProcessIds;
    }

    @JsonProperty("isisProcessIds")
    public void setIsisProcessIds(List<Integer> isisProcessIds) {
        this.isisProcessIds = isisProcessIds;
    }

    @JsonProperty("removeNullProcessId")
    public Boolean getRemoveNullProcessId() {
        return removeNullProcessId;
    }

    @JsonProperty("removeNullProcessId")
    public void setRemoveNullProcessId(Boolean removeNullProcessId) {
        this.removeNullProcessId = removeNullProcessId != null && removeNullProcessId;
    }

    @JsonProperty("runIGPOffline")
    public RecordMode getRunIGPOffline() {
        return runIGPOffline;
    }

    @JsonProperty("runIGPOffline")
    public void setRunIGPOffline(RecordMode runIGPOffline) {
        this.runIGPOffline = runIGPOffline == null ? RecordMode.OFF : runIGPOffline;
    }

    @JsonProperty("nodeTag")
    public String getNodeTag() {
        return nodeTag;
    }

    @JsonProperty("nodeTag")
    public void setNodeTag(String nodeTag) {
        this.nodeTag = nodeTag;
    }

    @JsonProperty("loginConfig")
    public LoginConfig getLoginConfig() {
        return loginConfig;
    }

    @JsonProperty("loginConfig")
    public void setLoginConfig(LoginConfig loginConfig) {
        this.loginConfig = loginConfig;
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

    @JsonProperty("loginRecordMode")
    public RecordMode getNetRecorder() {
        return netRecorder;
    }

    @JsonProperty("loginRecordMode")
    public void setNetRecorder(RecordMode netRecorder) {
        this.netRecorder = netRecorder == null ? RecordMode.OFF : netRecorder;
    }
}

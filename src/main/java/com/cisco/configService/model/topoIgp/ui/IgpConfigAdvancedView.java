
package com.cisco.configService.model.topoIgp.ui;


import com.cisco.configService.enums.IsisLevel;
import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.common.LoginConfig;
import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;

import java.util.ArrayList;
import java.util.List;

public class IgpConfigAdvancedView {

    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
            message = "Invalid Ip address specified for the backup seed router.")
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

    private DebugView debug = new DebugView();

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
        return "IgpConfigAdvancedView{" +
                "backupRouter='" + backupRouter + '\'' +
                ", getSegment=" + getSegment +
                ", isisLevel='" + isisLevel + '\'' +
                ", ospfArea='" + ospfArea + '\'' +
                ", ospfProcessIds=" + ospfProcessIds +
                ", isisProcessIds=" + isisProcessIds +
                ", removeNullProcessId=" + removeNullProcessId +
                ", runIGPOffline=" + runIGPOffline +
                ", nodeTag='" + nodeTag + '\'' +
                ", loginConfig=" + loginConfig +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }
}

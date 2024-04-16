package com.cisco.configService.model.multicast;


import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginFindMulticastCollector extends ConfigParams {

    private Long id;

    private Integer timeout = 60;

    private Boolean forceConfigUpdate = false;

    //Provide option for file upload
    private String directory;

    private Boolean saveConfigs = false;

    private Boolean overwriteFiles = false;

    private RecordMode loginRecordMode = RecordMode.OFF;

    private Integer verbosity = 30;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    @JsonProperty("forceConfigUpdate")
    public Boolean getForceConfigUpdate() {
        return forceConfigUpdate;
    }

    @JsonProperty("forceConfigUpdate")
    public void setForceConfigUpdate(Boolean forceConfigUpdate) {
        this.forceConfigUpdate = forceConfigUpdate != null && forceConfigUpdate;
    }

    @JsonProperty("saveConfigs")
    public Boolean getSaveConfigs() {
        return saveConfigs;
    }

    @JsonProperty("saveConfigs")
    public void setSaveConfigs(Boolean saveConfigs) {
        this.saveConfigs = saveConfigs != null && saveConfigs;
    }

    @JsonProperty("overwriteFiles")
    public Boolean getOverwriteFiles() {
        return overwriteFiles;
    }

    @JsonProperty("overwriteFiles")
    public void setOverwriteFiles(Boolean overwriteFiles) {
        this.overwriteFiles = overwriteFiles != null && overwriteFiles;
    }

    @JsonProperty("loginRecordMode")
    public RecordMode getLoginRecordMode() {
        return loginRecordMode;
    }

    @JsonProperty("loginRecordMode")
    public void setLoginRecordMode(RecordMode loginRecordMode) {
        this.loginRecordMode = loginRecordMode == null ? RecordMode.OFF : loginRecordMode;
    }

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
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

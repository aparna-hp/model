package com.cisco.configService.model.multicast.ui;


import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.ui.LoginDebugView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = false)
public class LoginFindMulticastCollectorView extends ConfigParams {

    private Long id;

    @XmlElement(name = "action-timeout", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Integer timeout = 60;

    @XmlElement(name = "force-config-update", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Boolean forceConfigUpdate = false;

    //Provide option for file upload
    private String directory;

    @XmlElement(name = "save-configs", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Boolean saveConfigs = false;

    @XmlElement(name = "overwrite-files", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private Boolean overwriteFiles = false;

    private LoginDebugView debug = new LoginDebugView();

    @JsonIgnore
    @XmlElement(name = "login-record-mode", namespace = "http://cisco.com/ns/wae/multicast-nimo")
    private String loginRecordMode;

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

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("debug")
    public LoginDebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(LoginDebugView debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public String getLoginRecordMode() {
        return loginRecordMode;
    }

    @JsonIgnore
    public void setLoginRecordMode(String loginRecordMode) {
        this.loginRecordMode = loginRecordMode;
    }
}

package com.cisco.configService.model.parseConfig;

import com.cisco.configService.model.common.LoginConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetConfig {

    Boolean enable = true;

    //Directory will be used if getConfig enable = false.
    String directory;

    LoginConfig loginConfig = new LoginConfig();

    Debug debug = new Debug();

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable == null || enable;
    }

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("loginConfig")
    public LoginConfig getLoginConfig() {
        return loginConfig;
    }

    @JsonProperty("loginConfig")
    public void setLoginConfig(LoginConfig loginConfig) {
        this.loginConfig = loginConfig;
    }

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }
}

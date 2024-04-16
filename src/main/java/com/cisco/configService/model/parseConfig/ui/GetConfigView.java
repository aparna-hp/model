package com.cisco.configService.model.parseConfig.ui;

import com.cisco.configService.model.common.LoginConfig;
import com.cisco.configService.model.common.ui.LoginDebugView;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetConfigView {

    Boolean enable = true;

    LoginConfig loginConfig = new LoginConfig();

    private Integer timeout = 60;

    LoginDebugView debug = new LoginDebugView();

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable == null || enable;
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
    public LoginDebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(LoginDebugView debug) {
        this.debug = debug;
    }

    @Override
    public String toString() {
        return "GetConfigView{" +
                "enable=" + enable +
                ", loginConfig=" + loginConfig +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }
}

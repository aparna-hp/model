package com.cisco.configService.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginConfig {

    private String forceLoginPlatform;

    private String fallbackLoginPlatform;

    private Boolean sendEnablePassword = false;

    private String telnetUserName;

    private String telnetPassword;

    private byte[] encodedTelnetPassword;

    @JsonProperty("forceLoginPlatform")
    public String getForceLoginPlatform() {
        return forceLoginPlatform;
    }

    @JsonProperty("forceLoginPlatform")
    public void setForceLoginPlatform(String forceLoginPlatform) {
        this.forceLoginPlatform = forceLoginPlatform;
    }

    @JsonProperty("fallbackLoginPlatform")
    public String getFallbackLoginPlatform() {
        return fallbackLoginPlatform;
    }

    @JsonProperty("fallbackLoginPlatform")
    public void setFallbackLoginPlatform(String fallbackLoginPlatform) {
        this.fallbackLoginPlatform = fallbackLoginPlatform;
    }

    @JsonProperty("sendEnablePassword")
    public boolean getSendEnablePassword() {
        return sendEnablePassword;
    }

    @JsonProperty("sendEnablePassword")
    public void setSendEnablePassword(boolean sendEnablePassword) {
        this.sendEnablePassword = sendEnablePassword;
    }

    @JsonProperty("telnetUserName")
    public String getTelnetUserName() {
        return telnetUserName;
    }

    @JsonProperty("telnetUserName")
    public void setTelnetUserName(String telnetUserName) {
        this.telnetUserName = telnetUserName;
    }

    @JsonProperty("telnetPassword")
    public String getTelnetPassword() {
        return telnetPassword;
    }

    @JsonProperty("telnetPassword")
    public void setTelnetPassword(String telnetPassword) {
        this.telnetPassword = telnetPassword;
    }

    public byte[] getEncodedTelnetPassword() {
        return encodedTelnetPassword;
    }

    public void setEncodedTelnetPassword(byte[] encodedTelnetPassword) {
        this.encodedTelnetPassword = encodedTelnetPassword;
    }

    @Override
    public String toString() {
        return "LoginConfig{" +
                "forceLoginPlatform='" + forceLoginPlatform + '\'' +
                ", fallbackLoginPlatform='" + fallbackLoginPlatform + '\'' +
                ", sendEnablePassword=" + sendEnablePassword +
                ", telnetUserName='" + telnetUserName + '\'' +
                '}';
    }
}

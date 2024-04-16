package com.cisco.configService.model.topoBgp;

import com.cisco.configService.model.common.LoginConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Advanced {

    @JsonProperty("loginConfig")
    LoginConfig loginConfig = new LoginConfig();

    @JsonProperty("findInternalASNLinks")
    private Boolean findInternalASNLinks = false;

    @JsonProperty("findNonIPExitInterface")
    private Boolean findNonIPExitInterface = false;

    @JsonProperty("findInternalExitInterface")
    private Boolean findInternalExitInterface = false;

    @JsonProperty("getMacAddress")
    private Boolean getMacAddress = false;

    @JsonProperty("useDNS")
    private Boolean useDNS = false;

    @JsonProperty("forceCheckAll")
    private Boolean forceCheckAll = false;

    @JsonProperty("loginConfig")
    public LoginConfig getLoginConfig() {
        return loginConfig;
    }

    @JsonProperty("loginConfig")
    public void setLoginConfig(LoginConfig loginConfig) {
        this.loginConfig = loginConfig;
    }

    @JsonProperty("findInternalASNLinks")
    public Boolean getFindInternalASNLinks() {
        return findInternalASNLinks;
    }

    @JsonProperty("findInternalASNLinks")
    public void setFindInternalASNLinks(Boolean findInternalASNLinks) {
        this.findInternalASNLinks = findInternalASNLinks != null && findInternalASNLinks;
    }

    @JsonProperty("findNonIPExitInterface")
    public Boolean getFindNonIPExitInterface() {
        return findNonIPExitInterface;
    }

    @JsonProperty("findNonIPExitInterface")
    public void setFindNonIPExitInterface(Boolean findNonIPExitInterface) {
        this.findNonIPExitInterface = findNonIPExitInterface != null && findNonIPExitInterface;
    }

    @JsonProperty("findInternalExitInterface")
    public Boolean getFindInternalExitInterface() {
        return findInternalExitInterface;
    }

    @JsonProperty("findInternalExitInterface")
    public void setFindInternalExitInterface(Boolean findInternalExitInterface) {
        this.findInternalExitInterface = findInternalExitInterface != null && findInternalExitInterface;
    }

    @JsonProperty("getMacAddress")
    public Boolean getGetMacAddress() {
        return getMacAddress;
    }

    @JsonProperty("getMacAddress")
    public void setGetMacAddress(Boolean getMacAddress) {
        this.getMacAddress = getMacAddress != null && getMacAddress;
    }

    @JsonProperty("useDNS")
    public Boolean getUseDNS() {
        return useDNS;
    }

    @JsonProperty("useDNS")
    public void setUseDNS(Boolean useDNS) {
        this.useDNS = useDNS != null && useDNS;
    }

    @JsonProperty("forceCheckAll")
    public Boolean getForceCheckAll() {
        return forceCheckAll;
    }

    @JsonProperty("forceCheckAll")
    public void setForceCheckAll(Boolean forceCheckAll) {
        this.forceCheckAll = forceCheckAll != null && forceCheckAll;
    }

}

package com.cisco.configService.model.topoBgp.ui;

import com.cisco.configService.model.common.LoginConfig;
import com.cisco.configService.model.topoBgp.BgpCollector;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedView {

    @JsonProperty("protocol")
    private List<BgpCollector.BgpProtocol> protocol = new ArrayList<>();

    @JsonProperty("minPrefixLength")
    private Integer minPrefixLength = 24;

    @JsonProperty("minIPv6PrefixLength")
    private Integer minIPv6PrefixLength = 64;

    @JsonProperty("loginToRouterForMultihop")
    private Boolean loginToRouterForMultihop = true;

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

    @JsonProperty("timeout")
    private Integer timeout = 60;

    @JsonProperty("debug")
    private BgpDebugView debug = new BgpDebugView();

    @JsonProperty("protocol")
    public List<BgpCollector.BgpProtocol> getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(List<BgpCollector.BgpProtocol> protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("minPrefixLength")
    public Integer getMinPrefixLength() {
        return minPrefixLength;
    }

    @JsonProperty("minPrefixLength")
    public void setMinPrefixLength(Integer minPrefixLength) {
        this.minPrefixLength = minPrefixLength == null ? 24 : minPrefixLength;
    }

    @JsonProperty("minIPv6PrefixLength")
    public Integer getMinIPv6PrefixLength() {
        return minIPv6PrefixLength;
    }

    @JsonProperty("minIPv6PrefixLength")
    public void setMinIPv6PrefixLength(Integer minIPv6PrefixLength) {
        this.minIPv6PrefixLength = minIPv6PrefixLength == null ? 64 : minIPv6PrefixLength;
    }

    @JsonProperty("loginToRouterForMultihop")
    public Boolean getLoginToRouterForMultihop() {
        return loginToRouterForMultihop;
    }

    @JsonProperty("loginToRouterForMultihop")
    public void setLoginToRouterForMultihop(Boolean loginToRouterForMultihop) {
        this.loginToRouterForMultihop = loginToRouterForMultihop == null || loginToRouterForMultihop;
    }

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

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    @JsonProperty("debug")
    public BgpDebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(BgpDebugView debug) {
        this.debug = debug;
    }

    @Override
    public String toString() {
        return "AdvancedView{" +
                "protocol=" + protocol +
                ", minPrefixLength=" + minPrefixLength +
                ", minIPv6PrefixLength=" + minIPv6PrefixLength +
                ", loginToRouterForMultihop=" + loginToRouterForMultihop +
                ", loginConfig=" + loginConfig +
                ", findInternalASNLinks=" + findInternalASNLinks +
                ", findNonIPExitInterface=" + findNonIPExitInterface +
                ", findInternalExitInterface=" + findInternalExitInterface +
                ", getMacAddress=" + getMacAddress +
                ", useDNS=" + useDNS +
                ", forceCheckAll=" + forceCheckAll +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }
}

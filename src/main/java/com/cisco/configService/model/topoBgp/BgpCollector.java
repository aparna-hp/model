package com.cisco.configService.model.topoBgp;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BgpCollector extends ConfigParams {

    public enum BgpProtocol {
        IPV4, IPV6
    }

    @JsonProperty("protocol")
    private List<BgpProtocol> protocol = new ArrayList<>();

    @JsonProperty("minPrefixLength")
    private Integer minPrefixLength = 24;

    @JsonProperty("minIPv6PrefixLength")
    private Integer minIPv6PrefixLength = 64;

    @JsonProperty("loginToRouterForMultihop")
    private Boolean loginToRouterForMultihop = true;

    @JsonProperty("advanced")
    private Advanced advanced = new Advanced();

    @JsonProperty("debug")
    private Debug debug = new Debug();

    @JsonProperty("protocol")
    public List<BgpProtocol> getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(List<BgpProtocol> protocol) {
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

    @JsonProperty("advanced")
    public Advanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
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

package com.cisco.collectionService.model.srPce.lsp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcSRPath {
    private Long tunnelId;

    @JsonProperty("sid-type")
    private String sidType;
    @JsonProperty("mpls-label")
    private String mplsLabel;
    @JsonProperty("local-addr")
    private String localAddr; // Local Address
    @JsonProperty("remote-addr")
    private String remoteAddr; // Remote Address
    @JsonProperty("hop-type")
    private String hopType;

    @JsonProperty("rro-type")
    private String rroType;
    @JsonProperty("ipv4-address")
    private String ipv4Address; // IPv4 address of RRO
    @JsonProperty("flags")
    private String flags; // RRO Flags

    // SRV6
    @JsonProperty("srv6sid")
    private String srv6SID; // Full SRv6 SID"
    @JsonProperty("local-addr-v6")
    private String localAddrV6;
    @JsonProperty("remote-addr-v6")
    private String remoteAddrV6;
}

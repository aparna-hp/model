package com.cisco.collectionService.model.srPce.lsp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIntXtcTunnelKeys {
    @JsonProperty("plsp-id")
    private String plspId;
    @JsonProperty("peer-address")
    private String peerAddress;
    @JsonProperty("tunnel-name")
    private String tunnelName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetIntXtcTunnelKeys key = (NetIntXtcTunnelKeys) o;
        return getPeerAddress().equals(key.getPeerAddress()) && getPlspId().equals(key.getPlspId()) && getTunnelName().equals(key.getTunnelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeerAddress(), getPlspId(), getTunnelName());
    }
}

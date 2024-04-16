package com.cisco.collectionService.model.srPce.lsp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
@Setter
public class NetIntXtcRSVPLspIdentifiers implements NetIntXtcLspIdentifier{
    private Long id;
    private String source;
    private String destination;
    private String tunnelId;

    public NetIntXtcRSVPLspIdentifiers(String source, String destination, String tunnelId) {
        this.source = source;
        this.destination = destination;
        this.tunnelId = tunnelId;
    }

    public NetIntXtcRSVPLspIdentifiers() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetIntXtcRSVPLspIdentifiers that = (NetIntXtcRSVPLspIdentifiers) o;
        return Objects.equals(tunnelId, that.tunnelId) && Objects.equals(source, that.source) && Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, tunnelId);
    }

}

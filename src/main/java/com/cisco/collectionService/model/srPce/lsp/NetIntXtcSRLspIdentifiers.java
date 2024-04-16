package com.cisco.collectionService.model.srPce.lsp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@ToString
public class NetIntXtcSRLspIdentifiers implements NetIntXtcLspIdentifier {
    private Long id;
    private String source;
    private String destination;
    private String color;

    public NetIntXtcSRLspIdentifiers(String source, String destination, String color) {
        this.source = source;
        this.destination = destination;
        this.color = color;
    }

    public NetIntXtcSRLspIdentifiers() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetIntXtcSRLspIdentifiers that = (NetIntXtcSRLspIdentifiers) o;
        return Objects.equals(color, that.color) && Objects.equals(source, that.source) && Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, color);
    }
}

package com.cisco.configService.model.preConfig;

import com.cisco.configService.enums.SnmpSecurityLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class SnmpGroupData {

    public enum SnmpType {
        SNMPv2c, SNMPv3
    }

    public enum AuthenticationProtocol {
        SHA, MD5
    }

    public enum EncryptionProtocol {
        AES, DES
    }

    @JsonProperty("id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotNull
    private SnmpType snmpType = SnmpType.SNMPv3;

    private SnmpSecurityLevel securityLevel;

    private String username;

    private AuthenticationProtocol authenticationProtocol;

    private String authenticationPassword;

    private EncryptionProtocol encryptionProtocol;

    private String encryptionPassword;

    private String roCommunity;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;

    @Override
    public String toString() {
        return "SnmpGroupData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", snmpType=" + snmpType +
                ", securityLevel=" + securityLevel +
                ", username='" + username + '\'' +
                ", authenticationProtocol=" + authenticationProtocol +
                ", encryptionProtocol=" + encryptionProtocol +
                ", roCommunity='" + roCommunity + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}

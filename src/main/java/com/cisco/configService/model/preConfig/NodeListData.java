package com.cisco.configService.model.preConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
@NoArgsConstructor
@Data
public class NodeListData {

    @JsonProperty("id")
    Long id;

    @NotBlank
    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
            message = "Invalid Ip address specified for Node IpAddress.")
    private String nodeIp;

    @NotBlank
    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
            message = "Invalid Ip address specified for the Node Management Ip Address.")
    private String nodeManagementIp;

    @Setter(AccessLevel.NONE)
    private String authGroupName;

    @Setter(AccessLevel.NONE)
    private String snmpGroupName;

    @Value("false")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean snmpGroupMismatch;

    @Value("false")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean authGroupMismatch;

    public void setAuthGroupName(String authGroupName) {
        this.authGroupName = authGroupName;
        this.authGroupMismatch = authGroupName == null || authGroupName.isBlank();
    }

    public void setSnmpGroupName(String snmpGroupName) {
        this.snmpGroupName = snmpGroupName;
        this.snmpGroupMismatch = authGroupName == null || authGroupName.isBlank();
    }
}

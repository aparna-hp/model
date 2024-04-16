package com.cisco.configService.model;

import com.cisco.configService.model.preConfig.SnmpGroupData;
import lombok.Data;

@Data
public class DeviceCredentials {

    private String remoteName;
    private String remoteLoginType;
    private String remotePassword;
    private String remoteEnablePassword;
    private String snmpCommunityName;
    private String snmpType;
    private String snmpGroupName;
    private String snmpRemoteName;
    private String snmpSecurityLevel;
    private String snmpAuthProtocol;
    private String snmpAuthPassword;
    private String snmpEncProtocol;
    private String snmpEncPassword;
    private String nodeIp;

    public boolean isSnmpV3() {
        return SnmpGroupData.SnmpType.SNMPv3.name().equalsIgnoreCase(snmpType);
    }

    @Override
    public String toString() {
        return "DeviceCredentials{" +
                "remoteName='" + remoteName + '\'' +
                ", remoteLoginType='" + remoteLoginType + '\'' +
                ", snmpCommunityName='" + snmpCommunityName + '\'' +
                ", snmpType='" + snmpType + '\'' +
                ", snmpGroupName='" + snmpGroupName + '\'' +
                ", snmpRemoteName='" + snmpRemoteName + '\'' +
                ", snmpSecurityLevel='" + snmpSecurityLevel + '\'' +
                ", snmpAuthProtocol='" + snmpAuthProtocol + '\'' +
                ", snmpEncProtocol='" + snmpEncProtocol + '\'' +
                ", nodeIp='" + nodeIp + '\'' +
                '}';
    }
}

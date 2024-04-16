package com.cisco.configService.model.multicast;

import com.cisco.configService.model.ConfigParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class MulticastCollector extends ConfigParams {

    private SnmpFindMulticastCollector snmpFindMulticastCollector;

    private SnmpPollMulticastCollector snmpPollMulticastCollector;

    private LoginPollMulticastCollector loginPollMulticastCollector;

    private LoginFindMulticastCollector loginFindMulticastCollector;
}

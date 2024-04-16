package com.cisco.configService.model.multicast.ui;

import com.cisco.configService.model.ConfigParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class MulticastCollectorView extends ConfigParams {

    private SnmpFindMulticastCollectorView snmpFindMulticastCollector;

    private SnmpPollMulticastCollectorView snmpPollMulticastCollector;

    private LoginPollMulticastCollectorView loginPollMulticastCollector;

    private LoginFindMulticastCollectorView loginFindMulticastCollector;
}

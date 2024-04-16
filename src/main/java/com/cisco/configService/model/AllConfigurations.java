package com.cisco.configService.model;

import com.cisco.configService.model.composer.NetworkDataView;
import com.cisco.configService.model.preConfig.AgentData;
import com.cisco.configService.model.preConfig.AuthGroupData;
import com.cisco.configService.model.preConfig.NodeProfileData;
import com.cisco.configService.model.preConfig.SnmpGroupData;
import com.cisco.configService.model.scheduler.SchedulerConfigData;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AllConfigurations {

    List<SnmpGroupData> snmpGroupDataList = new ArrayList<>();

    List<AuthGroupData> authGroupDataList = new ArrayList<>();

    List<NodeProfileData> nodeProfileDataList = new ArrayList<>();

    List<AgentData> agentDataList = new ArrayList<>();

    List<NetworkDataView> networkDataList = new ArrayList<>();

    List<SchedulerConfigData> schedulerConfigDataList = new ArrayList<>();

    @Override
    public String toString() {

        return "AllConfigurations{" + "snmpGroupDataList size =" + snmpGroupDataList.size() +
                ", authGroupDataList size =" + authGroupDataList.size() +
                ", nodeProfileDataList size()=" + nodeProfileDataList.size() +
                ", agentDataList size()=" + agentDataList.size() +
                ", networkDataList size()=" + networkDataList.size() +
                ", jobInfoList size()=" + schedulerConfigDataList.size() + '}';
    }
}

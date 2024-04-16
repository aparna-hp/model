package com.cisco.workflowmanager;

import com.cisco.configService.enums.AgentTypes;
import com.cisco.configService.enums.CollectorTypes;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor @Getter
public enum TaskType {
    //Collectors
    TOPO_IGP(1, Category.COLLECTOR, CollectorTypes.TOPO_IGP, null, null) ,
    TOPO_BGPLS_XTC(2, Category.COLLECTOR, CollectorTypes.TOPO_BGPLS_XTC, null, null) ,
    TOPO_BGP(3, Category.COLLECTOR, CollectorTypes.TOPO_BGP, null, null) ,
    LSP_SNMP(4, Category.COLLECTOR, CollectorTypes.LSP_SNMP, null, null),
    LSP_PCEP_XTC(5, Category.COLLECTOR, CollectorTypes.LSP_PCEP_XTC, null, null),
    CONFIG_PARSE(6, Category.COLLECTOR, CollectorTypes.CONFIG_PARSE, null, null),
    TOPO_VPN(7, Category.COLLECTOR, CollectorTypes.TOPO_VPN, null, null) ,
    TRAFFIC_POLL(8, Category.COLLECTOR, CollectorTypes.TRAFFIC_POLL, null, null),
    INVENTORY(9, Category.COLLECTOR, CollectorTypes.INVENTORY, null, null),
    TRAFFIC_DEMAND(10, Category.COLLECTOR, CollectorTypes.TRAFFIC_DEMAND, null, null),
    NETFLOW(11, Category.COLLECTOR, CollectorTypes.NETFLOW, null, null),
    LAYOUT(12, Category.COLLECTOR, CollectorTypes.LAYOUT, null, null),
    EXTERNAL_SCRIPT(13, Category.COLLECTOR, CollectorTypes.EXTERNAL_SCRIPT, null, null),
    LOGIN_FIND_MULTICAST(14, Category.COLLECTOR, CollectorTypes.LOGIN_FIND_MULTICAST, null, null),
    LOGIN_POLL_MULTICAST(15, Category.COLLECTOR, CollectorTypes.LOGIN_POLL_MULTICAST, null, null),
    SNMP_FIND_MULTICAST(16, Category.COLLECTOR, CollectorTypes.SNMP_FIND_MULTICAST, null, null),
    SNMP_POLL_MULTICAST(17, Category.COLLECTOR, CollectorTypes.SNMP_POLL_MULTICAST, null, null),
    MULTICAST(18, Category.COLLECTOR, CollectorTypes.MULTICAST, null, null),
    DEMAND_MESH_CREATOR(19, Category.COLLECTOR, CollectorTypes.DEMAND_MESH_CREATOR, null, null),
    DEMAND_FOR_LSPS(20, Category.COLLECTOR, CollectorTypes.DEMAND_FOR_LSPS, null, null),
    DEMAND_FOR_P2MP_LSPS(21, Category.COLLECTOR, CollectorTypes.DEMAND_FOR_P2MP_LSPS, null, null),
    DEMAND_DEDUCTION(22, Category.COLLECTOR, CollectorTypes.DEMAND_DEDUCTION, null, null),
    COPY_DEMANDS(23, Category.COLLECTOR, CollectorTypes.COPY_DEMANDS, null, null),

    //Tools
    TOPO_BGPLS_XTC_TOOL(101, Category.TOOL, null, CollectorToolType.TOPO_BGPLS_XTC, null),
    //CONFIG_PARSE(Category.TOOL, null, ToolType.CONFIG_PARSE, null, ActionType.COLLECT),
    LSP_CONFIG(102, Category.TOOL, null, CollectorToolType.LSP_CONFIG, null),
    //TRAFFIC_POLL(Category.TOOL, null, ToolType.TRAFFIC_POLL, null, ActionType.COLLECT),
    INTER_AS(103, Category.TOOL, null, CollectorToolType.INTER_AS, null),
    MATE_SQL(104, Category.TOOL, null, CollectorToolType.MATE_SQL, null),
    MATE_CONVERT(105, Category.TOOL, null, CollectorToolType.MATE_CONVERT, null),
    GET_SNMP(106, Category.TOOL, null, CollectorToolType.GET_SNMP, null),
    TRIM_NODES(107, Category.TOOL, null, CollectorToolType.TRIM_NODES, null),

    //Agents
    SR_PCE_AGENT(201, Category.AGENT, null, null, AgentTypes.SR_PCE_AGENT),
    PARSE_CONFIG_AGENT(202, Category.AGENT, null, null, null),
    NETFLOW_AGENT(203, Category.AGENT, null, null, AgentTypes.NETFLOW_AGENT),
    TRAFFIC_POLLER_AGENT(204, Category.AGENT, null, null, AgentTypes.TRAFFIC_POLLER),

    //Aggregator
    AGGREGATOR(301, Category.AGGREGATOR, null, null, null),
    DARE(302, Category.AGGREGATOR, null, null, null),
    SAGE(303, Category.AGGREGATOR, null, null, null),
    ARCHIVER(304, Category.ARCHIVER, null, null, null),

    ;

    private long id;
    private Category category;
    private CollectorTypes collector;
    private CollectorToolType toolType;
    private AgentTypes agent;

    private static Map<CollectorTypes, TaskType> collectorTypeMap = new HashMap<>();
    private static Map<AgentTypes, TaskType> agentTypeMap = new HashMap<>();
    static{
        for(TaskType taskType : TaskType.values()){
            collectorTypeMap.put(taskType.getCollector(), taskType);
            if(taskType.getAgent() != null) {
                agentTypeMap.put(taskType.getAgent(), taskType);
            }
        }
    }
    public static TaskType findByCollectorType(CollectorTypes nimo){
        return collectorTypeMap.get(nimo);
    }

    public static TaskType findByAgentType(AgentTypes agent){
        return agentTypeMap.get(agent);
    }
}

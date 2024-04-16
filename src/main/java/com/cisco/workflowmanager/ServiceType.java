package com.cisco.workflowmanager;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Service types
 */
@Getter
public enum ServiceType {
    // Data collection services
    TOPO_IGP            (1, TaskType.TOPO_IGP, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    TOPO_BGPLS_XTC      (2, TaskType.TOPO_BGPLS_XTC, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    TOPO_BGP            (3, TaskType.TOPO_BGP, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    LSP_SNMP            (4, TaskType.LSP_SNMP, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    LSP_PCEP_XTC        (5, TaskType.LSP_PCEP_XTC, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    CONFIG_PARSE        (6, TaskType.CONFIG_PARSE, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    TOPO_VPN            (7, TaskType.TOPO_VPN, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    TRAFFIC_POLL        (8, TaskType.TRAFFIC_POLL, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.TRAFFIC_EXECUTOR, ConsolidationType.SAGE, false),
    INVENTORY           (9, TaskType.INVENTORY, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.SAGE, false),
    TRAFFIC_DEMAND      (10, TaskType.TRAFFIC_DEMAND, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.TRAFFIC_DEMAND_EXECUTOR, ConsolidationType.SAGE, false),
    NETFLOW             (11, TaskType.NETFLOW, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.SAGE, false),
    LAYOUT              (12, TaskType.LAYOUT, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.SAGE, false),
    EXTERNAL_SCRIPT     (13, TaskType.EXTERNAL_SCRIPT, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE,false),
    LOGIN_FIND_MULTICAST(14, TaskType.LOGIN_FIND_MULTICAST, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    LOGIN_POLL_MULTICAST(15, TaskType.LOGIN_POLL_MULTICAST, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    SNMP_FIND_MULTICAST (16, TaskType.SNMP_FIND_MULTICAST, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    SNMP_POLL_MULTICAST (17, TaskType.SNMP_POLL_MULTICAST, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    MULTICAST           (18, TaskType.MULTICAST, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.DARE, false),
    DEMAND_MESH_CREATOR (19, TaskType.DEMAND_MESH_CREATOR, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    DEMAND_FOR_LSPS     (20, TaskType.DEMAND_FOR_LSPS, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    DEMAND_FOR_P2MP_LSPS(21, TaskType.DEMAND_FOR_P2MP_LSPS, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    DEMAND_DEDUCTION    (22, TaskType.DEMAND_DEDUCTION, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    COPY_DEMANDS        (23, TaskType.COPY_DEMANDS, EntityType.DATA_COLLECTOR_SERVICE, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),

    // Collector Tools
    TOPO_BGPLS_XTC_TOOL (101, TaskType.TOPO_BGPLS_XTC_TOOL, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    LSP_CONFIG          (102, TaskType.LSP_CONFIG, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR, ConsolidationType.NONE, false),
    INTER_AS            (103, TaskType.INTER_AS, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false),
    MATE_SQL            (104, TaskType.MATE_SQL, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false),
    MATE_CONVERT        (105, TaskType.MATE_CONVERT, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false),
    GET_SNMP            (106, TaskType.GET_SNMP, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false),
    TRIM_NODES          (107, TaskType.TRIM_NODES, EntityType.COLLECTOR_TOOL, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false),

    //Agents
    SR_PCE_AGENT        (201, TaskType.SR_PCE_AGENT, EntityType.AGENT, ServiceExecutor.XTC_EXECUTOR,  ConsolidationType.NONE,false, false, null),
    PARSE_CONFIG_AGENT  (202, TaskType.PARSE_CONFIG_AGENT, EntityType.AGENT, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,false,false, null),
    NETFLOW_AGENT       (203, TaskType.NETFLOW_AGENT, EntityType.AGENT, ServiceExecutor.NETFLOW_EXECUTOR,  ConsolidationType.NONE,false,false, null),
    TRAFFIC_POLLER_AGENT(204, TaskType.TRAFFIC_POLLER_AGENT, EntityType.AGENT, ServiceExecutor.TRAFFIC_EXECUTOR,  ConsolidationType.NONE,false,false, EntityType.DATA_COLLECTOR_SERVICE),


    //Other services
    AGGREGATOR          (300, TaskType.AGGREGATOR, EntityType.AGGREGATOR, ServiceExecutor.AGGREGATOR,  ConsolidationType.NONE,false),
    DARE                (301,TaskType.DARE, EntityType.AGGREGATOR, ServiceExecutor.AGGREGATOR,  ConsolidationType.DARE,false),
    SAGE                (302,TaskType.SAGE, EntityType.AGGREGATOR, ServiceExecutor.AGGREGATOR,  ConsolidationType.SAGE,false),
    ARCHIVER            (303,TaskType.ARCHIVER, EntityType.ARCHIVER, ServiceExecutor.ARCHIVE_EXECUTOR,  ConsolidationType.NONE,false),

    //Configs
    COLLECTOR_CONFIG    (401, null, EntityType.CONFIG, ServiceExecutor.COLLECTION_SERVICE,  ConsolidationType.NONE,true),
    TASK_CALLBACK       (402, null, EntityType.CONFIG, ServiceExecutor.WORKFLOW_MANAGER,  ConsolidationType.NONE,true),
    SCHEDULE_SUBTASK    (403, null, EntityType.CONFIG, ServiceExecutor.WORKFLOW_MANAGER,  ConsolidationType.NONE,true),
    SCHEDULE_TOOL       (404, null, EntityType.CONFIG, ServiceExecutor.WORKFLOW_MANAGER,  ConsolidationType.NONE,true),
    AGENT_CONFIG        (405, null, EntityType.CONFIG, ServiceExecutor.COLLECTION_SERVICE,  ConsolidationType.NONE,true),
    NETWORK_CONFIG      (406, null, EntityType.CONFIG, ServiceExecutor.COLLECTION_SERVICE,  ConsolidationType.NONE,true),
    ARCHIVE_PLAN        (407, null, EntityType.CONFIG, ServiceExecutor.CLI_TOOL_EXECUTOR,  ConsolidationType.NONE,true),
    ARCHIVE_CREATE      (408, null, EntityType.CONFIG, ServiceExecutor.ARCHIVE_EXECUTOR,  ConsolidationType.NONE,true),
    ARCHIVE_GET         (409, null, EntityType.CONFIG, ServiceExecutor.ARCHIVE_EXECUTOR,  ConsolidationType.NONE,true),


    ;
    private int id;
    private TaskType taskType;
    private EntityType entityType;
    private ServiceExecutor executor;
    private ConsolidationType consolidationType;
    private boolean skipProcessExec;
    private boolean waitForExecutionStatus;
    private EntityType configEntityType;

    ServiceType(int id, TaskType taskType, EntityType entityType, ServiceExecutor executor, ConsolidationType consolidationType, boolean skipProcessExec) {
        //Default 'waitForExecutionStatus'
        this(id, taskType, entityType, executor, consolidationType, skipProcessExec, true, null);
    }

    ServiceType(int id, TaskType taskType, EntityType entityType, ServiceExecutor executor, ConsolidationType consolidationType, boolean skipProcessExec, boolean waitForExecutionStatus, EntityType configEntityType) {
        this.id = id;
        this.taskType = taskType;
        this.entityType = entityType;
        this.executor = executor;
        this.consolidationType = consolidationType;
        this.skipProcessExec = skipProcessExec;
        this.waitForExecutionStatus = waitForExecutionStatus;
        this.configEntityType = configEntityType;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public String getInfo(){
        return this.name()+"("+entityType+"-"+executor+")";
    }

    private static Map<TaskType, ServiceType> taskToServiceMap = new HashMap<>();

    static{
        for(ServiceType serviceType : ServiceType.values()){
            taskToServiceMap.put(serviceType.getTaskType(), serviceType);
        }
    }

    public static Optional<ServiceType> findByTaskType(TaskType taskType){
        return Optional.ofNullable(taskToServiceMap.get(taskType));
    }
}

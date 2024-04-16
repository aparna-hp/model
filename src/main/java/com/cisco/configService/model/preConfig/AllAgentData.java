package com.cisco.configService.model.preConfig;

import com.cisco.collectionService.model.srPce.status.XtcAgentStatusDto;
import com.cisco.configService.enums.AgentTypes;
import com.cisco.configService.model.netflow.status.NetflowClusterStatus;
import com.cisco.configService.model.srPce.status.WorkerStatus;
import com.cisco.configService.model.trafficPoller.CPStatusResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllAgentData {

    private static final Logger logger = LogManager.getLogger(AllAgentData.class);

    @JsonProperty("id")
    Long id;

    @NotNull
    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private AgentTypes type;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private XtcAgentStatusDto srPceDetailStatus;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private WorkerStatus.ConnectionStatusEnum topoConnectionStatus;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private WorkerStatus.ConnectionStatusEnum lspConnectionStatus;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private NetflowClusterStatus netflowDetailStatus;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Boolean netflowStatus;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private CPStatusResponse trafficPollerStatus;

}

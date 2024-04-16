package com.cisco.configService.model.demand;

import com.cisco.configService.enums.CollectorTypes;
import com.cisco.configService.model.custom.CustomCollector;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class DemandTool {

    @JsonProperty("dmds-for-p2mplsps")
    private DmdsForP2mplsps dmdsForP2mplsps;

    @JsonProperty("demand-deduction")
    private DemandDeduction demandDeduction;

    @JsonProperty("external-executable-script")
    private CustomCollector externalExecutable;

    @JsonProperty("copy-demands")
    private CopyDemands copyDemands;

    @JsonProperty("dmds-for-lsps")
    private DmdsForLsps dmdsForLsps;

    @JsonProperty("dmd-mesh-creator")
    private DmdMeshCreator dmdMeshCreator;

    @JsonIgnore
    public CollectorTypes getToolType(){
        if(null != dmdMeshCreator) {
            return CollectorTypes.DEMAND_MESH_CREATOR;
        }

        if(null != dmdsForLsps) {
            return CollectorTypes.DEMAND_FOR_LSPS;
        }

        if(null != dmdsForP2mplsps) {
            return CollectorTypes.DEMAND_FOR_P2MP_LSPS;
        }

        if(null != demandDeduction) {
            return CollectorTypes.DEMAND_DEDUCTION;
        }

        if(null != copyDemands) {
            return CollectorTypes.COPY_DEMANDS;
        }

        if(null != externalExecutable) {
            return CollectorTypes.EXTERNAL_SCRIPT;
        }

        return CollectorTypes.TRAFFIC_DEMAND;
    }
}

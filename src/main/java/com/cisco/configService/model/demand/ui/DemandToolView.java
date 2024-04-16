package com.cisco.configService.model.demand.ui;

import com.cisco.configService.enums.CollectorTypes;
import com.cisco.configService.model.custom.CustomCollector;
import com.cisco.configService.model.demand.CopyDemands;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandToolView {

    @XmlElement(name = "dmds-for-p2mplsps", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("dmds-for-p2mplsps")
    private DmdsForP2mplspsView dmdsForP2mplsps;

    @XmlElement(name = "demand-deduction", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("demand-deduction")
    private DemandDeductionView demandDeduction;

    @XmlElement(name = "external-executable-script", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("external-executable-script")
    private CustomCollector externalExecutable;

    @XmlElement(name = "copy-demands", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("copy-demands")
    private CopyDemands copyDemands;

    @XmlElement(name = "dmds-for-lsps", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("dmds-for-lsps")
    private DmdsForLspsView dmdsForLsps;

    @XmlElement(name = "dmd-mesh-creator", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("dmd-mesh-creator")
    private DmdMeshCreatorView dmdMeshCreator;

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

package com.cisco.configService.model.demand;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Min;

public class DemandDeduction extends ConfigParams {

    @JsonProperty("fixDemandsWithTraffic")
    private Boolean fixDemandsWithTraffic = false;

    @JsonProperty("demandUpperBound")
    @Min(0)
    private Float demandUpperBound;

    @JsonProperty("removeZeroBwDemands")
    private Boolean removeZeroBwDemands = true;

    @JsonProperty("zeroBwTolerance")
    @Min(0)
    private Float zeroBwTolerance;

    @JsonProperty("zeroFlowTolerance")
    @Min(0)
    private Float zeroFlowTolerance;

    @JsonProperty("measurements")
    private Measurements measurements = new Measurements();

    @JsonProperty("advanced")
    private DemandDeductionAdvanced advanced = new DemandDeductionAdvanced();

    @JsonProperty("fixDemandsWithTraffic")
    public Boolean getFixDemandsWithTraffic() {
        return fixDemandsWithTraffic;
    }

    @JsonProperty("fixDemandsWithTraffic")
    public void setFixDemandsWithTraffic(Boolean fixDemandsWithTraffic) {
        this.fixDemandsWithTraffic = fixDemandsWithTraffic != null && fixDemandsWithTraffic;
    }

    @JsonProperty("demandUpperBound")
    public Float getDemandUpperBound() {
        return demandUpperBound;
    }

    @JsonProperty("demandUpperBound")
    public void setDemandUpperBound(Float demandUpperBound) {
        this.demandUpperBound = demandUpperBound;
    }

    @JsonProperty("removeZeroBwDemands")
    public Boolean getRemoveZeroBwDemands() {
        return removeZeroBwDemands;
    }

    @JsonProperty("removeZeroBwDemands")
    public void setRemoveZeroBwDemands(Boolean removeZeroBwDemands) {
        this.removeZeroBwDemands = removeZeroBwDemands == null || removeZeroBwDemands;
    }

    @JsonProperty("zeroBwTolerance")
    public Float getZeroBwTolerance() {
        return zeroBwTolerance;
    }

    @JsonProperty("zeroBwTolerance")
    public void setZeroBwTolerance(Float zeroBwTolerance) {
        this.zeroBwTolerance = zeroBwTolerance;
    }

    @JsonProperty("zeroFlowTolerance")
    public Float getZeroFlowTolerance() {
        return zeroFlowTolerance;
    }

    @JsonProperty("zeroFlowTolerance")
    public void setZeroFlowTolerance(Float zeroFlowTolerance) {
        this.zeroFlowTolerance = zeroFlowTolerance;
    }

    @JsonProperty("measurements")
    public Measurements getMeasurements() {
        return measurements;
    }

    @JsonProperty("measurements")
    public void setMeasurements(Measurements measurements) {
        this.measurements = measurements;
    }

    @JsonProperty("advanced")
    public DemandDeductionAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(DemandDeductionAdvanced advanced) {
        this.advanced = advanced;
    }
}

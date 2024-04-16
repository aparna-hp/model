package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.demand.Measurements;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Min;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandDeductionView extends ConfigParams {

    @JsonIgnore
    @XmlElement(name = "enabled", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    private Boolean enabled = false;


    @XmlElement(name = "fix-demands-with-traffic", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("fixDemandsWithTraffic")
    private Boolean fixDemandsWithTraffic = false;

    @XmlElement(name = "demand-upper-bound", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("demandUpperBound")
    @Min(0)
    private Float demandUpperBound;

    @XmlElement(name = "remove-zero-bw-demands", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("removeZeroBwDemands")
    private Boolean removeZeroBwDemands = true;

    @XmlElement(name = "zero-bw-tolerance", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("zeroBwTolerance")
    @Min(0)
    private Float zeroBwTolerance;

    @XmlElement(name = "zero-flow-tolerance", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("zeroFlowTolerance")
    @Min(0)
    private Float zeroFlowTolerance;

    @XmlElement(name = "measurements", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("measurements")
    private Measurements measurements = new Measurements();

    @XmlElement(name = "advanced", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("advanced")
    private DemandDeductionAdvancedView advancedView = new DemandDeductionAdvancedView();

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

    @JsonIgnore
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonIgnore
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("advanced")
    public DemandDeductionAdvancedView getAdvancedView() {
        return advancedView;
    }

    @JsonProperty("advanced")
    public void setAdvancedView(DemandDeductionAdvancedView advancedView) {
        this.advancedView = advancedView;
    }
}

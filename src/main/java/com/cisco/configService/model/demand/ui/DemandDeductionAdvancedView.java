package com.cisco.configService.model.demand.ui;

import com.cisco.configService.model.demand.DemandDeductionAdvanced;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Min;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class DemandDeductionAdvancedView {

    @XmlElement(name = "demands-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("demandsTable")
    private String demandsTable;

    @XmlElement(name = "fix-demands-table", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("fixDemandsTable")
    private String fixDemandsTable;

    @XmlElement(name = "fix-multicast-demands", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("fixMulticastDemands")
    private Boolean fixMulticastDemands = false;

    @XmlElement(name = "report-file", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("reportFile")
    private String reportFile;

    @XmlElement(name = "traffic-level", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("trafficLevel")
    private String trafficLevel;

    @XmlElement(name = "scale-measurements", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("scaleMeasurements")
    private List<String> scaleMeasurements;

    @XmlElement(name = "meas-errors", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("measErrors")
    private String measErrors = DemandDeductionAdvanced.MeasurementErrors.SPREAD.name();

    @XmlElement(name = "max-percent-link-util", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("maxPercentLinkUtil")
    private String maxPercentLinkUtil;

    @XmlElement(name = "only-tunnel-as", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("onlyTunnelAs")
    private String onlyTunnelAs;

    @XmlElement(name = "options-file", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("optionsFile")
    private String optionsFile;

    @XmlElement(name = "no-global-options", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @XmlElement(name = "suppress-progress", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @XmlElement(name = "computation-time", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("computationTime")
    @Min(10)
    private Long computationTime = 10L;

    @XmlElement(name = "warn-dynamic-lsps", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("warnDynamicLsps")
    private Boolean warnDynamicLsps = false;

    @XmlElement(name = "warn-unrouted-lsps", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonProperty("warnUnroutedLsps")
    private Boolean warnUnroutedLsps = false;
    
    @JsonProperty("debug")
    private Debug debug = new Debug();

    @XmlElement(name = "verbosity", namespace = "http://cisco.com/ns/wae/traffic-demands-nimo")
    @JsonIgnore
    private Integer verbosity;

    @JsonProperty("demandsTable")
    public String getDemandsTable() {
        return demandsTable;
    }

    @JsonProperty("demandsTable")
    public void setDemandsTable(String demandsTable) {
        this.demandsTable = demandsTable;
    }

    @JsonProperty("fixDemandsTable")
    public String getFixDemandsTable() {
        return fixDemandsTable;
    }

    @JsonProperty("fixDemandsTable")
    public void setFixDemandsTable(String fixDemandsTable) {
        this.fixDemandsTable = fixDemandsTable;
    }

    @JsonProperty("reportFile")
    public String getReportFile() {
        return reportFile;
    }

    @JsonProperty("reportFile")
    public void setReportFile(String reportFile) {
        this.reportFile = reportFile;
    }

    @JsonProperty("trafficLevel")
    public String getTrafficLevel() {
        return trafficLevel;
    }

    @JsonProperty("trafficLevel")
    public void setTrafficLevel(String trafficLevel) {
        this.trafficLevel = trafficLevel;
    }

    @JsonProperty("scaleMeasurements")
    public List<String> getScaleMeasurements() {
        return scaleMeasurements;
    }

    @JsonProperty("scaleMeasurements")
    public void setScaleMeasurements(List<String> scaleMeasurements) {
        this.scaleMeasurements = scaleMeasurements;
    }

    @JsonProperty("maxPercentLinkUtil")
    public String getMaxPercentLinkUtil() {
        return maxPercentLinkUtil;
    }

    @JsonProperty("maxPercentLinkUtil")
    public void setMaxPercentLinkUtil(String maxPercentLinkUtil) {
        this.maxPercentLinkUtil = maxPercentLinkUtil;
    }

    @JsonProperty("onlyTunnelAs")
    public String getOnlyTunnelAs() {
        return onlyTunnelAs;
    }

    @JsonProperty("onlyTunnelAs")
    public void setOnlyTunnelAs(String onlyTunnelAs) {
        this.onlyTunnelAs = onlyTunnelAs;
    }

    @JsonProperty("optionsFile")
    public String getOptionsFile() {
        return optionsFile;
    }

    @JsonProperty("optionsFile")
    public void setOptionsFile(String optionsFile) {
        this.optionsFile = optionsFile;
    }

    @JsonProperty("warnUnroutedLsps")
    public Boolean getWarnUnroutedLsps() {
        return warnUnroutedLsps;
    }

    @JsonProperty("warnUnroutedLsps")
    public void setWarnUnroutedLsps(Boolean warnUnroutedLsps) {
        this.warnUnroutedLsps = warnUnroutedLsps != null && warnUnroutedLsps;
    }

    @JsonProperty("fixMulticastDemands")
    public Boolean getFixMulticastDemands() {
        return fixMulticastDemands;
    }

    @JsonProperty("fixMulticastDemands")
    public void setFixMulticastDemands(Boolean fixMulticastDemands) {
        this.fixMulticastDemands = fixMulticastDemands;
    }

    @JsonProperty("measErrors")
    public String getMeasErrors() {
        return measErrors;
    }

    @JsonProperty("measErrors")
    public void setMeasErrors(String measErrors) {
        this.measErrors = measErrors == null ? DemandDeductionAdvanced.MeasurementErrors.SPREAD.name() : measErrors;
    }

    @JsonProperty("noGlobalOptions")
    public Boolean getNoGlobalOptions() {
        return noGlobalOptions;
    }

    @JsonProperty("noGlobalOptions")
    public void setNoGlobalOptions(Boolean noGlobalOptions) {
        this.noGlobalOptions = noGlobalOptions != null && noGlobalOptions;
    }

    @JsonProperty("suppressProgress")
    public Boolean getSuppressProgress() {
        return suppressProgress;
    }

    @JsonProperty("suppressProgress")
    public void setSuppressProgress(Boolean suppressProgress) {
        this.suppressProgress = suppressProgress != null && suppressProgress;
    }

    @JsonProperty("computationTime")
    public void setComputationTime(Long computationTime) {
        this.computationTime = computationTime == null ? 10L : computationTime;
    }

    @JsonProperty("computationTime")
    public Long getComputationTime() {
        return computationTime;
    }

    @JsonProperty("warnDynamicLsps")
    public Boolean getWarnDynamicLsps() {
        return warnDynamicLsps;
    }

    @JsonProperty("warnDynamicLsps")
    public void setWarnDynamicLsps(Boolean warnDynamicLsps) {
        this.warnDynamicLsps = warnDynamicLsps != null && warnDynamicLsps;
    }

    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    @JsonIgnore
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonIgnore
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }
}

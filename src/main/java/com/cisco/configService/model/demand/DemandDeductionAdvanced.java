package com.cisco.configService.model.demand;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Min;
import java.util.List;

public class DemandDeductionAdvanced {

    public enum MeasurementErrors {
        CONCENTRATE, SPREAD
    }

    @JsonProperty("demandsTable")
    private String demandsTable;

    @JsonProperty("fixDemandsTable")
    private String fixDemandsTable;

    @JsonProperty("fixMulticastDemands")
    private Boolean fixMulticastDemands = false;

    @JsonProperty("reportFile")
    private String reportFile;

    @JsonProperty("trafficLevel")
    private String trafficLevel;

    @JsonProperty("scaleMeasurements")
    private List<String> scaleMeasurements;

    @JsonProperty("measErrors")
    private MeasurementErrors measErrors = MeasurementErrors.SPREAD;

    @JsonProperty("maxPercentLinkUtil")
    private String maxPercentLinkUtil;

    @JsonProperty("onlyTunnelAs")
    private String onlyTunnelAs;

    @JsonProperty("optionsFile")
    private String optionsFile;

    @JsonProperty("noGlobalOptions")
    private Boolean noGlobalOptions = false;

    @JsonProperty("suppressProgress")
    private Boolean suppressProgress = false;

    @JsonProperty("computationTime")
    @Min(10)
    private Long computationTime = 10L;

    @JsonProperty("warnDynamicLsps")
    private Boolean warnDynamicLsps = false;

    @JsonProperty("warnUnroutedLsps")
    private Boolean warnUnroutedLsps = false;

    @JsonProperty("verbosity")
    private Integer verbosity = 30;

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
    public MeasurementErrors getMeasErrors() {
        return measErrors;
    }

    @JsonProperty("measErrors")
    public void setMeasErrors(MeasurementErrors measErrors) {
        this.measErrors = measErrors == null ? MeasurementErrors.SPREAD : measErrors;
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

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity == null ? 30 : verbosity;
    }
}

package com.cisco.configService.model.parseConfig;

import com.cisco.configService.enums.IgpProtocol;
import com.cisco.configService.enums.IsisLevel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ParseConfig {

    public enum IncludeObject {
        LAG, SRLG, RSVP, VPN, FRR, SR_LSPS, LMP, SR_POLICIES
    }

    private IgpProtocol igpProtocol = IgpProtocol.ISIS;

    private String isisLevel = IsisLevel.TWO.getValue();

    private String ospfArea = "0.0.0.0";

    private Integer asn;

    List<IncludeObject> includeObjects = new ArrayList<>();

    ParseConfigAdvanced parseConfigAdvanced = new ParseConfigAdvanced();

    @JsonProperty("igpProtocol")
    public IgpProtocol getIgpProtocol() {
        return igpProtocol;
    }

    @JsonProperty("igpProtocol")
    public void setIgpProtocol(IgpProtocol igpProtocol) {
        this.igpProtocol = igpProtocol == null ? IgpProtocol.ISIS : igpProtocol;
    }

    @JsonProperty("isisLevel")
    public String getIsisLevel() {
        return isisLevel;
    }

    @JsonProperty("isisLevel")
    public void setIsisLevel(String isisLevel) {
        this.isisLevel = isisLevel == null ? IsisLevel.TWO.getValue() : isisLevel;
    }

    @JsonProperty("ospfArea")
    public String getOspfArea() {
        return ospfArea;
    }

    @JsonProperty("ospfArea")
    public void setOspfArea(String ospfArea) {
        this.ospfArea = ospfArea == null ? "0.0.0.0" : ospfArea ;
    }

    @JsonProperty("asn")
    public Integer getAsn() {
        return asn;
    }

    @JsonProperty("asn")
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    @JsonProperty("includeObjects")
    public List<IncludeObject> getIncludeObjects() {
        return includeObjects;
    }

    @JsonProperty("includeObjects")
    public void setIncludeObjects(List<IncludeObject> includeObjects) {
        this.includeObjects = includeObjects;
    }

    @JsonProperty("parseConfigAdvanced")
    public ParseConfigAdvanced getParseConfigAdvanced() {
        return parseConfigAdvanced;
    }

    @JsonProperty("parseConfigAdvanced")
    public void setParseConfigAdvanced(ParseConfigAdvanced parseConfigAdvanced) {
        this.parseConfigAdvanced = parseConfigAdvanced;
    }
}

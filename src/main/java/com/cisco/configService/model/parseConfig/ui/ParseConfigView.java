package com.cisco.configService.model.parseConfig.ui;

import com.cisco.configService.enums.IgpProtocol;
import com.cisco.configService.enums.IsisLevel;
import com.cisco.configService.model.parseConfig.ParseConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ParseConfigView {

    private IgpProtocol igpProtocol = IgpProtocol.ISIS;

    private String isisLevel = IsisLevel.TWO.getValue();

    private String ospfArea = "0.0.0.0";

    private Integer asn;

    List<ParseConfig.IncludeObject> includeObjects = new ArrayList<>();

    ParseConfigAdvancedView parseConfigAdvanced = new ParseConfigAdvancedView();

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
    public List<ParseConfig.IncludeObject> getIncludeObjects() {
        return includeObjects;
    }

    @JsonProperty("includeObjects")
    public void setIncludeObjects(List<ParseConfig.IncludeObject> includeObjects) {
        this.includeObjects = includeObjects;
    }

    @JsonProperty("parseConfigAdvanced")
    public ParseConfigAdvancedView getParseConfigAdvanced() {
        return parseConfigAdvanced;
    }

    @JsonProperty("parseConfigAdvanced")
    public void setParseConfigAdvanced(ParseConfigAdvancedView parseConfigAdvanced) {
        this.parseConfigAdvanced = parseConfigAdvanced;
    }

    @Override
    public String toString() {
        return "ParseConfigView{" +
                "igpProtocol=" + igpProtocol +
                ", isisLevel='" + isisLevel + '\'' +
                ", ospfArea='" + ospfArea + '\'' +
                ", asn=" + asn +
                ", includeObjects=" + includeObjects +
                ", parseConfigAdvanced=" + parseConfigAdvanced +
                '}';
    }
}

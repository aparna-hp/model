
package com.cisco.configService.model.topoIgp;


import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.IgpConfigs;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class IgpCollector extends ConfigParams {

    @NotNull
    private List<IgpConfigs> igpConfigs;

    private Boolean collectInterfaces = true;

    private IgpCollectorAdvanced advanced = new IgpCollectorAdvanced();

    @JsonProperty("igpConfigs")
    public List<IgpConfigs> getIgpConfigs() {
        return igpConfigs;
    }

    @JsonProperty("igpConfigs")
    public void setIgpConfigs(List<IgpConfigs> igpConfigs) {
        this.igpConfigs = igpConfigs;
    }

    @JsonProperty("collectInterfaces")
    public Boolean getCollectInterfaces() {
        return collectInterfaces;
    }

    @JsonProperty("collectInterfaces")
    public void setCollectInterfaces(Boolean collectInterfaces) {
        this.collectInterfaces = collectInterfaces == null || collectInterfaces;
    }

    @JsonProperty("advanced")
    public IgpCollectorAdvanced getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(IgpCollectorAdvanced advanced) {
        this.advanced = advanced;
    }
}

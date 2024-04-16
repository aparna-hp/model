
package com.cisco.configService.model.topoIgp.ui;


import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.ui.IgpConfigsView;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@EqualsAndHashCode(callSuper=true)
public class IgpCollectorView extends ConfigParams {

    @NotNull
    private List<@Valid IgpConfigsView> igpConfigs;

    private Boolean collectInterfaces = true;

    private IgpCollectorAdvancedView advanced = new IgpCollectorAdvancedView();

    @JsonProperty("igpConfigs")
    public List<IgpConfigsView> getIgpConfigs() {
        return igpConfigs;
    }

    @JsonProperty("igpConfigs")
    public void setIgpConfigs(List<IgpConfigsView> igpConfigs) {
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
    public IgpCollectorAdvancedView getAdvanced() {
        return advanced;
    }

    @JsonProperty("advanced")
    public void setAdvanced(IgpCollectorAdvancedView advanced) {
        this.advanced = advanced;
    }

    @Override
    public String toString() {
        return "IgpCollectorView{" +
                "igpConfigs=" + igpConfigs +
                ", collectInterfaces=" + collectInterfaces +
                ", advanced=" + advanced +
                '}';
    }
}

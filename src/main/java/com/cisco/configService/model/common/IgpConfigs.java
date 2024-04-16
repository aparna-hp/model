
package com.cisco.configService.model.common;


import com.cisco.configService.model.topoIgp.IgpConfigAdvanced;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class IgpConfigs {

    @NotNull
    @JsonProperty("igpIndex")
    private Integer igpIndex;

    @NotBlank
    @JsonProperty("seedRouter")
    private String seedRouter;

    @NotBlank
    @JsonProperty("igpProtocol")
    private String igpProtocol;

    @JsonProperty("advanced")
    private IgpConfigAdvanced advanced = new IgpConfigAdvanced();

}

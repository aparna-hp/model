
package com.cisco.configService.model.common.ui;


import com.cisco.configService.model.topoIgp.ui.IgpConfigAdvancedView;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class IgpConfigsView {

    @NotNull
    @JsonProperty("igpIndex")
    private Integer igpIndex;

    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
    message = "Invalid Ip address specified for the seed router.")
    @JsonProperty("seedRouter")
    private String seedRouter;

    @NotBlank
    @JsonProperty("igpProtocol")
    private String igpProtocol;

    @JsonProperty("advanced")
    private IgpConfigAdvancedView advanced = new IgpConfigAdvancedView();

}


package com.cisco.configService.model.topoIgp.ui;


import com.cisco.configService.model.common.ui.InterfacesView;
import com.cisco.configService.model.common.ui.NodesView;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IgpCollectorAdvancedView {

    @JsonProperty("nodes")
    public NodesView nodes = new NodesView();

    @JsonProperty("interfaces")
    public InterfacesView interfaces = new InterfacesView();

}

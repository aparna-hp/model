package com.cisco.configService.model.inventory.ui;

import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInventoryOptionsView {

    private Boolean loginAllowed = true;

    private DebugView debug = new DebugView();

    @JsonProperty("loginAllowed")
    public Boolean getLoginAllowed() {
        return loginAllowed;
    }

    @JsonProperty("loginAllowed")
    public void setLoginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed == null || loginAllowed;
    }

    @JsonProperty("debug")
    public DebugView getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(DebugView debug) {
        this.debug = debug;
    }
}

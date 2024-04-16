package com.cisco.configService.model.topoBgp.ui;

import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.common.ui.DebugView;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BgpDebugView extends DebugView {

    @JsonProperty("loginRecordMode")
    private RecordMode loginRecordMode = RecordMode.OFF;

    @JsonProperty("loginRecordMode")
    public RecordMode getLoginRecordMode() {
        return loginRecordMode;
    }

    @JsonProperty("loginRecordMode")
    public void setLoginRecordMode(RecordMode loginRecordMode) {
        this.loginRecordMode = loginRecordMode == null ? RecordMode.OFF : loginRecordMode;
    }

}

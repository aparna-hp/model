package com.cisco.configService.model.topoVpn.ui;

import com.cisco.configService.model.ConfigParams;
import com.cisco.configService.model.common.ui.DebugView;
import com.cisco.configService.model.topoVpn.VpnCollector;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class VpnCollectorView extends ConfigParams {

    @JsonProperty("vpnType")
    private List<VpnCollector.VpnType> vpnType = new ArrayList<>();

    @JsonProperty("advanced")
    private Advanced advanced = new Advanced();

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Advanced {
        private Integer timeout = 60;

        @JsonProperty("debug")
        private DebugView debug = new DebugView();

        @JsonProperty("timeout")
        public Integer getTimeout() {
            return timeout;
        }

        @JsonProperty("timeout")
        public void setTimeout(Integer timeout) {
            this.timeout = timeout == null ? 60 : timeout;
        }

        @JsonProperty("debug")
        public DebugView getDebug() {
            return debug;
        }

        @JsonProperty("debug")
        public void setDebug(DebugView debug) {
            this.debug = debug;
        }

        @Override
        public String toString() {
            return "Advanced{" +
                    "timeout=" + timeout +
                    ", debug=" + debug +
                    '}';
        }
    }
}

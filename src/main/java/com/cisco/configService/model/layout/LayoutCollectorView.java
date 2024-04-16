package com.cisco.configService.model.layout;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class LayoutCollectorView extends ConfigParams {

    private String templateFile;

    private Advanced advanced = new Advanced();

    public static class Advanced {

        private Integer connectTimeout = 60;

        List<Map<String, String>> advancedToolOptions = new ArrayList<>();

        @JsonProperty("advancedToolOptions")
        public List<Map<String, String>> getAdvancedToolOptions() {
            return advancedToolOptions;
        }

        @JsonProperty("advancedToolOptions")
        public void setAdvancedToolOptions(List<Map<String, String>> advancedToolOptions) {
            this.advancedToolOptions = advancedToolOptions;
        }

        @JsonProperty("connectTimeout")
        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        @JsonProperty("connectTimeout")
        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout == null ? 60 : connectTimeout;
        }
    }
}

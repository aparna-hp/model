package com.cisco.configService.model.custom;

import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomCollector extends ConfigParams {

    public enum ScriptLanguages {
        PYTHON, PERL, SHELL
    }

    @NotNull
    @JsonProperty("executableScript")
    private String executableScript;

    @JsonProperty("scriptLanguage")
    private ScriptLanguages scriptLanguage;

    @JsonProperty("compressedFile")
    private String compressedFile;

    @JsonProperty("aggregatorProperties")
    private String aggregatorProperties;

    @JsonProperty("inputPlanFile")
    private String inputPlanFile;

    @JsonProperty("timeout")
    private Integer timeout;

}

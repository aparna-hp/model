package com.cisco.configService.model.inventory.ui;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildInventoryOptionsView {

    private String excludeFile;

    private Boolean guessTemplateIfNoMatch = false;

    private String templateFile;

    private String hardwareSpecFile;

    private Debug debug = new Debug();

    @JsonProperty("excludeFile")
    public String getExcludeFile() {
        return excludeFile;
    }

    @JsonProperty("excludeFile")
    public void setExcludeFile(String excludeFile) {
        this.excludeFile = excludeFile;
    }

    @JsonProperty("guessTemplateIfNoMatch")
    public Boolean getGuessTemplateIfNoMatch() {
        return guessTemplateIfNoMatch;
    }

    @JsonProperty("guessTemplateIfNoMatch")
    public void setGuessTemplateIfNoMatch(Boolean guessTemplateIfNoMatch) {
        this.guessTemplateIfNoMatch = guessTemplateIfNoMatch != null && guessTemplateIfNoMatch;
    }

    @JsonProperty("templateFile")
    public String getTemplateFile() {
        return templateFile;
    }

    @JsonProperty("templateFile")
    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    @JsonProperty("hardwareSpecFile")
    public String getHardwareSpecFile() {
        return hardwareSpecFile;
    }

    @JsonProperty("hardwareSpecFile")
    public void setHardwareSpecFile(String hardwareSpecFile) {
        this.hardwareSpecFile = hardwareSpecFile;
    }

    public Debug getDebug() {
        return debug;
    }

    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    public static class Debug {

        private Integer verbosity = 30;

        @JsonProperty("verbosity")
        public Integer getVerbosity() {
            return verbosity;
        }

        @JsonProperty("verbosity")
        public void setVerbosity(Integer verbosity) {
            this.verbosity = verbosity == null ? 30 : verbosity;
        }

    }

}

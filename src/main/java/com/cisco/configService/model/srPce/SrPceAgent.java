package com.cisco.configService.model.srPce;

import com.cisco.configService.enums.RecordMode;
import com.cisco.configService.model.ConfigParams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = true)
public class SrPceAgent extends ConfigParams {

    public enum CollectionType {
        COLLECTION_ONLY, COLLECTION_AND_SUBSCRIPTION, OFF
    }

    public enum AuthenticationType {
        BASIC, NONE , DIGEST
    }

    @XmlElement( name = "enabled",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private Boolean enabled = true;

    @JsonIgnore
    @XmlElement( name = "name",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private String name;

    @Pattern(regexp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\."
            + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])",
    message = "Invalid IP Address")
    @XmlElement( name = "xtc-host-ip",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private String xtcHostIP;


    @XmlElement( name = "xtc-rest-port",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private Integer xtcRestPort = 8080;

    private AuthenticationType authenticationType = AuthenticationType.BASIC;

    @XmlElement( name = "use-auth",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @JsonIgnore
    private Boolean useAuth = false;

    @XmlElement( name = "auth-group",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private String authGroup;

    private String username;

    private String password;

    private byte[] encodedPassword;

    @XmlElement( name = "batch-size",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @Min(0)
    private Integer batchSize = 1000;

    @XmlElement( name = "max-lsp-history",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @Min(0)
    private Integer maxLspHistory = 0;

    @XmlElement( name = "keep-alive-interval",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @Min(0)
    private Integer keepAliveInterval =10;

    @XmlElement( name = "connection-timeout-interval",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @Min(0)
    private Integer connectionTimeoutInterval = 60;

    @Min(0)
    private Integer connectionRetryCount = 3;

    @XmlElement( name = "keep-alive-threshold",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @Min(0)
    private Integer keepAliveThreshold = 2;

    @XmlElement( name = "net-recorder",namespace = "http://cisco.com/ns/wae/xtc-agent")
    @JsonIgnore
    private String netRecordStr;

    private RecordMode netRecorderMode = RecordMode.OFF;

    private Boolean eventBufferingEnabled = true;

    @Min(0)
    private Integer playbackEventsDelay = 0;

    @Min(30)
    @Max(300)
    private Integer eventsBufferTime = 30;

    @Min(1)
    private Integer poolSize;

    private CollectionType topologyCollection = CollectionType.COLLECTION_AND_SUBSCRIPTION;

    protected CollectionType lspCollection = CollectionType.COLLECTION_AND_SUBSCRIPTION;

    @XmlElement( name = "advanced",namespace = "http://cisco.com/ns/wae/xtc-agent")
    private SrpceAgentAdvanced advanced = new SrpceAgentAdvanced();

    @JsonProperty(value = "enabled")
    public Boolean isEnabled() {
        return enabled;
    }

    @JsonProperty(value = "enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled == null || enabled;
    }

    @JsonIgnore
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty(value = "xtcHostIP")
    public String getXtcHostIP() {
        return xtcHostIP;
    }

    @JsonProperty(value = "xtcHostIP")
    public void setXtcHostIP(String xtcHostIP) {
        this.xtcHostIP = xtcHostIP;
    }

    @JsonProperty(value = "xtcRestPort")
    public Integer getXtcRestPort() {
        return xtcRestPort;
    }

    @JsonProperty(value = "xtcRestPort")
    public void setXtcRestPort(Integer xtcRestPort) {
        this.xtcRestPort = xtcRestPort == null ? 8080 : xtcRestPort;
    }

    @JsonProperty(value = "authenticationType")
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    @JsonProperty(value = "authenticationType")
    public void setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType == null ? AuthenticationType.BASIC : authenticationType;
    }

    @JsonIgnore
    public Boolean getUseAuth() {
        return useAuth;
    }

    @JsonIgnore
    public void setUseAuth(Boolean useAuth) {
        this.useAuth = useAuth;
    }

    public String getAuthGroup() {
        return authGroup;
    }

    public void setAuthGroup(String authGroup) {
        this.authGroup = authGroup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getEncodedPassword() {
        return encodedPassword;
    }

    public void setEncodedPassword(byte[] encodedPassword) {
        this.encodedPassword = encodedPassword;
    }

    @JsonProperty(value = "batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    @JsonProperty(value = "batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize == null ? 1000 : batchSize;
    }

    @JsonProperty(value = "maxLspHistory")
    public Integer getMaxLspHistory() {
        return maxLspHistory;
    }

    @JsonProperty(value = "maxLspHistory")
    public void setMaxLspHistory(Integer maxLspHistory) {
        this.maxLspHistory = maxLspHistory == null ? 0 : maxLspHistory;
    }

    @JsonProperty(value = "keepAliveInterval")
    public Integer getKeepAliveInterval() {
        return keepAliveInterval;
    }

    @JsonProperty(value = "keepAliveInterval")
    public void setKeepAliveInterval(Integer keepAliveInterval) {
        this.keepAliveInterval = keepAliveInterval == null ? 10 : keepAliveInterval;
    }

    @JsonProperty(value = "connectionTimeoutInterval")
    public Integer getConnectionTimeoutInterval() {
        return connectionTimeoutInterval;
    }

    @JsonProperty(value = "connectionTimeoutInterval")
    public void setConnectionTimeoutInterval(Integer connectionTimeoutInterval) {
        this.connectionTimeoutInterval = connectionTimeoutInterval == null ? 60 : connectionTimeoutInterval;
    }

    @JsonProperty(value = "connectionRetryCount")
    public Integer getConnectionRetryCount() {
        return connectionRetryCount;
    }

    @JsonProperty(value = "connectionRetryCount")
    public void setConnectionRetryCount(Integer connectionRetryCount) {
        this.connectionRetryCount = connectionRetryCount == null ? 3 : connectionRetryCount;
    }

    @JsonProperty(value = "keepAliveThreshold")
    public Integer getKeepAliveThreshold() {
        return keepAliveThreshold;
    }

    @JsonProperty(value = "keepAliveThreshold")
    public void setKeepAliveThreshold(Integer keepAliveThreshold) {
        this.keepAliveThreshold = keepAliveThreshold == null ? 2: keepAliveThreshold;
    }

    @JsonProperty(value = "netRecorderMode")
    public RecordMode getNetRecorderMode() {
        return netRecorderMode;
    }

    @JsonProperty(value = "netRecorderMode")
    public void setNetRecorderMode(RecordMode netRecorderMode) {
        this.netRecorderMode = netRecorderMode == null ? RecordMode.OFF : netRecorderMode;
    }

    @JsonProperty(value = "eventBufferingEnabled")
    public boolean isEventBufferingEnabled() {
        return eventBufferingEnabled;
    }

    @JsonProperty(value = "eventBufferingEnabled")
    public void setEventBufferingEnabled(Boolean eventBufferingEnabled) {
        this.eventBufferingEnabled = eventBufferingEnabled == null || eventBufferingEnabled;
    }

    @JsonProperty(value = "playbackEventsDelay")
    public Integer getPlaybackEventsDelay() {
        return playbackEventsDelay;
    }

    @JsonProperty(value = "playbackEventsDelay")
    public void setPlaybackEventsDelay(Integer playbackEventsDelay) {
        this.playbackEventsDelay = (null == playbackEventsDelay) ? 0 : playbackEventsDelay;
    }

    @JsonProperty(value = "eventsBufferTime")
    public Integer getEventsBufferTime() {
        return eventsBufferTime;
    }

    @JsonProperty(value = "eventsBufferTime")
    public void setEventsBufferTime(Integer eventsBufferTime) {
        this.eventsBufferTime = eventsBufferTime == null ? 30 : eventsBufferTime;
    }

    @JsonProperty(value = "poolSize")
    public Integer getPoolSize() {
        return poolSize;
    }

    @JsonProperty(value = "poolSize")
    public void setPoolSize(Integer poolSize) {
        this.poolSize = poolSize;
    }

    @JsonProperty(value = "topologyCollection")
    public CollectionType getTopologyCollection() {
        return topologyCollection;
    }

    @JsonProperty(value = "topologyCollection")
    public void setTopologyCollection(CollectionType topologyCollection) {
        this.topologyCollection = topologyCollection == null ?
                CollectionType.COLLECTION_AND_SUBSCRIPTION : topologyCollection;
    }

    @JsonProperty(value = "lspCollection")
    public CollectionType getLspCollection() {
        return lspCollection;
    }

    @JsonProperty(value = "lspCollection")
    public void setLspCollection(CollectionType lspCollection) {
        this.lspCollection = lspCollection == null ?
                CollectionType.COLLECTION_AND_SUBSCRIPTION : lspCollection;;
    }

    @JsonIgnore
    public String getNetRecordStr() {
        return netRecordStr;
    }

    @JsonIgnore
    public void setNetRecordStr(String netRecordStr) {
        this.netRecordStr = netRecordStr;
    }

    @JsonIgnore
    public SrpceAgentAdvanced getAdvanced() {
        return advanced;
    }

    @JsonIgnore
    public void setAdvanced(SrpceAgentAdvanced advanced) {
        this.advanced = advanced;
    }

    @Override
    public String toString() {
        return "SrPceAgent{" +
                "enabled=" + enabled +
                ", xtcHostIP='" + xtcHostIP + '\'' +
                ", xtcRestPort=" + xtcRestPort +
                ", authenticationType=" + authenticationType +
                ", batchSize=" + batchSize +
                ", maxLspHistory=" + maxLspHistory +
                ", keepAliveInterval=" + keepAliveInterval +
                ", connectionTimeoutInterval=" + connectionTimeoutInterval +
                ", connectionRetryCount=" + connectionRetryCount +
                ", keepAliveThreshold=" + keepAliveThreshold +
                ", netRecorderMode=" + netRecorderMode +
                ", eventBufferingEnabled=" + eventBufferingEnabled +
                ", playbackEventsDelay=" + playbackEventsDelay +
                ", eventsBufferTime=" + eventsBufferTime +
                ", poolSize=" + poolSize +
                ", topologyCollection=" + topologyCollection +
                ", lspCollection=" + lspCollection +
                '}';
    }

    @NoArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    @Data
    public static class SrpceAgentAdvanced {

        @XmlElement( name = "playback-events-delay",namespace = "http://cisco.com/ns/wae/xtc-agent")
        private Integer playbackEventsDelay;

        @XmlElement( name = "events-buffer-time",namespace = "http://cisco.com/ns/wae/xtc-agent")
        private Integer eventsBufferTime;

        @XmlElement( name = "pool-size",namespace = "http://cisco.com/ns/wae/xtc-agent")
        private Integer poolSize;

        @XmlElement( name = "topology-collection",namespace = "http://cisco.com/ns/wae/xtc-agent")
        @JsonIgnore
        private String topologyCollectionStr;

        @XmlElement( name = "lsp-collection",namespace = "http://cisco.com/ns/wae/xtc-agent")
        @JsonIgnore
        private String lspCollectionStr;

    }
}


package com.cisco.configService.model.common.ui;


import com.cisco.configService.model.common.Interfaces;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class InterfacesView {

    @XmlElement( name = "find-parallel-links",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean findParallelLinks = false;

    @XmlElement( name = "ip-guessing",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonIgnore
    private String ipGuessStr;

    private Interfaces.IpGuessing ipGuessing = Interfaces.IpGuessing.SAFE;

    @XmlElement( name = "lag",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private boolean discoverLags = false;

    @XmlElement( name = "lag-port-match",namespace = "http://cisco.com/ns/wae/xtc-topology")
    @JsonIgnore
    private String lagPortMatchStr;

    private Interfaces.LagPortMatch lagPortMatch = Interfaces.LagPortMatch.GUESS;

    @XmlElement( name = "cleanup-circuits",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean circuitCleanup = false;

    @XmlElement( name = "copy-descriptions",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean copyDescription = false;

    @XmlElement( name = "get-physical-ports",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Boolean collectPhysicalPort = false;

    @XmlElement( name = "min-guess-prefix-length",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer minIPGuessPrefixLength = 0;

    @XmlElement( name = "min-prefix-length",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer minPrefixLength = 30;

    @XmlElement( name = "connect-timeout",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer timeout = 60;

    @JsonIgnore
    @XmlElement(name = "net-recorder",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private String netRecorder;

    @JsonIgnore
    @XmlElement(name = "verbosity",namespace = "http://cisco.com/ns/wae/xtc-topology")
    private Integer verbosity = 30;

    private DebugView debug = new DebugView();

    @JsonProperty("findParallelLinks")
    public Boolean getFindParallelLinks() {
        return findParallelLinks;
    }

    @JsonProperty("findParallelLinksc")
    public void setFindParallelLinksc(Boolean findParallelLinks) {
        this.findParallelLinks = findParallelLinks != null && findParallelLinks;
    }

    @JsonProperty("ipGuessing")
    public Interfaces.IpGuessing getIpGuessing() {
        return ipGuessing;
    }

    @JsonProperty("ipGuessing")
    public void setIpGuessing(Interfaces.IpGuessing ipGuessing) {
        this.ipGuessing = ipGuessing == null ? Interfaces.IpGuessing.SAFE : ipGuessing;
    }

    @JsonProperty("discoverLags")
    public Boolean getDiscoverLags() {
        return discoverLags;
    }

    @JsonProperty("discoverLags")
    public void setDiscoverLags(Boolean discoverLags) {
        this.discoverLags = discoverLags != null && discoverLags;
    }

    @JsonProperty("lagPortMatch")
    public Interfaces.LagPortMatch getLagPortMatch() {
        return lagPortMatch;
    }

    @JsonProperty("lagPortMatch")
    public void setLagPortMatch(Interfaces.LagPortMatch lagPortMatch) {
        this.lagPortMatch = lagPortMatch == null ? Interfaces.LagPortMatch.GUESS : lagPortMatch;
    }

    @JsonProperty("circuitCleanup")
    public Boolean getCircuitCleanup() {
        return circuitCleanup;
    }

    @JsonProperty("circuitCleanup")
    public void setCircuitCleanup(Boolean circuitCleanup) {
        this.circuitCleanup = circuitCleanup != null && circuitCleanup;
    }

    @JsonProperty("copyDescription")
    public Boolean getCopyDescription() {
        return copyDescription;
    }

    @JsonProperty("copyDescription")
    public void setCopyDescription(Boolean copyDescription) {
        this.copyDescription = copyDescription != null && copyDescription;
    }

    @JsonProperty("collectPhysicalPort")
    public Boolean getCollectPhysicalPort() {
        return collectPhysicalPort;
    }

    @JsonProperty("collectPhysicalPort")
    public void setCollectPhysicalPort(Boolean collectPhysicalPort) {
        this.collectPhysicalPort = collectPhysicalPort != null && collectPhysicalPort;
    }

    @JsonProperty("minIPGuessPrefixLength")
    public Integer getMinIPGuessPrefixLength() {
        return minIPGuessPrefixLength;
    }

    @JsonProperty("minIPGuessPrefixLength")
    public void setMinIPGuessPrefixLength(Integer minIPGuessPrefixLength) {
        this.minIPGuessPrefixLength = minIPGuessPrefixLength == null ? 0 : minIPGuessPrefixLength;
    }

    @JsonProperty("minPrefixLength")
    public Integer getMinPrefixLength() {
        return minPrefixLength;
    }

    @JsonProperty("minPrefixLength")
    public void setMinPrefixLength(Integer minPrefixLength) {
        this.minPrefixLength = minPrefixLength == null ? 30 : minPrefixLength;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout == null ? 60 : timeout;
    }

    public String getIpGuessStr() {
        return ipGuessStr;
    }

    public void setIpGuessStr(String ipGuessStr) {
        this.ipGuessStr = ipGuessStr;
    }

    public String getLagPortMatchStr() {
        return lagPortMatchStr;
    }

    public void setLagPortMatchStr(String lagPortMatchStr) {
        this.lagPortMatchStr = lagPortMatchStr;
    }

    @JsonIgnore
    public String getNetRecorder() {
        return netRecorder;
    }

    @JsonIgnore
    public void setNetRecorder(String netRecorder) {
        this.netRecorder = netRecorder;
    }

    @JsonIgnore
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonIgnore
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
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
        return "InterfacesView{" +
                "findParallelLinks=" + findParallelLinks +
                ", ipGuessing=" + ipGuessing +
                ", discoverLags=" + discoverLags +
                ", lagPortMatch=" + lagPortMatch +
                ", circuitCleanup=" + circuitCleanup +
                ", copyDescription=" + copyDescription +
                ", collectPhysicalPort=" + collectPhysicalPort +
                ", minIPGuessPrefixLength=" + minIPGuessPrefixLength +
                ", minPrefixLength=" + minPrefixLength +
                ", timeout=" + timeout +
                ", debug=" + debug +
                '}';
    }
}

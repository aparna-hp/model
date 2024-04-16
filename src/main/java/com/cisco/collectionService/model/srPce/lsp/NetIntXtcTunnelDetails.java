package com.cisco.collectionService.model.srPce.lsp;

import com.cisco.collectionService.model.srPce.SrPceData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * POJO/DB class for XTC LSP Data.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class NetIntXtcTunnelDetails extends SrPceData {
    private Long id;
    private NetIntXtcTunnelKeys tunnelKeys;
    private Long xtcLspIdentifier;

    //PCE-EXTENDED-TUN-ID-TYPE
    @JsonProperty("af-name")
    private String afName;
    @JsonProperty("ipv4")
    private String ipv4;
    @JsonProperty("ipv6")
    private String ipv6;
    //Brief LSP Info
    @JsonProperty("source-address")
    private String sourceAddress;
    @JsonProperty("destination-address")
    private String destinationAddress;
    //container srv6-binding-sid
    /*
     * grouping PCE-SRV6-BSID-INFO { description "SRv6 Binding SID Info";
     *
     * container srv6-bsid { description "srv6 bsid"; uses PCE-IP-ADDR-TYPE; } leaf
     * bsid-behavior { type uint16; description "bsid behavior"; } leaf block-len {
     * type uint8; description "block len"; } leaf nodeid-len { type uint8;
     * description "nodeid len"; } leaf func-len { type uint8; description
     * "func len"; } leaf args-len { type uint8; description "args len"; } }
     */
    @JsonProperty("tunnel-id")
    private String tunnelId;
    @JsonProperty("lspid")
    private String lspid;
    @JsonProperty("binding-sid")
    private String bindingSid;
    @JsonProperty("lsp-setup-type")
    private String lspSetupType;
    @JsonProperty("operational-state")
    private String operationalState;
    @JsonProperty("administrative-state")
    private String administrativeState;
    @JsonProperty("msd")
    private String msd;
    @JsonProperty("absolute-margin")
    private String absoluteMargin;
    @JsonProperty("relative-margin")
    private String relativeMargin;
    @JsonProperty("reported-metric-type")
    private String reportedMetricType;
    @JsonProperty("pcep-flag-o")
    private String pcepFlagO;
    @JsonProperty("affinity-include-any")
    private String affinityIncludeAny;
    @JsonProperty("pcep-flag-d")
    private String pcepFlagD;
    @JsonProperty("signaled-bandwidth")
    private String signaledBandwidth;
    @JsonProperty("reporting-pcc-address")
    private String reportingPccAddress;
    @JsonProperty("hold-priority")
    private String holdPriority;
    @JsonProperty("pcep-flag-c")
    private String pcepFlagC;
    @JsonProperty("pcep-flag-a")
    private String pcepFlagA;
    @JsonProperty("association-id")
    private String associationId;
    @JsonProperty("tunnel-name-xr")
    private String tunnelNameXr;
    @JsonProperty("affinity-exclude-any")
    private String affinityExcludeAny;
    @JsonProperty("actual-bandwidth-specified")
    private String actualBandwidthSpecified;
    @JsonProperty("preference")
    private String preference;
    @JsonProperty("error-flags")
    private String errorFlags;
    @JsonProperty("error-code")
    private String errorCode;
    @JsonProperty("association-source")
    private String associationSource;
    @JsonProperty("signaled-bandwidth-specified")
    private String signaledBandwidthSpecified;
    @JsonProperty("association-type")
    private String associationType;
    @JsonProperty("local-protection")
    private String localProtection;
    @JsonProperty("pcepid")
    private String pcepid;
    @JsonProperty("computed-hop-list-time")
    private String computedHopListTime;
    @JsonProperty("actual-bandwidth")
    private String actualBandwidth;
    @JsonProperty("pcep-flag-r")
    private String pcepFlagR;
    @JsonProperty("pcep-flag-s")
    private String pcepFlagS;
    @JsonProperty("lsp-role")
    private String lspRole;
    @JsonProperty("color")
    private String color;
    @JsonProperty("interface-name")
    private String interfaceName;
    @JsonProperty("computing-pce")
    private String computingPce;
    @JsonProperty("computed-metric-type")
    private String computedMetricType;
    @JsonProperty("error-value")
    private String errorValue;
    @JsonProperty("pcc-address")
    private String pccAddress;
    @JsonProperty("node-address")
    private String nodeAddress;
    @JsonProperty("computed-metric-value")
    private String computedMetricValue;
    @JsonProperty("state-sync-pce")
    private String stateSyncPce;
    @JsonProperty("reported-metric-value")
    private String reportedMetricValue;
    @JsonProperty("sub-delegated-pce")
    private String subDelegatedPce;
    @JsonProperty("setup-priority")
    private String setupPriority;
    @JsonProperty("affinity-include-all")
    private String affinityIncludeAll;
    @JsonProperty("allow-xtc-reoptimization")
    private String allowXtcReoptimization;
    @JsonProperty("srlg-info")
    private String srlgs;
    @JsonProperty("xtc-controlled")
    private String xtcControlled;
    @JsonProperty("profile-id")
    private String profileId;
    @JsonProperty("protection")
    private String protection;

    private String computedRsvpPath;
    private String reportedRsvpPath;
    private List<NetIntXtcReportedSRPath> reportedSRPaths;
    private List<NetIntXtcComputedSRPath> computedSRPaths;

    @Override
    public String toString() {
        return "NetIntXtcTunnelDetails{" +
                "id=" + id +
                ", tunnelKeys=" + tunnelKeys +
                ", xtcLspIdentifier=" + xtcLspIdentifier +
                ", sourceAddress='" + sourceAddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", tunnelId='" + tunnelId + '\'' +
                ", lspSetupType='" + lspSetupType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

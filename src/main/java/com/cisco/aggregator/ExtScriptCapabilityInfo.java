package com.cisco.aggregator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class ExtScriptCapabilityInfo {
    private long networkId;
    private String networkName;
    private long collectorId;
    private String capabilityFilename;

    public String getInfo(){
        return "ExternalScriptCapabilityFile :"+ capabilityFilename +" ["+networkId+"_"+networkName+" -"+collectorId+"]";
    }
}

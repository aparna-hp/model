package com.cisco.aggregator;

import com.cisco.workflowmanager.ServiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor @Builder
public class CollectorUserFileInfo{
    private long networkId;
    private String networkName;
    private ServiceType collectorType;
    private long collectorId;
    private String filename;

    public String getInfo(){
        return "File :"+filename+" ["+networkId+"_"+networkName+" -"+collectorId+"_"+collectorType+"]";
    }
}

package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class CollectorInfo {
    private long id;
    private ServiceType type;
    private String name;
    private ConsolidationType consolidationType;

    public String getInfo(){
        return "Collector["+id+"-"+type+"-"+name+"-"+consolidationType+"] ";
    }

    public String getDescription() {
        return "id :"+id+", type :"+type+", name :"+name+", consolidationType :"+consolidationType;
    }
}

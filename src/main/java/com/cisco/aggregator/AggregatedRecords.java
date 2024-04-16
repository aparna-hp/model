package com.cisco.aggregator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.json.JSONObject;

import java.util.Map;

@Getter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class AggregatedRecords {
    private long networkId;
    private String networkName;
    private long collectorId;
    private String collector;
    private String table;
    private Action action;
    private Map<String, JSONObject> records;

    public enum Action{
        CREATE,
        UPDATE,
        DELETE,
        RESYNC_NETWORK,
        DELETE_TABLE;
    }

    @JsonIgnore
    public String getInfo(){
        return "Nw:"+networkId+"-Collector["+collectorId+"-"+collector+"]-Table("+table+")-"+action+"("+records.size()+")";
    }
}

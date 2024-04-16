package com.cisco.workflowmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class NetworkResyncInfo {
    private long id;
    @Min(value = 1, message = "Invalid networkId")
    private long networkId;
    @NotNull(message = "Invalid networkName")
    private String networkName;
    private ScheduleInfo scheduleInfo;
    private JobConfig jobConfig;
    private ScheduleStatus scheduleStatus = ScheduleStatus.Active;

    @JsonIgnore
    public String getInfo(){
        return "ResyncNWJob["+id+"] ";
    }
}

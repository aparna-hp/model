package com.cisco.workflowmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class JobInfo {
    private long id;
    //TODO - uncomment validations once the dedicated Agent APIs available
    //@Min(value = 1, message = "Invalid networkId")
    private long networkId;
    //@NotNull(message = "Invalid networkName")
    private String networkName;
    //@NotNull(message = "invalid name")
    private String name;
    @Builder.Default
    @Valid
    private List<DataCollectionInfo> tasks = new ArrayList<>();
    @NotNull(message = "Invalid Schedule")
    private ScheduleInfo scheduleInfo;
    private JobConfig jobConfig;
    @Builder.Default
    private ScheduleStatus scheduleStatus = ScheduleStatus.Active;
    @Builder.Default
    private JobType type = JobType.COLLECTION;

    @JsonIgnore
    public String getInfo(){
        return "Job["+id+" - "+name+"] ";
    }
}

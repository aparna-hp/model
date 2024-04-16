package com.cisco.workflowmanager;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true) @NoArgsConstructor @AllArgsConstructor @Builder
public class DataCollectionInfo {
    @Min(value = 0, message = "Invalid collector id")
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    @NotNull(message = "Invalid TaskType")
    @EqualsAndHashCode.Include
    private TaskType type;
    private long order;
    @NotNull(message = "Invalid ActionTypes")
    @Size(min = 1, message = "Invalid ActionTypes")
    private List<ActionType> actions;
    @Builder.Default
    @Min(value = 0, message = "Invalid source")
    private long source = 0;
    private ConsolidationType consolidationType;
    private long timeout;//Timeout in milliseconds

    @Override
    public String toString() {
        return "{"+id+"-"+name+"-"+type.name()+"-"+actions+": source :"+ source +", consolidationType :"+consolidationType+"}";
    }

    public String getInfo(){
        return "["+id+"-"+name+"-"+type.name()+"-"+actions+"]";
    }
}

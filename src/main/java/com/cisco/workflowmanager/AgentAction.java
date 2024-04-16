package com.cisco.workflowmanager;

import com.cisco.configService.enums.AgentTypes;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AgentAction {
    @Min(value = 1, message = "Invalid agent id")
    private long id;
    @NotNull(message = "Invalid agent type")
    private AgentTypes type;
    @NotNull(message = "Invalid action")
    private ActionType action;
    public String getInfo(){
        return "Agent["+id+"_"+type+"-"+action+"]";
    }
}
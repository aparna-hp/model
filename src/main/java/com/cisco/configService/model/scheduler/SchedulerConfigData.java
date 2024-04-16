package com.cisco.configService.model.scheduler;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class SchedulerConfigData {

    Long id;

    @NotNull
    Long networkId;

    String networkName;

    @NotBlank
    String name;

    String cronExpression;

    boolean runNow = false;

    List<TaskConfigData> taskConfigDataList = new ArrayList<>();

    boolean active;
}

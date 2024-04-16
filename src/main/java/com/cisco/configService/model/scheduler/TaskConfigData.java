package com.cisco.configService.model.scheduler;

import com.cisco.configService.enums.CollectorTypes;
import lombok.Data;

@Data
public class TaskConfigData {

    String taskName;

    Long collectorId;

    String collectorName;

    CollectorTypes collectorType;

    boolean collect = false;

    boolean aggreagate = false;

    boolean archive = false;
}

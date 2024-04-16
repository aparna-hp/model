package com.cisco.configService.model.composer;

import com.cisco.configService.enums.CollectorTypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponseDetail {

    Long id;

    String name;

    CollectorTypes type = null;

    boolean status = true;

    String errorMessage;

    String errorDetails;
}

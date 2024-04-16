package com.cisco.configService.model.preConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilterCriteria {

    private String columnName;
    private String columnValue;
}

package com.cisco.aggregator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class AggrResponseEntity<T> {
    private int statusCode;
    private T data;
    private String errorMessage;
}

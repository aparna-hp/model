package com.cisco.aggregator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter @Service @ToString @NoArgsConstructor @AllArgsConstructor
public class AggrResponseData<T>{
    private T data;
    private String error;
}

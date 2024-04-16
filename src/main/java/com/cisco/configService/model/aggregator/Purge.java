package com.cisco.configService.model.aggregator;

import lombok.Data;

@Data
public class Purge {

    boolean enable;

    int l3Node;

    int l3Port;

    int l3Circuit;
}

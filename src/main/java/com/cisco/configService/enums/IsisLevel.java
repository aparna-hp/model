package com.cisco.configService.enums;

public enum IsisLevel {
    ONE ("1"),
    TWO("2"),
    BOTH("BOTH");

    private String value;

    IsisLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

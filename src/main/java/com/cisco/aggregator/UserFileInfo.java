package com.cisco.aggregator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class UserFileInfo {
    private String filename;

    public String getInfo(){
        return "File :"+filename;
    }
}

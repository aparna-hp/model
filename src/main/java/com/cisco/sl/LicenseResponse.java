package com.cisco.sl;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LicenseResponse {
    private Boolean status;
    private String message;
}

package com.cisco.configService.model.preConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AuthGroupData {

    public enum LoginType {
        TELNET, SSH
    }

    @JsonProperty(value = "id")
    Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @JsonProperty("loginType")
    LoginType loginType = LoginType.TELNET;

    @NotBlank
    @JsonProperty("username")
    private String username;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @NotBlank
    @JsonProperty("confirmPassword")
    private String confirmPassword;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate updateDate;

    @Override
    public String toString() {
        return "AuthGroupData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loginType=" + loginType +
                ", username='" + username + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}



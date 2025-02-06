package com.dailycodeBuffer.spring_Security_client.Model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchingPassword;


}

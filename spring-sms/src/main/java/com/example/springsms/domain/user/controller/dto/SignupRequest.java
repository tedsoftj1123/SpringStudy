package com.example.springsms.domain.user.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupRequest {
    private String userId;
    private String userName;
    private String userPassword;
}

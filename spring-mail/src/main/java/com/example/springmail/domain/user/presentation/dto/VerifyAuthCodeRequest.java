package com.example.springmail.domain.user.presentation.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VerifyAuthCodeRequest {
    private String code;
    private String email;
}

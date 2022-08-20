package com.example.springmail.domain.user.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SendEmailRequest {
    private String email;
}

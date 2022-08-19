package com.example.springmail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MailRequest {
    private String email;
    private String title;
    private String content;
}

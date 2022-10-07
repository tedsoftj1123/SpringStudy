package com.example.springjwt.controller.dto.req;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequestDto {
    private String email;
    private String password;
}

package com.example.springjwt.dto.req;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberRequestDto {
    private final String email;
    private final String password;
}

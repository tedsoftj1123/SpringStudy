package com.example.spring.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MemberDTO {

    private final String name;
    private final String email;
    private final String organization;
};

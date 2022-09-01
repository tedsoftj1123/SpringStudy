package com.example.springquerydsl.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberCustom {
    private Long id;
    private String username;

    private int age;
}

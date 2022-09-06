package com.example.springquerydsl.controller;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberCustom {
    private Long id;
    private String username;
    private Integer age;
}

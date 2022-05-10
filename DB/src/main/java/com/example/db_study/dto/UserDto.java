package com.example.db_study.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
//Dto: 중간에 값 넣어두는 바구니
@Getter
@NoArgsConstructor
public class UserDto {

    private String email;

    private String password;

    private String name;
}

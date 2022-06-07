package com.example.springmemberservice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
public class MemberDto {
    @NotBlank
    private String name;
    @NotBlank @Email
    private String password;

    private Long age;
    private String email;

}

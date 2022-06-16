package com.example.springmemberservice.dto;


import com.example.springmemberservice.domain.Member;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String username;
    private String password;
    private String auth;
}

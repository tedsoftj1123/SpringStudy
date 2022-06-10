package com.example.springmemberservice.dto;


import com.example.springmemberservice.domain.Member;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String username;
    private String password;

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .username(username)
                .password(password)
                .build();
    }

    @Builder
    public MemberDto(Long id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

}

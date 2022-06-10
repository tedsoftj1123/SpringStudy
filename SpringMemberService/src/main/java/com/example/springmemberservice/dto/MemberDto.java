package com.example.springmemberservice.dto;


import com.example.springmemberservice.domain.Member;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String password;

    private Long age;
    @Email()
    private String email;

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .name(name)
                .password(password)
                .age(age)
                .email(email)
                .build();
    }

    @Builder
    public MemberDto(Long id, String name, String password, Long age, String email){
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
    }

}

package com.example.springmail.domain.user.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AuthCode {
    @Id
    @Column(name = "auth_code_id")
    private String email;

    private String authCode;

    private boolean verified;
}

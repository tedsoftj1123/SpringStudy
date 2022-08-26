package com.example.board.domain.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AuthCode {
    @Id
    private String email;

    private String authCode;

    private boolean verified;

    @Builder
    public AuthCode(String email, String authCode) {
        this.authCode = authCode;
        this.email = email;
        this.verified = false;
    }
}

package com.example.springmemberservice.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    WRONG_PASSWORD(401, "잘못된 비밀번호"),
    USER_ALREADY_EXISTS(409, "사용자가 이미 존재합니다."),
    USER_NOT_FOUND(404, "유저가 없습니다.");

    private final Integer status;
    private final String message;
}

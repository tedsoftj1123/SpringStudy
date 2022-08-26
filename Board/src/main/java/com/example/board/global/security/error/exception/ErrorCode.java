package com.example.board.global.security.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_EXISTS(409, "UserName Already Exists");

    private final int status;
    private final String errorMessage;
}

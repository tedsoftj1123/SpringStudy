package com.example.springmail.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_ALREADY_EXISTS(409, "User Already Exists"),
    INVALID_AUTH_CODE(403, "Invalid AuthCode"),

    UN_VERIFED_AUTH_CODE(400, "AuthCode no verawefsasef")
    ;
    private final int status;
    private final String msg;
}

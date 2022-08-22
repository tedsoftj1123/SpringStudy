package com.example.springmail.global.exception;

import com.example.springmail.global.error.exception.BaseException;
import com.example.springmail.global.error.exception.ErrorCode;

public class InvalidAuthCodeException extends BaseException {
    public static final BaseException EXCEPTION = new InvalidAuthCodeException();

    public InvalidAuthCodeException() {
        super(ErrorCode.INVALID_AUTH_CODE);
    }
}

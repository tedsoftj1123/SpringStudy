package com.example.springmail.global.exception;

import com.example.springmail.global.error.exception.BaseException;
import com.example.springmail.global.error.exception.ErrorCode;

public class UserAlreadyExistsException extends BaseException {
    public static final BaseException EXCEPTION = new UserAlreadyExistsException();
    private UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}

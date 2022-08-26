package com.example.board.global.security.exception;

import com.example.board.global.security.error.exception.BaseException;
import com.example.board.global.security.error.exception.ErrorCode;

public class UserAlreadyExistsException extends BaseException {
    public static final BaseException EXCEPTION = new UserAlreadyExistsException();

    public UserAlreadyExistsException() {
        super(ErrorCode.USER_NOT_EXISTS);
    }
}

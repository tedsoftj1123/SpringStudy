package com.example.springmemberservice.exeption;

import com.example.springmemberservice.error.ErrorCode;
import org.apache.catalina.User;

public class UserAlreadyExistsException extends BusinessException {
    public UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
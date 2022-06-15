package com.example.springmemberservice.exeption;

import com.example.springmemberservice.error.ErrorCode;

public class WrongPasswordException extends BusinessException{
    public WrongPasswordException() {
        super(ErrorCode.WRONG_PASSWORD);
    }
}

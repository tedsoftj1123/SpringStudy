package com.example.springmemberservice.exeption;

import com.example.springmemberservice.error.ErrorCode;

public class UserNotFoundException extends BusinessException{
    public UserNotFoundException(){
        super(ErrorCode.USER_NOT_FOUND);
    }
}

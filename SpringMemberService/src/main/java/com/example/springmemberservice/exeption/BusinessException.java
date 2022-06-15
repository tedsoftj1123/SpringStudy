package com.example.springmemberservice.exeption;

import com.example.springmemberservice.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode=errorCode;
    }
}

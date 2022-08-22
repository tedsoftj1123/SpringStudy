package com.example.springmail.global.exception;

import com.example.springmail.global.error.exception.BaseException;
import com.example.springmail.global.error.exception.ErrorCode;

public class UnVerifiedAuthCodeException extends BaseException {
    public static final BaseException EXCEPTION= new UnVerifiedAuthCodeException();

    private UnVerifiedAuthCodeException() {
        super(ErrorCode.UN_VERIFED_AUTH_CODE);
    }
}

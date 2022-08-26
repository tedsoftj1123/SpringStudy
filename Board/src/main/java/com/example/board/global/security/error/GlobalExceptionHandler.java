package com.example.board.global.security.error;

import com.example.board.global.security.error.exception.BaseException;
import com.example.board.global.security.error.exception.ErrorCode;
import com.example.board.global.security.error.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException e) {
        final ErrorCode errorCode = e.getErrorCode();
        return new ResponseEntity<>(
                    ErrorResponse.builder()
                            .errorCode(errorCode.getStatus())
                            .errorMessage(errorCode.getErrorMessage())
                            .timeStamp(LocalDateTime.now())
                            .build()
                ,
                HttpStatus.valueOf(errorCode.getStatus())
                );
    }
}

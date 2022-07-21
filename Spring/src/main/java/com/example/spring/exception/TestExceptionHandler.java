package com.example.spring.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice //controller단에서 발생하는 모든 예외를 이곳에서 처리하겠다.
public class TestExceptionHandler {
    @ExceptionHandler(Exception.class) // 예외가 Exception인 놈들은 이 메소드를 사용해 처리하겠다.
    public ResponseEntity<Map<String, String>> ExceptionHandler(Exception e) {
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        Map<String, String> map = new HashMap<>();
        map.put("error type", httpStatus.getReasonPhrase());
        map.put("code", "400");
        map.put("messsage", "error");
        return new ResponseEntity<>(map, httpHeaders, httpStatus);
    }
}

package com.example.spring.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExceptionController {
    @GetMapping("/exception")
    public void exception() throws Exception{
        throw new Exception();
    }

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


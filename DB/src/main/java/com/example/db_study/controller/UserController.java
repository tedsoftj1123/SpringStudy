package com.example.db_study.controller;

import com.example.db_study.dto.UserDto;
import com.example.db_study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /*
    public String UserController(UserService userService) {
        this.userService = userService
    }
     */
    @PostMapping
    public String signup(@RequestBody UserDto userDto) {
        return userService.signup(userDto);
    }//DTO를 사용해 UserService로 데이터 전송
}

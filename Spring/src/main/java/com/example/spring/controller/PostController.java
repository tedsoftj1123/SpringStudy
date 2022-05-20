package com.example.spring.controller;

import com.example.spring.dto.UserDTO;
import com.example.spring.service.TestService;
import com.example.spring.dto.PostDTO;
import com.example.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final UserService userService;
    private final TestService testService;

    @PostMapping(value = "/default")
    public String postMethod() {
        return "Hello World!";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb2 = new StringBuilder();

        postData.forEach((key, value) -> sb2.append(key).append(" : ").append(value).append("\n"));
        return sb2.toString();
    }

    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody PostDTO postDTO) {
        testService.test();
        return postDTO.toString();
    }

    @PostMapping(value = "/signup")
    public String userSignup(@RequestBody UserDTO userDTO) {
        return userService.signup(userDTO);
    }
}

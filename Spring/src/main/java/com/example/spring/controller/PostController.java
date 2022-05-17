package com.example.spring.controller;

import com.example.spring.TestService;
import com.example.spring.dto.PostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final TestService testService;

    @PostMapping(value = "/default")
    public String postMethod() {
        return "Hello World!";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb2 = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb2.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb2.toString();
    }

    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody PostDTO postDTO) {
        testService.test();
        return postDTO.toString();
    }
}

package com.example.springjwt.controller;

import com.example.springjwt.domain.User;
import com.example.springjwt.controller.dto.req.MemberRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
public class MemberController {

    @PostMapping("/join")
    public String signUp(@RequestBody MemberRequestDto req) {
        return authService.join(req);
    }

    // 로그인
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {

    }
    @GetMapping("/admin")
    public String admin() {
        return "adminpage";
    }
    @GetMapping("/member")
    public String member() {
        return "memberpage";
    }
}
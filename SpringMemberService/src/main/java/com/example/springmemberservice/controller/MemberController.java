package com.example.springmemberservice.controller;
import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
    @GetMapping("/admin")
    public String adminpage() {
        return "admin";
    }
    @GetMapping("/")
    public String memberpage() {
        return "member";
    }
    @PostMapping("/join")
    public String signup(@RequestBody MemberDto req) {
        return memberService.save(req);
    }
    @PostMapping("/login")
    public void login(@RequestBody MemberDto req) {
        memberService.login(req);
    }
}
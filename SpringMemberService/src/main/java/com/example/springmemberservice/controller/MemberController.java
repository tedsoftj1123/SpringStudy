package com.example.springmemberservice.controller;

import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @PostMapping("login")
    public String login(@Valid @RequestBody MemberDto memberDto) {
        return memberService.login(memberDto);
    }
}

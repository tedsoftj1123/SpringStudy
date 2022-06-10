package com.example.springmemberservice.controller;

import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
    @PostMapping("/member/signup")
    public Long login(@Valid @RequestBody MemberDto memberDto) {
        return memberService.login(memberDto);
    }
}

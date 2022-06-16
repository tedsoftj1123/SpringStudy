package com.example.springmemberservice.controller;
import com.example.springmemberservice.domain.Member;
import com.example.springmemberservice.jwt.JwtTokenProvider;
import com.example.springmemberservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final MemberRepository memberRepository;

    @PostMapping("/join")
    public Long join(@RequestBody Map<String, String> user) {
        return memberRepository.save(Member.builder()
                .email(user.get("email"))
                .password(passwordEncoder.encode(user.get("password")))
                .roles(Collections.singletonList("ROLE_USER"))
                .build()).getId();
    }
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        Member member = memberRepository.findByEmail(user.get("email"))
                .orElseThrow(() -> new IllegalStateException("no such user"));
        if(!passwordEncoder.matches(user.get("password"), member.getPassword())) {
            throw new IllegalArgumentException("wrong psw");
        }
        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }
}
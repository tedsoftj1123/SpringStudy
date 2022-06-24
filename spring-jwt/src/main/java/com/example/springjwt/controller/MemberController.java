package com.example.springjwt.controller;

import com.example.springjwt.domain.Member;
import com.example.springjwt.dto.req.MemberRequestDto;
import com.example.springjwt.jwt.JwtTokenProvider;
import com.example.springjwt.repository.MemberRepository;
import com.example.springjwt.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final MemberRepository memberRepository;
    private final AuthService authService;

    @PostMapping("/join")
    public Member join(@RequestBody MemberRequestDto req) {
        return authService.join(req);
    }

    // 로그인
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        Member member = memberRepository.findByEmail(user.get("email"))
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 E-MAIL 입니다."));
        if (!passwordEncoder.matches(user.get("password"), member.getPassword())) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
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
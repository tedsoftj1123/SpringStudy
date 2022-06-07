package com.example.springmemberservice.service;


import com.example.springmemberservice.domain.Member;
import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public String login(MemberDto memberDto) {
        memberRepository.save(Member.builder()
                .name(memberDto.getName())
                .password(memberDto.getPassword())
                .age(memberDto.getAge())
                .email(memberDto.getEmail())
                .build());
        return "회원가입이 완료되었습니다.";
    }
}

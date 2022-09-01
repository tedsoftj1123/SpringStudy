package com.example.springquerydsl.service;

import com.example.springquerydsl.domain.Member;
import com.example.springquerydsl.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryFindUserBetweenService {
    private final MemberRepository memberRepository;

    public List<Member> execute(int a, int b) {
        return memberRepository.findAllMemberWithSomething(a, b);
    }
}

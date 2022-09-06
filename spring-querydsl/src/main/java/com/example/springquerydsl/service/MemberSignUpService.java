package com.example.springquerydsl.service;

import com.example.springquerydsl.domain.Member;
import com.example.springquerydsl.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberSignUpService {
    private final MemberRepository memberRepository;

    public Member search(Long id) {
        return memberRepository.findMemberById(id);
    }


}

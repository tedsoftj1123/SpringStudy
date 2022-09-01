package com.example.springquerydsl.service;

import com.example.springquerydsl.controller.MemberCustom;
import com.example.springquerydsl.domain.Member;
import com.example.springquerydsl.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryFindUserBetweenService {
    private final MemberRepository memberRepository;

    public List<MemberCustom> execute(int a, int b) {
        return memberRepository.findAllMemberWithSomething(a, b).stream()
                .map(
                        member -> MemberCustom.builder()
                                .age(member.getMemberAge())
                                .id(member.getId())
                                .username(member.getMemberName())
                                .build()
                ).collect(Collectors.toList());
    }
}

package com.example.board.domain.user.service;

import com.example.board.domain.user.domain.Member;
import com.example.board.domain.user.domain.MemberRepository;
import com.example.board.domain.user.presentation.dto.MemberSignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberSingUpService {
    private final MemberRepository memberRepository;

    public String execute(MemberSignUpRequest request) {
        memberRepository.save(
                Member.builder()
                        .email(request.getEmail())
                        .nickname(request.getMemberId())
                        .password(request.getMemberPassword())
                        .build()
        );
        return request.getMemberId();
    }
}

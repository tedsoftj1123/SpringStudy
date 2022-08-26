package com.example.board.domain.user.facade;

import com.example.board.domain.user.domain.Member;
import com.example.board.domain.user.domain.MemberRepository;
import com.example.board.global.security.exception.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberFacade {
    private final MemberRepository memberRepository;

    public Member findByMemberId(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() ->UserAlreadyExistsException.EXCEPTION);
    }
}

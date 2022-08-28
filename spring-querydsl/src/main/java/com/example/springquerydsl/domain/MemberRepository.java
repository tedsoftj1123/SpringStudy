package com.example.springquerydsl.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.springquerydsl.domain.QMember.member;
import static com.example.springquerydsl.domain.QTeam.*;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final JPAQueryFactory queryFactory;

    public Member findMember(Long id) {
        return queryFactory
                .selectFrom(member)
                .where(member.id.eq(id))
                .join(member.team.id.eq(team.id))
                .fetchOne();
    }
}

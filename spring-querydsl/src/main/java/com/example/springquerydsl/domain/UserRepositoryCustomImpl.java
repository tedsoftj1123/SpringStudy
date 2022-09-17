package com.example.springquerydsl.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.springquerydsl.domain.QMember.member;
import static com.example.springquerydsl.domain.QTeam.team;

@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    private final JPAQueryFactory queryFactory;
    @Override
    public Member findMemberById(Long id) {
        return queryFactory.select(member)
                .from(member)
                .leftJoin(member.team, team)
                .where(member.id.eq(id))
                .fetchJoin().fetchOne();
    }

    @Override
    public List<Member> findAllMemberWithSomething(int s, int e) {
        return queryFactory.selectFrom(member)
                .where(member.memberAge.between(s, e))
                .orderBy(member.memberId.desc())
                .fetch();
    }
}

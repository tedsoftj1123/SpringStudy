package com.example.springquerydsl.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.springquerydsl.domain.QMember.member;

@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    private final JPAQueryFactory queryFactory;
    @Override
    public Member findMemberById(Long id) {
        return queryFactory.selectFrom(member)
                .where(member.id.eq(id))
                .fetchOne();
    }

    @Override
    public List<Member> findAllMemberWithSomething(int s, int e) {
        return queryFactory.select(member)
                .from(member)
                .where(member.memberAge.between(s, e))
                .orderBy(member.memberId.desc())
                .fetch();
    }
}

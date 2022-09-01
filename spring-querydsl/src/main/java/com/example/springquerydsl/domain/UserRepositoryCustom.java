package com.example.springquerydsl.domain;

import java.util.List;

public interface UserRepositoryCustom {
    Member findMemberById(Long id);

    List<Member> findAllMemberWithSomething(int s, int e);
}

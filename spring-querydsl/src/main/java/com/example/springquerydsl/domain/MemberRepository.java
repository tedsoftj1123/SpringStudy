package com.example.springquerydsl.domain;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long>, UserRepositoryCustom {

}

package com.example.springmemberservice.repository;

import com.example.springmemberservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username); //회원조회용
    boolean existsByUsername(String username);
}

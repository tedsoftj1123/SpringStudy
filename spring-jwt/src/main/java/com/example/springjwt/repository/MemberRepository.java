package com.example.springjwt.repository;

import com.example.springjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

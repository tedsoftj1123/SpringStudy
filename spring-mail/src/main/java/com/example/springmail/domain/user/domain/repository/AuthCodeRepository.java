package com.example.springmail.domain.user.domain.repository;

import com.example.springmail.domain.user.domain.AuthCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthCodeRepository extends JpaRepository<AuthCode, Long> {
    boolean existsByEmail(String mail);
}

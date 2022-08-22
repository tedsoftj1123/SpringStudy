package com.example.springmail.domain.user.facade;

import com.example.springmail.domain.user.domain.repository.UserRepository;
import com.example.springmail.global.exception.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserFacade {
    private final UserRepository userRepository;

    public void validateDuplicateMember(String email) {
        if(userRepository.existsByEmail(email)) {
            throw UserAlreadyExistsException.EXCEPTION;
        }
    }
}

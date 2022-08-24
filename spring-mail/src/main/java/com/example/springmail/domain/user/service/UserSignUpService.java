package com.example.springmail.domain.user.service;

import com.example.springmail.domain.user.domain.User;
import com.example.springmail.domain.user.domain.repository.UserRepository;
import com.example.springmail.domain.user.facade.AuthCodeFacade;
import com.example.springmail.domain.user.facade.UserFacade;
import com.example.springmail.domain.user.presentation.dto.SignUpRequest;
import com.example.springmail.global.exception.UnVerifiedAuthCodeException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserFacade userFacade;
    private final AuthCodeFacade authCodeFacade;
    private final UserRepository userRepository;


    @Transactional
    public void execute(SignUpRequest request) {
        userFacade.validateDuplicateMember(request.getEmail());
        if(!authCodeFacade.checkVerified(request.getEmail())) {
            throw UnVerifiedAuthCodeException.EXCEPTION;
        }

        userRepository.save(
                User.builder()
                        .email(request.getEmail())
                        .password(request.getPassword())
                        .build()
        );
    }
}

package com.example.springmail.domain.user.service;

import com.example.springmail.domain.user.domain.AuthCode;
import com.example.springmail.domain.user.facade.AuthCodeFacade;
import com.example.springmail.domain.user.presentation.dto.VerifyAuthCodeRequest;
import com.example.springmail.global.exception.InvalidAuthCodeException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class VerifyAuthCodeService {
    private final AuthCodeFacade authCodeFacade;

    @Transactional
    public void execute(VerifyAuthCodeRequest req) {
        AuthCode authCode = authCodeFacade.getAuthCodeById(req.getEmail());

        if(!authCode.getAuthCode().equals(req.getCode())) {
            throw InvalidAuthCodeException.EXCEPTION;
        }
        authCode.setVerified(true);
    }
}
package com.example.springmail.domain.user.service;

import com.example.springmail.domain.user.facade.AuthCodeFacade;
import com.example.springmail.domain.user.presentation.dto.SendEmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class SendAuthCodeService {

    private final AuthCodeFacade authCodeFacade;

    public void execute(SendEmailRequest email) {
        authCodeFacade.sendEmail(email.getEmail());
    }


}

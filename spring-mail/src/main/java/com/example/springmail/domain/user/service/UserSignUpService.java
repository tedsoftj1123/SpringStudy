package com.example.springmail.domain.user.service;

import com.example.springmail.domain.user.facade.UserFacade;
import com.example.springmail.domain.user.presentation.dto.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserFacade userFacade;

    public void execute(SignUpRequest request) {
        userFacade.validateDuplicateMember(request.getEmail());

    }
}

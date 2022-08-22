package com.example.springmail.domain.user.presentation;

import com.example.springmail.domain.user.presentation.dto.SendEmailRequest;
import com.example.springmail.domain.user.presentation.dto.SignUpRequest;
import com.example.springmail.domain.user.presentation.dto.VerifyAuthCodeRequest;
import com.example.springmail.domain.user.service.SendAuthCodeService;
import com.example.springmail.domain.user.service.UserSignUpService;
import com.example.springmail.domain.user.service.VerifyAuthCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final SendAuthCodeService sendAuthCodeService;
    private final VerifyAuthCodeService verifyAuthCodeService;
    private final UserSignUpService userSignUpService;

    @PostMapping("/auth")
    public void signUp(@RequestBody SignUpRequest request) {
        userSignUpService.execute(request);
    }

    @PostMapping("/email/send")
    public void sendEmail(@RequestBody SendEmailRequest request) {
        sendAuthCodeService.execute(request);
    }

    @PutMapping("/email/verify")
    public void verifyEmail(@RequestBody VerifyAuthCodeRequest request) {
        verifyAuthCodeService.execute(request);
    }
}

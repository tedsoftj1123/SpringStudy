package com.example.springmail.domain.user.presentation;

import com.example.springmail.domain.user.presentation.dto.SendEmailRequest;
import com.example.springmail.domain.user.presentation.dto.SignUpRequest;
import com.example.springmail.domain.user.service.SendAuthCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final SendAuthCodeService sendAuthCodeService;

    @PostMapping("/auth")
    public void signUp(@RequestBody SignUpRequest request) {

    }

    @PostMapping("/email/send")
    public void sendEmail(@RequestBody SendEmailRequest request) {
        sendAuthCodeService.execute(request);
    }
}

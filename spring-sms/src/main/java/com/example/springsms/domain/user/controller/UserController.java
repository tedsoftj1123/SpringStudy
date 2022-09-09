package com.example.springsms.domain.user.controller;

import com.example.springsms.domain.user.controller.dto.SignupRequest;
import com.example.springsms.domain.user.controller.dto.UserSendMailRequest;
import com.example.springsms.domain.user.service.SendAuthCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final SendAuthCodeService sendAuthCodeService;

    @PostMapping("/send")
    public void sendUserAuthCode(@RequestBody UserSendMailRequest request) {
        sendAuthCodeService.execute(request);
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody SignupRequest request) {

    }
}

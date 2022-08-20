package com.example.springmail.domain.user.presentation;

import com.example.springmail.domain.user.presentation.dto.SendEmailRequest;
import com.example.springmail.domain.user.service.SendAuthCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final SendAuthCodeService sendAuthCodeService;

    @PostMapping("/email/send")
    public void sendEmail(@RequestBody SendEmailRequest request) {
        sendAuthCodeService.execute(request);
    }
}

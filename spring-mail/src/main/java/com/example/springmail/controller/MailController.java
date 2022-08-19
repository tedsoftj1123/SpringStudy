package com.example.springmail.controller;

import com.example.springmail.dto.MailRequest;
import com.example.springmail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @PostMapping("/mail")
    public String sendMail(@RequestBody MailRequest req) {
        return mailService.sendMail(req);
    }
}

package com.example.springmail.service;

import com.example.springmail.dto.MailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MailService {
    private final JavaMailSender mailSender;

    public String sendMail(MailRequest req) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2kwon2lee@gmail.com");
        message.setTo(req.getEmail());
        message.setSubject(req.getTitle());
        message.setText(req.getContent());
        mailSender.send(message);
        return "mail 전송완료";
    }
}

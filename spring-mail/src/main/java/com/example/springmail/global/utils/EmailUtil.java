package com.example.springmail.global.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
@RequiredArgsConstructor
public class EmailUtil {

    @Value("${spring.mail.username")
    private String from;
    private final JavaMailSender javaMailSender;

    public void sendMail(String toAddress, String authCode) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo(toAddress);
            helper.setFrom(from);
            helper.setSubject("인증용 코드입니다.");
            helper.setText(authCode);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(message);
    }
}

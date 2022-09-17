package com.example.springsms.global.util;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AwsSESUtil {
    private final AmazonSimpleEmailService amazonSimpleEmailService;
    private static final String subject = "이메일 인증용 코드 입니다.";
    public void send(String to, String authCode) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("tedsoftj1123@dsm.hs.kr")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(createContent(subject))
                        .withBody(new Body().withText(createContent(authCode)))
                );

        amazonSimpleEmailService.sendEmail(request);
    }

    private Content createContent(String text) {
        return new Content()
                .withCharset("UTF-8")
                .withData(text);
    }
}

package com.example.springsms.global.util;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsync;
import com.amazonaws.services.simpleemail.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AwsSESUtil {
    private final AmazonSimpleEmailServiceAsync amazonSimpleEmailServiceAsync;
    private static final String subject = "이메일 인증용 코드 입니다.";
    public void send(String to, String authCode) {
        SendEmailRequest request = new SendEmailRequest()
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content().withCharset("UTF-8")
                                .withData(AwsSESUtil.subject))
                        .withBody(new Body().withText(new Content(authCode))))
                .withSource("tedsoftj1123@dsm.hs.kr");

        amazonSimpleEmailServiceAsync.sendEmailAsync(request);
    }
}

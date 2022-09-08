package com.example.springsms.global.util;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsync;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
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
                                .withData(AwsSESUtil.subject)))
                .withSource(authCode);

        amazonSimpleEmailServiceAsync.sendEmailAsync(request);
    }
}

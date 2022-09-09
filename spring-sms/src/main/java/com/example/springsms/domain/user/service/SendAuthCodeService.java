package com.example.springsms.domain.user.service;

import com.example.springsms.domain.user.controller.dto.UserSendMailRequest;
import com.example.springsms.global.util.AwsSESUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendAuthCodeService {
    private final AwsSESUtil awsSESUtil;

    public void execute(UserSendMailRequest request) {
        String to = request.getTo();
        String authCode = generateRandomCode();
        awsSESUtil.send(to, authCode);
    }

    private String generateRandomCode() {
        return RandomStringUtils.randomNumeric(5);
    }
}

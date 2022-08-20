package com.example.springmail.domain.user.service;

import com.example.springmail.domain.user.presentation.dto.SendEmailRequest;
import com.example.springmail.global.utils.EmailUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class SendAuthCodeService {

    private final EmailUtil emailUtil;

    public void execute(SendEmailRequest email) {
        String to = email.getEmail();
        String randCode = createRandomCode();
        emailUtil.sendMail(to, randCode);
    }

    private String createRandomCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for(int i=0;i<6;i++) {
            String randNum = Integer.toString(random.nextInt(9));
            code.append(randNum);
        }
        return code.toString();
    }
}

package com.example.springmail.domain.user.facade;

import com.example.springmail.domain.user.domain.AuthCode;
import com.example.springmail.domain.user.domain.repository.AuthCodeRepository;
import com.example.springmail.global.exception.InvalidAuthCodeException;
import com.example.springmail.global.utils.EmailUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@RequiredArgsConstructor
@Component
public class AuthCodeFacade {

    private final EmailUtil emailUtil;
    private final AuthCodeRepository authCodeRepository;

    private String createRandomCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for(int i=0;i<6;i++) {
            String randNum = Integer.toString(random.nextInt(9));
            code.append(randNum);
        }
        return code.toString();
    }

    public AuthCode getAuthCodeById(String email) {
        return authCodeRepository.findById(email)
                .orElseThrow(() -> InvalidAuthCodeException.EXCEPTION);
    }

    public boolean checkVerified(String email) {
        return getAuthCodeById(email).isVerified();
    }

    public void sendEmail(String email) {
        String randCode = createRandomCode();
        if(!authCodeRepository.existsByEmail(email)) {
            authCodeRepository.save(
                    AuthCode.builder()
                            .authCode(randCode)
                            .email(email)
                            .build()
            );
        }
        emailUtil.sendMail(email, randCode);
    }
}

package com.example.board.domain.user.presentation;

import com.example.board.domain.user.presentation.dto.MemberSignUpRequest;
import com.example.board.domain.user.service.MemberSingUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberSingUpService memberSingUpService;

    @PostMapping("/auth")
    public String signUp(@RequestBody MemberSignUpRequest request) {
        memberSingUpService.execute(request);
    }

}

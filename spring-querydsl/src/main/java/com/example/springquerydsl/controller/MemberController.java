package com.example.springquerydsl.controller;

import com.example.springquerydsl.domain.Member;
import com.example.springquerydsl.service.MemberSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberSignUpService service;

    @GetMapping("/{id}")
    public Member test(@PathVariable Long id) {
        return service.search(id);
    }
}

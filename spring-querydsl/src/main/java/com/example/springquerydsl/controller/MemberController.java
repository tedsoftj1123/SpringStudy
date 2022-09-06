package com.example.springquerydsl.controller;

import com.example.springquerydsl.domain.Member;
import com.example.springquerydsl.service.MemberSignUpService;
import com.example.springquerydsl.service.QueryFindUserBetweenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberSignUpService service;
    private final QueryFindUserBetweenService queryFindUserBetweenService;

    @GetMapping("/{id}")
    public Member test(@PathVariable Long id)  {
        return service.search(id);
    }

    @GetMapping
    public List<MemberCustom> serchUser(@RequestParam int a, @RequestParam int b) {
        return queryFindUserBetweenService.execute(a, b);
    }
}

package com.example.spring2.controller;

import com.example.spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
 스프링 부트가 시작되면 @Componont 라는 어노테이션이 있는 클래스를 자동이로
 spring 빈으로 자동 등록되는데 @controller, @service, @repository 에는 @componont가
 들어있어서 자동으로 등록된다.
 */

@Controller// 컴포너트 스캔
public class MemberController {
    private final MemberService memberService;

    @Autowired // memberservice로 의존관계 설정
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

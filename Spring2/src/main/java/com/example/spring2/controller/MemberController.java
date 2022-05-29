package com.example.spring2.controller;

import com.example.spring2.domain.Member;
import com.example.spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.List;

/*
 스프링 부트가 시작되면 @Componont 라는 어노테이션이 있는 클래스를 자동이로
 spring 빈으로 자동 등록되는데 @controller, @service, @repository 에는 @componont가
 들어있어서 자동으로 등록된다.
 */
@Controller
public class MemberController {
    private final MemberService memberService;// memberservice로 의존관계 설정
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(MemberForm form) throws SQLException {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}

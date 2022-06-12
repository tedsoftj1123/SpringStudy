package com.example.springmemberservice.controller;
import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "/home/index";
    }

    @GetMapping("/member/signup")
    public String signupForm(Model model) {
        model.addAttribute("member",new MemberDto());

        return "/member/signupForm";
    }

    @PostMapping("/member/signup")
    public String signup(MemberDto memberDto) {
        memberService.signUp(memberDto);

        return "redirect:/";
    }

    @GetMapping("/member/login")
    public String login() {
        return "/member/loginForm";
    }
}
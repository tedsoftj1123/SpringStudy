package com.example.springmemberservice.service;

import com.example.springmemberservice.domain.Member;
import com.example.springmemberservice.dto.MemberDto;
import com.example.springmemberservice.exeption.UserAlreadyExistsException;
import com.example.springmemberservice.exeption.UserNotFoundException;
import com.example.springmemberservice.exeption.WrongPasswordException;
import com.example.springmemberservice.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService{
    private MemberRepository memberRepository;

    public String save(MemberDto req) {
        if(memberRepository.existsByUsername(req.getUsername())){
            throw new UserAlreadyExistsException();
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        req.setPassword(encoder.encode(req.getPassword()));
        memberRepository.save(Member.builder()
                .username(req.getUsername())
                .password(req.getPassword())
                .auth(req.getAuth()).build());
        return "회원가입 완료" + "id=" + req.getUsername();
    }

    public String login(MemberDto req) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Member member = memberRepository.findByUsername(req.getUsername())
                .orElseThrow(UserNotFoundException::new);
        if(!passwordEncoder.matches(req.getPassword(), member.getPassword())){
            throw new WrongPasswordException();
        }
        return "login suceed";
    }
}

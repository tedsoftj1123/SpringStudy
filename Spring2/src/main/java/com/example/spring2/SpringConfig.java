package com.example.spring2;

import com.example.spring2.aop.TimeTraceAop;
import com.example.spring2.repository.JpaMemberRepository;
import com.example.spring2.repository.MemberRepository;
import com.example.spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }
    //SpringDataJpa는 JpaRepository를 상속받으면 알아서 구현체를 만들고 bean에 추가해준다.
   /* @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }*/
}

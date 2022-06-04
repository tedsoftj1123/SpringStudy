package com.example.spring2;

import com.example.spring2.repository.JdbcMemberRepository;
import com.example.spring2.repository.JdbcTemplateMemberRepository;
import com.example.spring2.repository.JpaMemberRepository;
import com.example.spring2.repository.MemberRepository;
import com.example.spring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    private EntityManager em;
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}

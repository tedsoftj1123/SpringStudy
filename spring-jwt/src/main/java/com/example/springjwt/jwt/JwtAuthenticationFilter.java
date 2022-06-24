package com.example.springjwt.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean {
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token = jwtTokenProvider.resolveToken((HttpServletRequest) request); //JWT를 받아온다.
        if(token != null && jwtTokenProvider.validateToken(token)) { // 유효한 트콘인지 확인한다.
            Authentication authentication = jwtTokenProvider.getAuthentication(token); //토큰이 유효하면 정보를 가져온다.
            SecurityContextHolder.getContext().setAuthentication(authentication); //securitycontextholder에 인증정보를 저장한다.
        }
        chain.doFilter(request, response);
    }
}

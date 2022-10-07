package com.example.springjwt.config;
import com.example.springjwt.jwt.JwtAuthenticationFilter;
import com.example.springjwt.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class WebSecurityConfig {

    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors()
                .and()

                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // Use Jpa

                .and()
                .authorizeRequests() // 요청에 대한 사용권한 체크
                .antMatchers(HttpMethod.GET, "/admin/**").hasRole("ROLE_ADMIN")
                .antMatchers("/member/**").hasAnyRole("ROLE_USER", "ROLE_ADMIN")
                .anyRequest().authenticated()

                .and()
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider),
                        UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}

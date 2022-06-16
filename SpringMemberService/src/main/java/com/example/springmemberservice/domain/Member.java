package com.example.springmemberservice.domain;

import lombok.*;
<<<<<<< HEAD
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
=======
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
>>>>>>> v4

@Entity
@Getter
@Builder
<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@NoArgsConstructor
@AllArgsConstructor
public class Member implements UserDetails{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> v4
    private Long id;
    private String email;
    private String password;
<<<<<<< HEAD
    private String auth;
=======

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
>>>>>>> v4
}

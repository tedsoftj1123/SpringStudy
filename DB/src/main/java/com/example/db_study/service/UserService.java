package com.example.db_study.service;

import com.example.db_study.dto.UserDto;
import com.example.db_study.model.User;
import com.example.db_study.model.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String signup(UserDto userDto) {
        userRepository.save(User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build());
        return "회원가입 성공";
    }
}

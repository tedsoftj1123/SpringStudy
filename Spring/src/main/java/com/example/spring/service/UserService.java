package com.example.spring.service;


import com.example.spring.data.repository.UserRepository;
import com.example.spring.dto.UserDTO;
import com.example.spring.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public String signup(UserDTO userDTO) {
        userRepository.save(User.builder()
                .productName(userDTO.getProductName())
                .productPrice(userDTO.getProductPrise())
                .build());
        return "회원가입 성공";
    }

}
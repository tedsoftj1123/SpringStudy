package com.example.springkotlin.global.user.service

import com.example.springkotlin.global.user.entity.User
import com.example.springkotlin.global.user.entity.repository.UserRepository
import com.example.springkotlin.global.user.presentation.dto.SignUpRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SignUpService(
    private val userRepository: UserRepository
) {

    @Transactional
    fun execute(signUpRequest: SignUpRequest) {
        val user = User(
            accountId = signUpRequest.accountId,
            password = signUpRequest.password
        )

        userRepository.save(user)
    }
}
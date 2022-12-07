package com.example.springkotlin.domain.user

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserSignUpService(
    private val userRepository: UserRepository
) {
    @Transactional
    fun execute(request: SignupRequest) {
        userRepository.save(
            User(accountId = request.accountId, password = request.password)
        )
    }
}
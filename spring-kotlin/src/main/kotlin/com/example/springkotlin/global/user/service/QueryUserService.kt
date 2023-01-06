package com.example.springkotlin.global.user.service

import com.example.springkotlin.global.user.entity.repository.UserRepository
import com.example.springkotlin.global.user.presentation.dto.QueryUserResponse
import org.springframework.stereotype.Service

@Service
class QueryUserService(
    private val userRepository: UserRepository
) {

    fun execute(accountId: String): QueryUserResponse {
        val user = userRepository.findByAccountId(accountId) ?: throw NullPointerException("user not found")

        return QueryUserResponse(
            userId = user.userId,
            accountId = user.accountId,
            password = user.password,
            createdAt = user.createdAt
        )
    }
}
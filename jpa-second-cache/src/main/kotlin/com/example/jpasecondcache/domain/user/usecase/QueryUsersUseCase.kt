package com.example.jpasecondcache.domain.user.usecase

import com.example.jpasecondcache.domain.user.entity.User
import com.example.jpasecondcache.domain.user.entity.repository.UserJpaRepository
import org.springframework.stereotype.Component

@Component
class QueryUsersUseCase(
    private val userJpaRepository: UserJpaRepository
) {

    fun execute(): List<User> {
        return userJpaRepository.findAll()
    }
}
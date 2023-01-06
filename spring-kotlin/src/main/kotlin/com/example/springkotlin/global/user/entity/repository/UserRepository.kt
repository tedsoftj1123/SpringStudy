package com.example.springkotlin.global.user.entity.repository

import com.example.springkotlin.global.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {
    fun findByAccountId(accountId: String): User?
}
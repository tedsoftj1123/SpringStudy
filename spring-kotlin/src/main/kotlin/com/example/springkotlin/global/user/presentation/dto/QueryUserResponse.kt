package com.example.springkotlin.global.user.presentation.dto

import java.time.LocalDateTime
import java.util.UUID

data class QueryUserResponse(
    val userId: UUID,
    val accountId: String,
    val password: String,
    val createdAt: LocalDateTime
)

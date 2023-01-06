package com.example.springkotlin.global.user.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.UUID

@Entity
class User(
    @Id
    val userId: UUID = UUID.randomUUID(),

    val accountId: String,

    val password: String,

    val createdAt: LocalDateTime = LocalDateTime.now()
)
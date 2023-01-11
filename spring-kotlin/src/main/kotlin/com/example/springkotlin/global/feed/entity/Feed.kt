package com.example.springkotlin.global.feed.entity

import com.example.springkotlin.global.user.entity.User
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
class Feed(
    @Id
    val id:UUID = UUID.randomUUID(),

    val title:String,

    val content:String,

    val createdAt: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user:User
)
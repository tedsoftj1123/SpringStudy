package com.example.springkotlin.global.feed.entity

import com.example.springkotlin.global.user.entity.User
import jakarta.persistence.*
import java.time.LocalDateTime

class Feed(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    val id:Long?,

    val title:String,

    val content:String,

    val createdAt: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user:User
)
package com.example.springkotlin.domain.feed

import com.example.springkotlin.domain.user.User
import jakarta.persistence.*
import java.util.*

@Entity
class Feed(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    val id: String?=null,

    @Column(nullable = false, length = 20)
    val title:String,

    @Column(nullable = false, length = 255)
    val content:String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: ser
)
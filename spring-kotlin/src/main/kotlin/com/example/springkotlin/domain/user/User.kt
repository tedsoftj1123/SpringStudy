package com.example.springkotlin.domain.user

import com.example.springkotlin.domain.feed.Feed
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany


@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id:Long?=null,

    @Column(nullable = false, unique = true, length = 15)
    val accountId:String,

    @Column(nullable = false, length = 20)
    val password:String,

    @OneToMany(mappedBy = "user")
    val feed: ArrayList<Feed>? = null
)
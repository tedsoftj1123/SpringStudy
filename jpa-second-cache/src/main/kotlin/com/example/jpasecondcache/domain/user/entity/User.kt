package com.example.jpasecondcache.domain.user.entity

import jakarta.persistence.Cacheable
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Cacheable
@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    val accountId: String,

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    val password: String,
)
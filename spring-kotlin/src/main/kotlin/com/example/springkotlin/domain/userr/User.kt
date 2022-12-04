package com.example.springkotlin.domain.userr

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


class User(
    accountId:String,
    password:String
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null

    val accountId:String = accountId

    val password:String = password



}
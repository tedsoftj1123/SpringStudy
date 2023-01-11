package com.example.springkotlin.global.feed.presentation.dto

data class CreateFeedRequest(
    val title:String,
    val content:String,
    val userAccountId:String
)

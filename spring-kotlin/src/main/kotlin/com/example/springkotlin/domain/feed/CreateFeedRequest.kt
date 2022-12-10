package com.example.springkotlin.domain.feed


data class CreateFeedRequest(
    val title:String,
    val content:String,
    val userId:Long
)

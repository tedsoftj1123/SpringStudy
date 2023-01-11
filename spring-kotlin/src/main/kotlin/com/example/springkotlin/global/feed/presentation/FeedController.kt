package com.example.springkotlin.global.feed.presentation

import com.example.springkotlin.global.feed.presentation.dto.CreateFeedRequest
import com.example.springkotlin.global.feed.service.CreateFeedService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/feed")
class FeedController(
    private val createFeedService: CreateFeedService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun createFeed(@RequestBody request: CreateFeedRequest) {
        createFeedService.execute(request)
    }
}
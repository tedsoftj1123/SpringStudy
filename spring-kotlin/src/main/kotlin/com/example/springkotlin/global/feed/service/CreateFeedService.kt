package com.example.springkotlin.global.feed.service

import com.example.springkotlin.global.feed.entity.Feed
import com.example.springkotlin.global.feed.entity.repository.FeedRepository
import com.example.springkotlin.global.feed.presentation.dto.CreateFeedRequest
import com.example.springkotlin.global.user.entity.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class CreateFeedService(
    private val feedRepository: FeedRepository,
    private val userRepository: UserRepository
) {

    fun execute(request:CreateFeedRequest) {
        val user = userRepository.findByAccountId(request.userAccountId)?: throw NullPointerException("user not found")

        val feed = Feed(
            title = request.title,
            content = request.content,
            user = user
        )

        feedRepository.save(feed)

    }
}
package com.example.springkotlin.domain.feed

import com.example.springkotlin.domain.user.User
import com.example.springkotlin.domain.user.UserRepository
import org.springframework.transaction.annotation.Transactional
import java.util.*

class CreateFeedService(
    private val feedRepository: FeedRepository,
    private val userRepository: UserRepository
) {
    @Transactional
    fun execute(request: CreateFeedRequest) {
        val user: Optional<User> = userRepository.findById(request.userId)
        feedRepository.save(
            Feed(
                title = request.title,
                content = request.content,
                user = user
            )
        )
    }
}
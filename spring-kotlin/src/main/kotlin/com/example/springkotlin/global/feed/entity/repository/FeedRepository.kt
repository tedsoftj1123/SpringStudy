package com.example.springkotlin.global.feed.entity.repository

import com.example.springkotlin.global.feed.entity.Feed
import org.springframework.data.jpa.repository.JpaRepository

interface FeedRepository : JpaRepository<Feed, Long>
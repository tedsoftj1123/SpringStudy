package com.example.jpasecondcache.domain.user.presentation

import com.example.jpasecondcache.domain.user.entity.User
import com.example.jpasecondcache.domain.user.usecase.QueryUsersUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/users")
@RestController
class UserController(
    private val queryUsersUseCase: QueryUsersUseCase
) {

    @GetMapping
    fun getUsers(): List<User> {
        return queryUsersUseCase.execute()
    }
}
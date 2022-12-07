package com.example.springkotlin.domain.user

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    private val userSignUpService: UserSignUpService
) {
    @PostMapping
    fun userSignup(@RequestBody request: SignupRequest) {
        userSignUpService.execute(request)
    }
}
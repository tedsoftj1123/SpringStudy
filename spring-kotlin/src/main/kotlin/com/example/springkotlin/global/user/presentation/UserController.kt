package com.example.springkotlin.global.user.presentation

import com.example.springkotlin.global.user.presentation.dto.QueryUserResponse
import com.example.springkotlin.global.user.presentation.dto.SignUpRequest
import com.example.springkotlin.global.user.service.QueryUserService
import com.example.springkotlin.global.user.service.SignUpService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    val queryUserService: QueryUserService,
    val signUpService: SignUpService
) {

    @GetMapping("/{account-id}")
    fun queryUser(@PathVariable("account-id") accountId:String): QueryUserResponse {
        return queryUserService.execute(accountId);
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    fun signup(@RequestBody request: SignUpRequest) {
        signUpService.execute(request);
    }
}
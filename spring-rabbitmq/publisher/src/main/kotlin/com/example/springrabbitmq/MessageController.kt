package com.example.springrabbitmq

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(
    private val rabbitTemplate: RabbitTemplate
) {

    @GetMapping("/api/message")
    fun publishEvent(@RequestBody messageRequest: MessageRequest) {
        rabbitTemplate.convertAndSend("sample.exchange", "sample.routing.#", messageRequest.message)
    }
}
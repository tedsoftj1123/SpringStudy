package com.example.consumer

import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class MessageListener {

    @RabbitListener(queues = ["sample.queue"])
    fun getMessage(message: Message) {
        println(message.toString())
    }
}
package com.example.springwebsocket.controller;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnEvent;
import com.example.springwebsocket.controller.dto.MessageRequest;
import com.example.springwebsocket.service.SendMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final SendMessageService sendMessageService;
    @OnEvent("send_message")
    public void sendMsg(SocketIOClient socketIOClient, @RequestBody MessageRequest request) {
        sendMessageService.sendMessage(socketIOClient, request);
    }
}

package com.example.springwebsocket.service;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.example.springwebsocket.controller.dto.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMessageService {
    private final SocketIOServer socketIOServer;
    public void sendMessage(SocketIOClient client, MessageRequest request) {
        socketIOServer.getAllClients()
                .forEach(
                        s ->
                                s.sendEvent("send_message", request)
                );
    }
}

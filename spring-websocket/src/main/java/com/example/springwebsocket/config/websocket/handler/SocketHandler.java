package com.example.springwebsocket.config.websocket.handler;


import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SocketHandler {
    public static final ConcurrentHashMap<UUID, SocketIOClient> concurrentHashMap = new ConcurrentHashMap<>();
    @OnConnect
    public void onConnect(SocketIOClient client) {
        String uid = client.getHandshakeData().getSingleUrlParam("id");
        UUID sessionId = client.getSessionId();
        concurrentHashMap.put(sessionId, client);
        client.set("user", uid);
    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        concurrentHashMap.remove(client.getSessionId());
    }
}

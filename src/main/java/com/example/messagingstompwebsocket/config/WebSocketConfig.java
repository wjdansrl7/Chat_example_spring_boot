package com.example.messagingstompwebsocket.config;

import com.example.messagingstompwebsocket.handler.DevLogWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket // 웺소켓 활성화
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    private DevLogWebSocketHandler devLogWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // WebSocketHandler를 추가
        registry.addHandler(devLogWebSocketHandler, "chating");
    }
}

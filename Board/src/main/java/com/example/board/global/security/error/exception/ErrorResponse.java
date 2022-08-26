package com.example.board.global.security.error.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponse {
    private int errorCode;
    private String errorMessage;
    private LocalDateTime timeStamp;
}

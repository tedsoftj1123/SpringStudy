package com.example.springs3.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateFeedRequest {
    private String title;
    private String content;
    private String imgUrl;
}

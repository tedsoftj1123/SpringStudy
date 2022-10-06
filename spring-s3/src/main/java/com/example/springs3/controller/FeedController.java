package com.example.springs3.controller;

import com.example.springs3.controller.dto.CreateFeedRequest;
import com.example.springs3.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class FeedController {
    private final FeedService feedService;

    @PostMapping("/post")
    public void post(@RequestBody CreateFeedRequest request) {
        feedService.uploadFeed(request);
    }
}

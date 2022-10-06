package com.example.springs3.service;

import com.example.springs3.controller.dto.CreateFeedRequest;
import com.example.springs3.entity.Feed;
import com.example.springs3.entity.FeedRepository;
import com.example.springs3.util.S3Facade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedRepository feedRepository;
    private final S3Facade s3Facade;

    public void uploadFeed(CreateFeedRequest request) {
        String title = request.getTitle();
        String content = request.getContent();
        String imgUrl = request.getImgUrl();
        feedRepository.save(
                Feed.builder()
                        .title(title)
                        .content(content)
                        .contentImgUrl(imgUrl)
                        .build()
        );
    }
}

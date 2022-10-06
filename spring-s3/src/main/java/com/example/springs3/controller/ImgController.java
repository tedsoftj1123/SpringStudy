package com.example.springs3.controller;

import com.example.springs3.service.UploadImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class ImgController {
    private final UploadImgService uploadImgService;

    @PostMapping("/img")
    public String uploadImg(@RequestPart MultipartFile img) {
        return uploadImgService.uploadImg(img);
    }
}

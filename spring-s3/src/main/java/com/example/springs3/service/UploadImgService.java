package com.example.springs3.service;

import com.example.springs3.util.S3Facade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class UploadImgService {
    private final S3Facade s3Facade;

    public String uploadImg(MultipartFile img) {
        return s3Facade.uploadImage(img);
    }
}

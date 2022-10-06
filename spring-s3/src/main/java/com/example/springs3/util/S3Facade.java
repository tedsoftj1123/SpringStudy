package com.example.springs3.util;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class S3Facade {
    private final AmazonS3Client amazonS3Client;
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;
    public String uploadImage(MultipartFile file) {
        String fileName = bucket + "/" + UUID.randomUUID()+"-" + file.getOriginalFilename();

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(file.getSize());
        System.out.println(bucket);
        try {
            amazonS3Client.putObject(new PutObjectRequest(
                            bucket,
                            fileName,
                            file.getInputStream(),
                            metadata
                    )
            );
        } catch (IOException e) {
            throw new IllegalStateException("error");
        }
        return amazonS3Client.getUrl(bucket, fileName).toString();
    }
}

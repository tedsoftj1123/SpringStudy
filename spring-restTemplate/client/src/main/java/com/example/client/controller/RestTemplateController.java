package com.example.client.controller;


import com.example.client.controller.dto.MemberDto;
import com.example.client.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateService restTemplateService;
    @GetMapping("/a")
    public String getMsg() {
        return restTemplateService.getMsg();
    }
    @GetMapping("/b")
    public String getName() {
        return restTemplateService.getName();
    }
    @GetMapping("/c")
    public String getName2() {
        return restTemplateService.getName2();
    }
    @PostMapping("/d")
    public ResponseEntity<MemberDto> postDto() {
        return restTemplateService.postDto();
    }
    @PostMapping("/e")
    public ResponseEntity<MemberDto> header() {
        return restTemplateService.getHeader();
    }
}

package com.example.client.service;


import com.example.client.controller.dto.MemberDto;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@Service
public class RestTemplateService {
    static final String PATH = "http://localhost:9090";
    public URI uriBuilder(String path) {
        return UriComponentsBuilder
                .fromUriString(PATH)
                .path(path)
                .encode()
                .build()
                .toUri();
    }
    public String getMsg() {
        URI uri = uriBuilder("/msg");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody();
    }
    public String getName() {
        URI uri = UriComponentsBuilder
                .fromUriString(PATH)
                .path("/name")
                .queryParam("name", "ted")
                .encode()
                .build()
                .toUri();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody();
    }
    public String getName2() {
        URI uri = UriComponentsBuilder
                .fromUriString(PATH)
                .path("/name/{name}")
                .encode()
                .build()
                .expand("ted")
                .toUri();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody();
    }
    public ResponseEntity<MemberDto> postDto() {
        URI uri = UriComponentsBuilder
                .fromUriString(PATH)
                .path("/member")
                .queryParam("name", "ted")
                .queryParam("email", "test@test.com")
                .queryParam("organization", "DMS")
                .encode()
                .build()
                .toUri();
        MemberDto memberDto = new MemberDto();
        memberDto.setEmail("test@test.com");
        memberDto.setName("ted");
        memberDto.setOrganization("DMS");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MemberDto> responseEntity = restTemplate.postForEntity(uri, memberDto, MemberDto.class);
        return responseEntity;
    }
    public ResponseEntity<MemberDto> getHeader() {
        URI uri = UriComponentsBuilder
                .fromUriString(PATH)
                .path("/header")
                .encode()
                .build()
                .toUri();
        MemberDto memberDto = new MemberDto();
        memberDto.setName("ted2");
        memberDto.setEmail("test@test.com");
        memberDto.setOrganization("DMS");

        RequestEntity<MemberDto> requestEntity = RequestEntity.post(uri).header("header", "this is header").body(memberDto);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MemberDto> responseEntity = restTemplate.exchange(requestEntity, MemberDto.class);
        return responseEntity;
    }
}

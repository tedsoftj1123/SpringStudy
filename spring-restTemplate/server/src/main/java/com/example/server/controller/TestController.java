package com.example.server.controller;

import com.example.server.controller.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/msg")
    public String test1() {
        return "Hello client!";
    }
    @GetMapping("/name")
    public String test2(@RequestParam String name) {
        return "Hello" + name;
    }
    @GetMapping("/name/{name}")
    public String test3(@PathVariable String name) {
        return "Hello" + name;
    }
    @PostMapping("/member")
    public ResponseEntity<MemberDto> test4(
            @RequestBody MemberDto memberDto,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDto);
    }
    @PostMapping("/header")
    public ResponseEntity<MemberDto> test5(@RequestHeader("header") String header, @RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDto);
    }

}

package com.example.spring.controller;

import com.example.spring.DTO.PracticeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PracticeController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello2/{value}")
    public String hello2(@PathVariable String value){
        return value;
    }

    @GetMapping("/hello3/{var}")
    public String hello3(@PathVariable("var") String value){
        return value;
    }

    @GetMapping("/hello4")
    public String hello4(
            @RequestParam String name,
            @RequestParam String age){
        return name + age;
    }

    @GetMapping(value = "/hello5")
    public String hello5(PracticeDTO practiceDTO){
        return practiceDTO.toString();
    }
}

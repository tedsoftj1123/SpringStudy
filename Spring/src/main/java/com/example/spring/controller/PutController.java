package com.example.spring.controller;

import com.example.spring.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PutController {
    @PutMapping(value = "/putapi")
    public String putMethod(){return "HelloWorld!";}

    @PutMapping(value = "/putapi2")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb3 = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb3.append(map.getKey()+" : "+map.getValue()+"\n");
        });
        return sb3.toString();
    }

    @PutMapping(value = "/putapi3")
    public String postMemberDto1(@RequestBody MemberDTO memberDTO){return memberDTO.toString();}

    @PutMapping(value = "/putapi4")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }

    @PutMapping(value = "/putapi5")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }


}

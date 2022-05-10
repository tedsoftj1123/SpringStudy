package com.example.study.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

//이제 이 클래스는 컨트롤러일을 한다.
@RestController
@RequestMapping("/aaa")//localhost:8080/aaa 로 오는 요청을 처리한다.
public class GetController {
    @GetMapping(value = "/name")//aaa/name 으로 오는 요청을 처리한다.
    public String getName() {
        return "ted";
    }

    @GetMapping(value = "/variable/{variable}")// 유저가 입력한 경로 자체를 변수로 저장한다.
    public String getVal(@PathVariable String variable) {
        return variable;
    }

    @GetMapping(value = "/variable/{variable}")// 원래 요기랑 아래 받는 변수 이름이 같아야되는데 이렇게 하면 안해도 됨
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }
    //사이트 가보면 /뭐시기 뒤에 ?오고 뭐
    //?name=ted&email=tedsofjt1123@gmail.com
    //뭐 오는걸 파라미터라고 한다.
    //이걸 처리해준다.
    @GetMapping(value = "/request")
    public String GetRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name+" "+email+ " " + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach((key, value) -> {
            sb.append(map.getKey() + " : " + value + "\n");
        });
        return sb.toString();
    }
}
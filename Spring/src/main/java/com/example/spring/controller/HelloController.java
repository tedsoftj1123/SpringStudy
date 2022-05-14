package com.example.spring.controller;


import com.example.spring.DTO.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController// 얘는 컨트롤러다 명시해줌 RerquestBody + controller
public class HelloController {
    //아래 있는것들은 url에 있는 내용을 가져오는 방법들이다.
    @GetMapping//별도의 파라미터 없이 get 호출
    public String getName(){
        return "Ted";
    }

    @GetMapping(value = "/variable1/{variable}") // 매개변수를 전달하기 위해 url자체에 값을 담아 요청
    public String getVariable1(@PathVariable String variable) {
        return variable;//ex /variable1/ted => return ted
    }
    /*
        위에껀 값을 가져오기 위해선 {변수}에 들어간 이름과 메소드의 매개변수의 이름이 같아야된다.
        하지만 아래껀 변수의 이름을 같게 선언할 수 없을때도 사용할 수 있다.
     */
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    @GetMapping(value = "/request1") // http://..../request1<<?name=ted&email=test@test.com&organization=dms>>
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name+" "+email+" "+organization;
    }

    @GetMapping(value = "/request2")// 위에껀 형식이 정해져 있다 하지만 이 방법으론 어떤 요청 없이 들어올지 모를 경우 사용하는 방식이다.
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey()+":"+map.getValue()+"\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "/request3")// 전전꺼랑 같다, ,key와 value가 정해져 있지만 파라미터 가 너무 많으면 이 방법을 사용한다.
    public String getRequestParam3(MemberDTO memberDTO){

        return memberDTO.toString();
    }
}

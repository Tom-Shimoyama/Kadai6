package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/fortune")
    public String start(){
        double fn = Math.random();
        if (fn >= 0.7){
            return "あなたの運勢は大吉です！！！";
        } else if (fn >= 0.4){
            return "あなたの運勢は中吉です！！";
        } else if (fn >= 0.1){
            return "あなたの運勢は小吉です";
        } else {
            return "あなたの運勢は凶です！！";
        }
    }
}

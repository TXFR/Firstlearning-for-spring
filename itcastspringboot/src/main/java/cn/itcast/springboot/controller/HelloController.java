package cn.itcast.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("show1")
    public String test(){
        return "hello Spring Boot!";
    }

}

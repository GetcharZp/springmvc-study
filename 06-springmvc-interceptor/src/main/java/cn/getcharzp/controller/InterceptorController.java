package cn.getcharzp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello ==== run");
        return "Hello";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println("hello2 ==== run");
        return "Hello";
    }
}

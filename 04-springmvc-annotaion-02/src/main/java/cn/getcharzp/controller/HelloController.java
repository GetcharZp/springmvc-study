package cn.getcharzp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello")
//    @GetMapping
    public String hello(String name) {
        return "Hello :" + name + "Hello : 猫猫虫";
    }
}

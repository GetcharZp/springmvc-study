package cn.getcharzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello2Controller {
    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "Hello 2";
    }
}

package cn.getcharzp.controller;

import cn.getcharzp.pojo.User;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @RequestMapping("/json")
    public String json() {
        User zp = new User("zp", "123456");
        return JSON.toJSONString(zp);
    }
}

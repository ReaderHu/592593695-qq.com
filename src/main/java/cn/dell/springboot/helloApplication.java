package cn.dell.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class helloApplication {
    @ResponseBody
    @RequestMapping("hello")
    private String hello(){
        return "hello world";

    }
}

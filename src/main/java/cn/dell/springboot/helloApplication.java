package cn.dell.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class helloApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(helloApplication.class, args);

    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello worlds";
    }

}

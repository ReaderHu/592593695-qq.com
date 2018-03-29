package cn.dell.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@Controller
@SpringBootApplication
public class demoApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(helloApplication.class, args);
    }
    @RequestMapping("demo")
    @ResponseBody
    private String hello(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String d= format.format(date);
        System.out.println(d);
        return d;
    }

}

package cn.dell.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class helloApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(demoApplication.class, args);
	}

	@ResponseBody
	@RequestMapping("hello")
	private String hello() {
		return "hello world";

	}
}

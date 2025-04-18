package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

@Controller
@RequestMapping("/test")
class TestController {

    @GetMapping
    @ResponseBody
    public String testPage(){
        return "Hello World";
    }
	
    @PostMapping
    @ResponseBody
    public String testPage2(){
        return "오타 테스트";
    }


}

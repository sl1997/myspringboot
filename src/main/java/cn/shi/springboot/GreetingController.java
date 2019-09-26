package cn.shi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingController {

    public static void main(String[] args) {
        SpringApplication.run(GreetingController.class, args);
        System.out.println("Hello world!");
    }

}

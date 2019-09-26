package cn.shi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")  //ensure HTTP get request from greeting() method
    public String index(){
        return "index";
    }
}

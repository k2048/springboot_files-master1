package com.yusael.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "login";
    }


    @GetMapping("/show")
    public String show(){
        return "showAll";
    }
}

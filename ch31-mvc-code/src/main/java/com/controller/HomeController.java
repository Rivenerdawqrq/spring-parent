package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/hi")
    public String hh(){
        return "hello";
    }
}

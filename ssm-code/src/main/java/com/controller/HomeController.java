package com.controller;

import com.entity.Dept;
import com.service.DeptService;
import config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Controller
public class HomeController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("")
    public String index(){
        return "aaa";
    }

    @GetMapping("/insert")
    public String hhh(Dept dept, Model model){
        deptService.insert(dept);
        model.addAttribute("ok","ok");
        return "aaa";
    }
}

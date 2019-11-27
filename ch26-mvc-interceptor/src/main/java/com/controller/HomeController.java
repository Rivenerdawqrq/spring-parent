package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/index2")
    public String index(){
        return "index2";
    }

    @RequestMapping("/login")
    public ModelAndView login( HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("pwd",pwd);
        modelAndView.setViewName("/index2");
        return modelAndView;
    }



}

package com.controller;

import com.entity.Dept;
import com.entity.UserInfos;
import com.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ApplicationContext context;


    @GetMapping("/insert")
    public ModelAndView insert(@Valid Dept dept,BindingResult bindingResult){
        DeptServiceImpl bean = context.getBean(DeptServiceImpl.class);
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()){
            //获取所有出错字段
            List<FieldError> fieldError = bindingResult.getFieldErrors();
            for (FieldError error : fieldError) {
                System.out.println(error.getField());
                modelAndView.addObject(error.getField(),error.getDefaultMessage());
            }
            modelAndView.setViewName("aaa");
        }else {
            modelAndView.setViewName("aaa");
            bean.insert(dept);
            modelAndView.addObject("ok","添加成功");
        }

        return modelAndView;
    }

    @RequestMapping("")
    public String aaa(){
        return "inserUser";
    }

    @RequestMapping("/bbb")
    public ModelAndView insertUser(@Valid UserInfos userInfos,BindingResult result){

        ModelAndView modelAndView = new ModelAndView();
        DeptServiceImpl bean = context.getBean(DeptServiceImpl.class);
        if (result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }
            modelAndView.setViewName("inserUser");

        }else {
            System.out.println(userInfos.getBirthday());
            bean.userAdd(userInfos);
            modelAndView.setViewName("inserUser");
            modelAndView.addObject("ok","添加成功");
        }

        return modelAndView;
    }
}

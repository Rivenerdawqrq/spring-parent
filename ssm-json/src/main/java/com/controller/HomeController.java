package com.controller;

import com.entity.UserInfos;
import com.github.pagehelper.PageInfo;
import com.service.UsersServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UsersServiceImpl usersService;

    @InitBinder
    public  void  initBinder(WebDataBinder dataBinder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        dataBinder.addCustomFormatter(dateFormatter);
    }
    @RequestMapping
    public String index(){
        return "home";
    }
    /**
     * ResponseBody注解的含义:
     * 1. 就是把方法的返回类型交给一个特殊的特性去处理(HttpMessageConverter)
     * 2.处理的结果直接放到http响应体里面
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PageInfo<UserInfos> list(int pageNum,int pageSize){
        List<UserInfos> all = usersService.getAll(pageNum, pageSize);
        PageInfo<UserInfos> pageInfo = new PageInfo<>(all,2);
        return pageInfo;
    }


    @RequestMapping("/insertIndex")
    public String hh(){
        return "add";
    }

    @RequestMapping("/insert")
    public ModelAndView insert(@Valid UserInfos userInfos, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }
            //把提交的内容返回回去
            modelAndView.addObject("userInfos",userInfos);
            modelAndView.setViewName("add");

        }else {
            usersService.insert(userInfos);
            modelAndView.setViewName("home");
        }
        return modelAndView;

    }


}

package com.controller;

import com.entity.UserInfos;
import com.github.pagehelper.PageInfo;
import com.service.UserInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserInfosService service;

    @RequestMapping("/list")
    @ResponseBody
    public PageInfo<UserInfos> index(@RequestParam(value = "pageNum",defaultValue = "1", required = false) int pageNum,
                          @RequestParam(value = "pageSize",defaultValue = "2",required = false) int pageSize){
        List<UserInfos> all = service.getAll(pageNum, pageSize);
        PageInfo<UserInfos> pageInfo = new PageInfo<>(all, 3);
        return pageInfo;
    }

    @RequestMapping()
    public String in(){
        return "list";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/insert")
    public String insert(UserInfos userInfos){
        service.insert(userInfos);
        return "list";
    }
}

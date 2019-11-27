package com.controller;

import com.entity.UserInfos;
import com.github.pagehelper.PageInfo;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("")
    public String index(@RequestParam(name = "pageNum" ,required = false,defaultValue = "1")
                                int pageNum,
                        @RequestParam(name = "pageSize",required = false,defaultValue = "2"
                        )int pageSize, Model model){
        List<UserInfos> all = usersService.getAll(pageNum, pageSize);
        PageInfo<UserInfos> pageInfo = new PageInfo<>(all, 2);
        model.addAttribute("list",pageInfo);
        return "userInfos/list";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}

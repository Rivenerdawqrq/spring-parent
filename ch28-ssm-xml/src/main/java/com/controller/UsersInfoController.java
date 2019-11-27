package com.controller;

import com.entity.UserInfos;
import com.github.pagehelper.PageInfo;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UsersInfoController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/list")
    public String index(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                        @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize,
                        Model model){
        List<UserInfos> all = usersService.getAll(pageNum, pageSize);
        PageInfo<UserInfos> pageInfo = new PageInfo<>(all, 3);
        model.addAttribute("list",pageInfo);
        return "userInfos/list";
    }

    @RequestMapping("/insert")
    public String add(){
        return "userInfos/insert";
    }

    @PostMapping("/add")
    public String insert(@Valid UserInfos userInfos, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                model.addAttribute(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return "userInfos/insert";
        }
            usersService.insert(userInfos);
            return "redirect:/list";

    }
    @Transactional
    @PostMapping("/insertWithDel")
    public String xxx(UserInfos userInfos){
        usersService.insertWithDelete(userInfos);
        return "redirect:/list";
    }
}

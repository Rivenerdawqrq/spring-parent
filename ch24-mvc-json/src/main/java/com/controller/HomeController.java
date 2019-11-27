package com.controller;

import com.entity.UserInfos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/list")
    @ResponseBody
    public UserInfos list() throws ParseException {

        UserInfos userInfos = new UserInfos();
        userInfos.setAddress("Sdsd");
        userInfos.setId(1);
        userInfos.setBirthday(new Date());
        return userInfos;
    }

    @RequestMapping("/aa")
    //@ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public UserInfos insert(@RequestBody UserInfos userInfos){
        UserInfos userInfos1 = new UserInfos();
        userInfos1.setName("sdsd");
        userInfos.setAddress("dsd");
        return userInfos1;
    }
    /**
     * 不加@RequestBody表示使用传统的数据绑定来绑定参数值,
     * 对应jsp中的insert2按钮的案例
     * @param empVO
     * @return
     */
    @RequestMapping("/insert2")
    @ResponseBody
    public UserInfos insert2( UserInfos userInfos) {
        System.out.println("-----debug: empVO = " + userInfos);
        UserInfos result = new UserInfos();
        result.setId(3);
        result.setName("受到收到");
        result.setBirthday(new Date());
        return result;
    }
}

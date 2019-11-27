package com.vo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelAttributeController {
    @ModelAttribute("abc")
    public UserInfoVo init(){
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setName("是错永不对，真永是真");
        return userInfoVo;
    }
    @GetMapping("/aad")
    public String view(UserInfoVo userInfoVo, Model model) {
        return "model";
    }
}

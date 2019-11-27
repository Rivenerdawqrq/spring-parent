package controller;

import entity.UserInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/formatter")
public class FormatterController {
    @GetMapping("/a")
    public ModelAndView receiveData(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        System.out.println("date = " + date);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("aaa",date);
        return modelAndView;
    }

    @GetMapping("/userInfo")
    public String receiveUser(@RequestParam("xxx")UserInfo userInfo){
        System.out.println("uuu---"+userInfo);
        return "test";
    }
}

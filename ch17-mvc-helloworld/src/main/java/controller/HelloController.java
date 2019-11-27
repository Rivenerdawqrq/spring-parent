package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
//    @RequestMapping("")
//    public static String hhh(){
//        System.out.println("ok----------------");
//        return "WEB-INF/aaa";
//    }

    @RequestMapping("/")
    public ModelAndView modelAndView(){
        System.out.println("--- 1111");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("WEB-INF/aaa");
        modelAndView.addObject("hhh","heduowei");
       return modelAndView;
    }

}

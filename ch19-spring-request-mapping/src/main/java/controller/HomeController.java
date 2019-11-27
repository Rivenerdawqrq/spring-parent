package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dept")
public class HomeController {
    @RequestMapping("/aaa")
    public String aaa(){
        System.out.println("2222 = " + 2222);
        return "second";
    }

    @RequestMapping("/**/aaa")
    public ModelAndView modelAndView(){
        System.out.println("aaa");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("second");
        return modelAndView;
    }
}

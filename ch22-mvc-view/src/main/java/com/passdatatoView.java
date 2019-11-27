package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
public class passdatatoView {
//    @GetMapping
//    public String test1(HttpSession session){
//        session.setAttribute("hhh","ssss");
//        return "redirect:one";
//    }
    @GetMapping("")
    public String test2(){
        return "aaa";
    }
    @GetMapping("/two")
    public String test3(){
        return "aaa";
    }

    @GetMapping("/one")
    public String test2(HttpSession session){
        session.setAttribute("hhh","ssss");
        return "aaa";
    }


    @GetMapping("/shan")
    public String test3(RedirectAttributes redirectAttributes){
        //闪存

        redirectAttributes.addFlashAttribute("aaa","aasd");
        return "redirect:one";
    }


}

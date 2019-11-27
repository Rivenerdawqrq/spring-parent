package controller;

import entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/one")
    public String test1(String abc,Integer a){//
        System.out.println(abc+(a));
        return "test";
    }

    @GetMapping("/two")
    public String test2(@RequestParam(value = "aaa",required = false,defaultValue = "2") int bbb ){
        System.out.println(bbb+22222);
        return "test";
    }
    @GetMapping("/three/{hhh}")
    public String test3( @PathVariable("hhh") int hhh){
        System.out.println(hhh+"---");
        return "test";
    }
    @GetMapping("/test")
    public String test4(UserInfo userInfo){
        System.out.println("userInfo = " + userInfo);
        return "test";
    }

    @GetMapping("")
    public String test5(){
        return "test";
    }
}

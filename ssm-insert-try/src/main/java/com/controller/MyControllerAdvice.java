package com.controller;

import com.formatter.DeptFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyControllerAdvice {
    @InitBinder
    public void xxx(WebDataBinder dataBinder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        dataBinder.addCustomFormatter(dateFormatter);
    }
}

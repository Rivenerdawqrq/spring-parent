package com.formatter;

import com.entity.Dept;
import com.entity.UserInfos;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.ParseException;
import java.util.Locale;


public class DeptFormatter implements Formatter<UserInfos> {

    @Override
    public UserInfos parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(UserInfos userInfos, Locale locale) {
        return userInfos.toString();
    }
}

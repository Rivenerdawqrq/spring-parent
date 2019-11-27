package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

//PropertySource注解可以重复出现
//此注解只需要放在任意一个被sprin@Component
@PropertySource("classpath:db.properties")
public class DbConfig {
    @Autowired
    private Environment environment;
//    @Value("${pwd:mypwd}")
//    private String pwd;

    public String getPwd() {
//        return pwd;
        return environment.getProperty("pwd");
    }
}

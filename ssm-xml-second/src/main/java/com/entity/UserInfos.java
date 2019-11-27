package com.entity;

import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class UserInfos {
    private Integer id;
    @Size(max = 9,min = 1,message = "最多9，最小1")
    private String name;
    @Past(message = "你咋还穿越了呢")
    private Date birthday;
}

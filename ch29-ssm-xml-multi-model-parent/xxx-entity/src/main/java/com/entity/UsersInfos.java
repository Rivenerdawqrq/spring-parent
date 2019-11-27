package com.entity;

import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class UsersInfos {
    private Integer id;
    @Size(min = 1,max = 10, message = "最大为10")
    private String name;
    @Past(message = "咋还穿越了？")
    private Date birthday;
}

package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class UserInfos {
    private Integer id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}

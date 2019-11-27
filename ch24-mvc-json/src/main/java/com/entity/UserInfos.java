package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserInfos {
//    @MyCheck(message = "最大为100，最小为1,不能为空")
    private Integer id;
//    @Size(max = 5,min = 1,message = "最小为1，最大为5")
//    @Pattern(regexp = "lhj",message = "需为lhj")
    private String name;
//    @Email(message = "邮箱格式不正确")
    private String address;
//    @Past(message = "咋你还穿越了？") //必须为过去的日期
    private Date birthday;
//    @Max(value = 100000,message = "不能大于100000") //限制不大于这个数字
    private BigDecimal deposit;//存款

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "UserInfos{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", deposit=" + deposit +
                '}';
    }
}

package com.entity;

import java.math.BigDecimal;

public class UserInfo {
    private Integer id;
    private String username;
    private Integer gender;
    private BigDecimal salary;
    private Integer did;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", did=" + did +
                '}';
    }
}

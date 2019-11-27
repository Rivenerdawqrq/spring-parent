package com.vo;

public class UserInfoVo {
    private int id;
    private String name;

    public UserInfoVo() {
    }

    public UserInfoVo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

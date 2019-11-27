package com;

/**
 * @author cj
 * @date 2019/10/23
 */
public class EmployeeServiceImpl {


    public int insert() {
        System.out.println("开始插入(insert)-----");
//        throw new RuntimeException("是什么玩意啊");
        return 1;
    }


    public int update() {
        System.out.println("开始更新(update)-----"); return 1;
    }
    public int add(int x,int y){

        System.out.println("add---------");
        return x + y;
    }
}

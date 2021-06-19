package com.oop.demon02;
//学生类
public class Student {

    //属性：字段
    String name;//默认null
    int age;//0

    //方法
    public void study(){
        System.out.println(this.name+"在学习！");
    }
    public void play(){
        System.out.println(this.name+"在玩儿！");
    }
}

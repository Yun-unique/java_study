package com.oop.demon03;

public class Pet {
    String name;
    int age;

    //无参构造
    public Pet() {
    }

    //有两个参数的构造方法
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shout(){
        System.out.println(this.name+"叫了一声");
    }
}

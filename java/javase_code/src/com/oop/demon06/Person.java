package com.oop.demon06;

//在Java中，所有的类，都默认直接或者间接继承Object
//Person 人  ：父类，基类
public class Person {

    public Person() {
        System.out.println("Person无参执行了");
    }

    protected String name = "张三";

    public void print(){
        System.out.println("Person");
    }

}

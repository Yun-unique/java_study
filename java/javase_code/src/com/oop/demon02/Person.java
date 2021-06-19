package com.oop.demon02;
/*
//alt+insert生成构造器
    构造器：
        1、和类名相同
        2、没有返回值
    作用：
        1、new本质在调用构造方法
        2、初始化对象的值
    注意：
        1、定义有参构造之后，如果想要使用无参构造，显示的定义一个无参的构造
 */
public class Person {
    //一个类即使什么都不写，它也会存在一个方法：构造方法

    String name;

    //实例化初始值
    //1.使用new关键字，本质是在调用构造器
    //2.用来初始化值
    public Person() {
    }

    //有参构造：一旦定义了有参构造，无参构造就必须显示定义
    public Person(String name) {
        this.name = name;
    }
}

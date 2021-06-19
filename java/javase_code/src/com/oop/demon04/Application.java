package com.oop.demon04;

/*
封装的作用：
    1、提高程序的安全性，保护数据
    2、隐藏代码的实现细节
    3、统一接口
    4、系统可维护性增加
 */
public class Application {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setId(10086);
        student1.setSex('男');
        System.out.println(student1.getName()+" "+ student1.getId()+" "+student1.getSex());

        student1.setAge(100);
        System.out.println(student1.getAge());
    }
}

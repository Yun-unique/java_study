package com.oop.demon10;

import java.util.Scanner;

//Static关键字
public class Student {

    private static int age;//静态变量,类变量
    private double score;//非静态变量

    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(Student.age);//静态变量可以直接使用:类名.属性(方法) 调用
        //System.out.println(Student.score);//编译报错
        System.out.println(s1.age);//
        System.out.println(s1.score);

        Student.go();
    }

}

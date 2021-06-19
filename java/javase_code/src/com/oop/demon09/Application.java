package com.oop.demon09;
/*
1、父类引用指向子类的对象
2、把子类转换成父类，向上转型；直接转
3、把父类转换成子类，向下转型；强制转换
4、多态的使用使方法的调用更加方便，减少重复的代码
 */

public class Application {
    public static void main(String[] args) {

        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student
        Object object = new Student();

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        System.out.println("=================================");

        Person person = new Student();

        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错！

        System.out.println("=================================");

        Student student = new Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错

        Person obj = new Student();
        Student student1 = (Student)obj;//高转低，强制类型转换
    }
}

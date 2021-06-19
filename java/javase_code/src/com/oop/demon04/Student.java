package com.oop.demon04;
//学生类
public class Student {

    //属性私有：private
    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;//年龄

    //无参构造
    public Student() {
    }

    //有参构造:四个参数
    public Student(String name, int id, char sex,int age) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
    }


    //向外提供一些可以操作这些属性的方法：get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0) {
            this.age = 3;
        }else{
            this.age = age;
        }
    }

    //学习
    //睡觉
}

package com.oop.demon01;

//引用传递：对象，本质还是值传递
public class Demon05 {
    public static void main(String[] args) {
        Person person = new Person();//实例化一个对象，属性为name
        System.out.println(person.name);//null

        Demon05.change(person);
        System.out.println(person.name);//云濛
    }

    public static void change(Person person){
        //person是一个对象：指向的-->Person person = new Person();这是一个具体的人，可以改变属性！
        person.name = "云濛";
    }
}
//定义了一个Person类，有一个属性：name
class Person{
    String name;//null
}

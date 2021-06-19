package com.oop.demon02;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {
        //类：抽象的，需要实例化才能使用
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类具体的实例！

        /*Student xiaoming = new Student();
        Student xiaohong = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        xiaoming.play();

        xiaohong.name = "小红";
        xiaohong.age = 3;

        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
        xiaohong.study();
    */
        //new实例化一个对象
        Person person = new Person("蒋云濛");

        System.out.println(person.name);
    }
}

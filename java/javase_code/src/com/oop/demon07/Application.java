package com.oop.demon07;
//方法重写
/*
重写：需要有继承关系，子类的方法和父类必须一致，方法体不同
子类重写父类的方法注意点：
    1、方法名必须相同
    2、参数列表必须相同
    3、修饰符：范围可以扩大，但不能缩小：public>protected>default>private
    4、抛出的异常：范围，可以被缩小，但不能被扩大：ClassNotFoundException<Exception
为什么需要重写？
    1、父类的功能，子类不一定需要，或者不一定满足
 */
//静态方法和非静态方法区别很大
public class Application {
    public static void main(String[] args) {
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();

        //父类的引用指向子类
        B b = new A();
        b.test();
    }
}

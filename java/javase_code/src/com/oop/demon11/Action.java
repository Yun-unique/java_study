package com.oop.demon11;

//抽象类：abstract修饰   类继承，extends：是单继承的    （接口可以多继承）
public abstract class Action {

    //一种约束~具体的需要其它来实现！
    //abstract,抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();

    //1、不能new这个抽象类，只能靠子类去实现它：约束！
    //2、抽象类中可以写普通方法
    //3、抽象方法必须在抽象类中
}

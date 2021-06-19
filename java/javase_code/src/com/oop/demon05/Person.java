package com.oop.demon05;

//在Java中，所有的类，都默认直接或者间接继承Object
//Person 人  ：父类，基类
public class Person {

    private int money = 10_0000_0000;

    public void say(){
        System.out.println("说了一句话！");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

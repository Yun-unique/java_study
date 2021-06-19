package com.oop.demon01;

public class Demon03 {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要一致
        Demon03 demon03 = new Demon03();//非静态方法的调用要先实例化类
        int add = demon03.add(1,2);
        System.out.println(add);
    }

    public int add(int a,int b){
        return a+b;
    }
}

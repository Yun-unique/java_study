package com.grammar.运算符;

public class Demon04 {
    public static void main(String[] args) {
        //++ -- 自增、自减   一元运算符

        int a=3;

        int b=a++;//先将a的值赋给b，a再自增
        //a=a+1;
        System.out.println(b);
        System.out.println(a);

        int c=++a;//a先自增，再将值赋给c

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算   有许多运算，需要使用一些工具类来进行操作
        double pow=Math.pow(2,3);
        System.out.println(pow);
    }
}

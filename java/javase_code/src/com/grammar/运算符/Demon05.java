package com.grammar.运算符;

//逻辑运算符
public class Demon05 {
    public static void main(String[] args) {
        //与（and）  或（or） 非（取反）
        boolean a=true;
        boolean b=false;

        System.out.println("a && b:"+(a&&b));
        System.out.println("a || b:"+(a||b));
        System.out.println("！(a && b):"+!(a&&b));

        //短路运算
        int c=5;
        boolean d=(c<4)&&(c++<4);  //c<4  d已经为false了，后面的不再执行，短路
        System.out.println(d);
        System.out.println(c);
    }
}


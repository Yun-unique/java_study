package com.grammar.运算符;

public class Demon02 {
    public static void main(String[] args) {
        long a=131115325141L;
        int b=123;
        short c=10;
        byte d=8;

        System.out.println(a+b+c+d);//输出Long
        System.out.println(b+c+d);//输出int
        System.out.println(c+d);//输出int
        //System.out.println((String)(c+d));
        /*
        1、算数运算中有long类型数据，结果返回long类型
        2、算数运算中其他类型数据运算，返回int类型
        3、运算中大类型数据转小类型数据为强制类型转换，小类型数据转大类型数据为自动类型转换
         */
    }
}

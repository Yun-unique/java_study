package com.常用类.八种包装类.integer;
/*
String int Integer之间互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //String-->int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1+1);//101

        //int-->String
        String s2 = i1+"";//"100"字符串
        System.out.println(s2+1);//"1001"字符串
       /* String s2a = String.valueOf(i1);
        System.out.println(s2a);//"100"字符串*/

        //int-->Integer     自动装箱
        Integer x = 100;

        //Integer-->int     自动拆箱
        int y = x;

        //String-->Integer
        Integer integer = Integer.valueOf("123");
        //Integer-->String
        String s3 = String.valueOf(integer);
    }
}

package com.常用类.String;
/*
分析以下程序创建了几个对象
 */
public class StringTest03 {
    public static void main(String[] args) {
        /*
        一共三个对象：
            方法区字符串常量池中有一个："hello"
            堆内存中有两个String对象
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}

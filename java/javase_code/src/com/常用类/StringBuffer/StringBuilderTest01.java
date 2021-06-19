package com.常用类.StringBuffer;
/*
java.lang.StringBuilder
StringBuffer和StringBuilder的区别:
    StringBuffer中的方法都有：synchronized关键字修饰。表示StringBuffer在多线程环境下运行是安全的。
    StringBuilder中的方法都没有：synchronized关键字修饰。表示StringBuilder在多线程环境下运行是不安全的。

    StringBuffer是多线程安全的
    StringBuilder是非多线程安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //使用StringBuilder也是可以完成字符串的拼接操作
        //初始化容量也是16的byte数组
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append("hello");
        stringBuilder.append("kitty");
        System.out.println(stringBuilder);
    }
}

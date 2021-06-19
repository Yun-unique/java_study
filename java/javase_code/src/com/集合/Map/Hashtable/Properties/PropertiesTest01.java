package com.集合.Map.Hashtable.Properties;

import java.util.Properties;

/*
* Properties继承Hashtable
*
* 目前只需要掌握Properties属性类对象的相关方法即可。
* Properties是一个Map集合，继承Hashtable，Properties的key和value都是“String”类型
*Properties被称为属性类对象
* */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();
        //需要掌握Properties的两个方法，一个存，一个取。
        //存，setProperty
        pro.setProperty("111","张三");
        pro.setProperty("222","李四");
        pro.setProperty("333","王五");
        pro.setProperty("444","赵六");
        //取，通过key获取value
        String s1 = pro.getProperty("111");
        String s2 = pro.getProperty("222");
        String s3 = pro.getProperty("333");
        String s4 = pro.getProperty("444");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

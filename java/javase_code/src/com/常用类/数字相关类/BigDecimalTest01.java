package com.常用类.数字相关类;

import java.math.BigDecimal;

/*
1、BigDecimal    属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
这是SUN公司提供的一个类，专门用于财务软件中

2、处理财务等精度需求很大的数据就需要使用BigDecimal类型，在java.math包下
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);//高精度的数据

        //v1+v2;不能直接使用+求和，v1和v2都是引用，需要调方法
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3.toString());
    }
}

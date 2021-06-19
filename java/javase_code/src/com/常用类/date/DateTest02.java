package com.常用类.date;

import org.w3c.dom.ls.LSOutput;

/*
获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数
1秒 = 1000毫米
可以用来统计程序执行耗费的时间

简单总结以下System类的相关属性和方法：
    System.out  【out是System类的静态变量】
    System.out.println()    【println()方法不是System类的，是PrintStream类的方法】
    System.gc()     【建议启动垃圾回收器】
    System.currentTimeMills()   【取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数】
    System.exit(0)  【退出JVM】
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1618901107214

        //统计一个方法执行耗时
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长为："+(end-begin)+"毫秒");
    }

    //需求：统计一个方法执行所耗费的时长
    public static void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i = "+i);
        }
    }
}

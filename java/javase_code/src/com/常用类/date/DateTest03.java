package com.常用类.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //这个时间是什么时间？
        //1970-01-01 00:00:00 001
        //注意：带参数是1个毫秒，从1970-01-01 00:00:00 000开始加,不带参数获取当前系统时间
        Date time = new Date(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        //北京是东8区，差8个小时
        System.out.println(strTime);//1970-01-01 08:00:00 001

        //获取昨天此时的时间
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);//2021-04-19 15:08:28 416

        //获取去年的今天的时间
    }
}


package com.常用类.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中对日期的处理:
    1、怎么获取系统当前时间
    2、Date-->String 日期格式化为自己想要的类型
    3、String-->Date
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间（精确到毫秒的系统当前时间）
        //直接调用无参构造方法就行
        Date nowTime = new Date();
        System.out.println(nowTime.toString());//Mon Apr 19 16:54:17 CST 2021
        //System.out.println(nowTime.toString());Date类中重写了toString()方法

        //日期可以格式化吗？
        //将日期类型Date，按照指定的格式进行转换：Date--转换成具有一定格式的日期字符串-->String
        //SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        /*
        yyyy    年(4位)
        MM      月(2位)
        dd      日
        HH      时
        mm      分
        ss      秒
        SSS     毫秒（毫秒3位，最高999，1000毫秒代表1秒）
        注意：在日期格式中，除了y,M,d,H,m,s,S这些字符不能随便写之外，剩下的符号格式自己随意组织。
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);//2021-04-19 17:07:00 199*/

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String nowTimeStr1 = sdf1.format(nowTime);
        System.out.println(nowTimeStr1);//19/04/2021

        SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        String nowTimeStr2 = sdf2.format(nowTime);
        System.out.println(nowTimeStr2);//21/04/19 17:10:54

        //假设现在有一个日期字符串String，怎么转换成Date类型？
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf3 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        //注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然会出现异常：java.text.ParseException
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:m:ss SSS");
        Date dateTime = sdf3.parse(time);
        System.out.println(dateTime);//Fri Aug 08 08:08:08 CST 2008
    }
}

package com.常用类.数字相关类;

import java.text.DecimalFormat;

/*
关于数字的格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的一个类
        //DecimalFormat df = new DecimalFormat("数字格式");

        /*
        数字格式有哪些？
            #   代表任意数字
            ,   代表千分位
            .   代表小数点
            0   代表不够时补零

            ###,###.##  表示：加入千分位，保留2个小数
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.5678);
        System.out.println(s);//"1,234.57"

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(1234.56);
        System.out.println(s2);//"1,234.5600
    }
}

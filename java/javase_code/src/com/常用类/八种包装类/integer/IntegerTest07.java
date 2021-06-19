package com.常用类.八种包装类.integer;
/*
包装类常用方法：
(***)1、static int parseInt(String s)   静态方法，传参String,返回int
     2、static String toBinaryString(int i) 静态的，将十进制转换成二进制字符串
     3、static String toHexString(int i)    静态的，将十进制转换成十六进制字符串
     4、static String toOctalString(int i)  静态的，将十进制转换成八进制字符串
     5、static Integer valueOf(int i) 静态的：int-->Integer
     6、static Integer valueOf(String s)  静态的：String-->Integer
 */
public class IntegerTest07 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1000);
        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("123");
        System.out.println(a);
        //编译的时候没问题，一切符合java语法，运行时会不会出现问题呢？
        //不是一个“数字”，可以包装成Integer吗？不能。运行时出现异常
        //java.lang.NumberFormatException
        /*Integer b = new Integer("中文");
        System.out.println(b);*/

        //重点方法；
        //static int parseInt(String s)
        //静态方法，传参String,返回int
        //应用场景：网页上文本框中输入的100实际上是"100"字符串。后台数据库中要求存储100数字，此时java程序需要将"100"转换成100
        int reValue = Integer.parseInt("123");//String-转换->int
        //int reValue = Integer.parseInt("中文");NumberFormatException数字格式化异常
        System.out.println(reValue+100);

        //照葫芦画瓢
        double reValue2 = Double.parseDouble("3.14");
        System.out.println(reValue2+1.21);

        //--------------------以下内容作为了解----------------------
        //static String toBinaryString(int i)
        //静态的，将十进制转换成二进制字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);//"11"二进制字符串

        //static String toHexString(int i)
        //静态的，将十进制转换成十六进制字符串
        //十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12
        String hexString = Integer.toHexString(16);
        System.out.println(hexString);//10

        //static String toOctalString(int i)
        //静态的，将十进制转换成八进制字符串
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);
        
        //valueOf方法作为了解
        //static Integer valueOf(int i) 静态的：int-->Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //static Integer valueOf(String s)  静态的：String-->Integer
        Integer i2 = Integer.valueOf("3");
        System.out.println(i2);
    }
}

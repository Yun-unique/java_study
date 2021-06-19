package com.常用类.String;
/*

 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建（因为这个对象已经存在了）
        String s2 = "hello";
        //分析结果是true还是false
        //==号比较的是变量中保存的内存地址
        System.out.println(s1 == s2);//true

        String x = new String("xyz");
        String y = new String("xyz");
        //分析结果是true还是false
        System.out.println(x == y);//false

        //通过这个案例的学习，说明字符串对象之间的比较不能使用“==”
        //“==”不保险。应该调用String类的equals方法
        //String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法
        System.out.println(x.equals(y));//true

        String k = new String("testString");
        //"testString"这个字符串可以后面加"."
        //因为"testString"是一个String字符串对象，只要是对象就能调用字符串方法
        System.out.println("testString".equals(k));//建议使用这种方式，可以避免空指针异常
        System.out.println(k.equals("testString"));//k如果为空，则会出现空指针异常
    }
}

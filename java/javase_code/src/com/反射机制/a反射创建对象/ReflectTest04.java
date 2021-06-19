package com.反射机制.a反射创建对象;
/*
* 研究一下：Class.forName()发生了什么？
*   结论：Class.forName()这个方法的执行会导致：类加载
*   重点：
*       如果只是希望一个类的静态代码块执行，其它代码一律不执行，
*       可以使用：Class.forName("完整类名（加包名）");
*       这个方法的执行会导致类加载，类加载时，静态代码块执行。
* 提示：
*   后面JDBC（连接数据库）技术需要使用
* */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //Class.forName()这个方法的执行会导致：类加载
            Class.forName("com.反射机制.a反射创建对象.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //静态代码块在类加载的时候执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}

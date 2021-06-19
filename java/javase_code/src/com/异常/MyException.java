package com.异常;
/*
1、SUN提供的JDK内置的异常肯定是不够用的。在实际开发中，有很多业务，这些业务出现异常
之后，JDK中都是没有的，和业务挂钩的。那么就需要程序员根据实际需要自己定义异常类。
2、Java中如何定义异常类
    两步：
        第一步：编写一个类继承Exception或者RuntimeException.
        第二步：提供两个构造方法，一个无参数的，一个带有String参数的
 */
public class MyException extends Exception{//编译时异常

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

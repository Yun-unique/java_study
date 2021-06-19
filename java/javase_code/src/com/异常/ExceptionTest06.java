package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
处理异常的第一种方式：
    在方法声明的位置上使用throws关键字抛出异常，谁调用我这个方法，我就抛给谁。抛给调用者来处理。
    处理异常的态度：上报
处理异常的第二种方式：
    使用try...catch语句对异常进行捕捉
    这个异常不会上报，自己把这个异常处理了。
    异常到此为止，不再上抛了。

注意：
    只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行
    另外需要注意，try语句块中的某一行出现异常，该行后面的语句不会执行
 */
public class ExceptionTest06 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给JVM
    //JVM只有终止程序运行
    //异常处理机制的作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。
    //所以一般main方法中的异常建议使用try...catch进行捕捉。main方法就不要继续上抛了。
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            //如果以上代码出现异常，直接进入catch语句块中执行
            System.out.println("hello");
        } catch (FileNotFoundException e) {//这个e引用保存的内存地址是那个new出来的异常对象的内存地址
            System.out.println("文件不存在，或路径错误");
            System.out.println(e);
        }
        //try...catch把异常抓住之后，这里的代码会继续执行
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    //可以抛FileNotFoundException的父对象IOException,throws后面也可以抛出多个异常，用逗号隔开
    //但是必须对异常进行处理（直接throws抛给上一级，或者自己使用try...catch捕获）
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //创建一个输入流对象，该流指向一个文件
        //一个方法当中的代码出现异常之后，如果上报的话，此方法结束
        new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\MarkDown语法.md");
        //new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
        System.out.println("如果以上代码出现异常，这里会执行吗？");
    }
}

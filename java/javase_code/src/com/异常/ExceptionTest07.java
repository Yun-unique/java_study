package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch深入
    1、catch后面的小括号中的异常类型可以是具体的异常类型，也可以是该类型的父类型
    2、catch可以抓取多个异常。建议catch的时候，精确的一个一个处理，这样有利于程序的调试
    3、catch写多个的时候，从上到下，必须遵守从小到大的原则

在以后开发中，处理编译时异常，应该上报还是捕捉？
    如果希望调用者知道，选择throws上抛
    其它情况使用捕捉的方式
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            //FileInputStream fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\MarkDown语法.md");
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
        System.out.println("hello");

        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
            //读文件
            fis.read();
        } catch (IOException e) {//多态：IOException e = new FileNotFoundException
            System.out.println("文件不存在！");
        }

        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
            //读文件
            fis.read();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在！");
        }catch (IOException e) {//多态：IOException e = new FileNotFoundException
            System.out.println("读文件错误！");
        }

        //JDK8新特性：支持catch捕捉异常用“|”符号
        try {
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件不存在?数学格式异常？空指针异常？都有可能");
        }
    }
}

package com.oop.demon01;

import java.io.IOError;
import java.io.IOException;

//Demon01类
public class Demon01 {

    //main方法：程序入口
    public static void main(String[] args) {

    }
    /*
    方法的声明定义：
        修饰符    返回值类型   方法名(...){
            //方法体
            return 返回值;
        }

     */
    //return 结束方法，返回一个结果
    public String sayHello(){
        return "Hello,world!";
    }

    public void print(){
        return;
    }

    public int max(int a,int b){
        return a>b?a:b;//三元运算符
    }

    //抛出异常
    public void readFile(String file) throws IOException{

    }
}

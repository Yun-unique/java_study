package com.oop.demon01;
//值传递
public class Demon04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1
        Demon04.change(a);
        System.out.println(a);//1
    }

    //返回值为空
    public static void change(int a){
        a = 10;
    }
}

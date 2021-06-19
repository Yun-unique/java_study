package com.多线程.a创建线程;
/*
* 采用匿名内部类的方式
*   new ([匿名类] implements) Runnable{
*           @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("t线程-->"+i);
                }
            }}
* */
public class ThreadTest04 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类的方式
        //这是通过一个没有名字的类，new出来的对象
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("t线程-->"+i);
                }
            }
        });
        //启动线程
        thread.start();
        for (int i = 0;i < 100;i++){
            System.out.println("main线程-->"+i);
        }
    }
}

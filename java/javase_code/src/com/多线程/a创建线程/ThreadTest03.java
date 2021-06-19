package com.多线程.a创建线程;
/*
* 实现线程的第二种方式，编写一个类实现java.lang.Runnable接口，实现run()方法
* */
public class ThreadTest03 {
    public static void main(String[] args) {
        /*//创建一个可运行的对象
        MyRunnable runnable = new MyRunnable();
        //将可运行的对象封装程一个线程对象
        Thread thread = new Thread(runnable);*/
        //合并代码
        Thread thread = new Thread(new MyRunnable());
        //启动线程
        thread.start();
        for (int i = 0;i < 1000;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 1000;i++){
            System.out.println("分支线程-->"+i);
        }
    }
}

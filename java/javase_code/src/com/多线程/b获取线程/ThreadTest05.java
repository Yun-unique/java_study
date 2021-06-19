package com.多线程.b获取线程;
/*
* 1、怎么获取当前线程对象？
*
* 2、获取线程对象的名字
*       String name = 线程对象.getName();
*
* 3、修改线程对象的名字
*       线程对象.setName("线程名字");
* 4、当线程没有设置名字的时候，默认的名字有什么规律
*       Thread-0
*       Thread-1
*       Thread-2
*       ......
* */
public class ThreadTest05 {
    public static void main(String[] args) {
        //currentThread就是当前线程对象
        //这个代码出现在main方法当中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//main

        //创建线程对象
        MyThread myThread = new MyThread();
        //设置线程的名字
        myThread.setName("java");
        //获取线程的名字
        String myThreadName = myThread.getName();
        System.out.println(myThreadName);//没有设置名字默认Thread-0

        MyThread myThread1 = new MyThread();
        String myThreadName1 = myThread1.getName();
        System.out.println(myThreadName1);//T没有设置名字默认Thread-1
        //启动线程
        myThread.start();
        for (int i = 0; i < 100;i++){
            System.out.println(currentThread.getName()+"线程-->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            //currentThread就是当前线程对象。
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+"线程-->"+i);
        }
    }
}
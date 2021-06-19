package com.多线程.c线程sleep方法;
/*
 * 关于Thread.sleep()方法的一个面试题：
 * */
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread mt = new MyThread();//多态：父类型引用指向子类型对象
        mt.setName("t");
        mt.start();
        //调用sleep方法
        try {
            //问题：这行代码会让线程t进入休眠状态吗？
            mt.sleep(1000*5);//在执行的时候还是会转换成：Thread.sleep(1000*5);
            //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
            //这行代码出现在main方法中，main线程睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后这里才会执行
        System.out.println("hello");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

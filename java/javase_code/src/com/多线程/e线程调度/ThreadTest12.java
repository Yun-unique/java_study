package com.多线程.e线程调度;
/*
* 让位，当前线程暂停，让给其他线程。
* 静态方法：Thread.yield();
* */
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("T");
        t.start();
        for (int i = 0; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            //每100个让位一次
            if (i % 100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

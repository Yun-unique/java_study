package com.多线程.e线程调度;
/*
* 线程合并
* */
public class ThreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable3());
        t.setName("T");
        t.start();
        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程受阻塞，t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

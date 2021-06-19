package com.多线程.c线程sleep方法;
/*
* 终止线程睡眠：唤醒线程
*   注意：这个不是终断线程的执行，而是终断线程的睡眠
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.setName("T");
        t.start();

        //希望5秒之后，t线程醒来
        try {
            Thread.sleep(1000 *5 );//当前主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制）
        t.interrupt();
    }
}
class MyRunnable implements Runnable{

    //重点：run()方法当中的异常不能throws，只能try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->begin");
        //睡眠1年
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1年之后才会执行这里
        System.out.println(Thread.currentThread().getName()+"-->end");
    }
}
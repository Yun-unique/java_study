package com.多线程.e线程调度;
/*
* 了解：关于线程的优先级
*       void setPriority(int newPriority)	设置线程的优先级
*​		int getPriority()	获取线程优先级
*   最高优先级：10
*   最低优先级：1
*   默认优先级：5
* */
public class ThreadTest11 {
    public static void main(String[] args) {
        //设置主线程的优先级为1
        Thread.currentThread().setPriority(1);

       /* System.out.println("最高优先级："+Thread.MAX_PRIORITY);//10
        System.out.println("最低优先级："+Thread.MIN_PRIORITY);//1
        System.out.println("默认优先级："+Thread.NORM_PRIORITY);//5*/

       //获取当前线程对象
        //Thread currentThread = Thread.currentThread();
        //获取当前线程的优先级,main线程的默认优先级是：5
        //System.out.println(currentThread.getName()+"线程的默认优先级是："+currentThread.getPriority());

        Thread thread = new Thread(new MyRunnable());
        thread.setName("T");
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        //获取线程优先级
        //System.out.println(Thread.currentThread().getName()+"线程的默认优先级是："+Thread.currentThread().getPriority());
        //设置分支线程的优先级190
        Thread.currentThread().setPriority(10);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

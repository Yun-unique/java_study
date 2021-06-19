package com.多线程.d线程终止;
/*
* 怎么合理的终止一个线程的执行。这种方式是很常用的。
* */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable2 mr = new MyRunnable2();
        Thread thread = new Thread(mr);
        thread.setName("T");
        thread.start();
        //模拟5秒
        try {
            thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        mr.run = false;
    }
}
class MyRunnable2 implements Runnable{

    //打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //终止当前线程
                return;
            }
        }
    }
}

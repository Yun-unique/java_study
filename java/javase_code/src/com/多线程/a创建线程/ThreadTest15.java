package com.多线程.a创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 实现线程的第三种方式：
*   实现Callable接口
*   优点：可以拿到线程的返回结果
*   缺点：在获取线程的执行结果的时候（调用get方法），当前线程受阻塞，效率比较低。
* */
public class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步：创建一个“未来任务类”对象
        //参数非常重要，需要给一个Callable接口的实现对象。
        //匿名内部类
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call()方法就相当于run()方法。只不过这个有返回值。
                //线程执行一个任务，执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;//自动装箱（300结果变成Integer类型）
            }
        });

        //创建线程对象
        Thread t = new Thread(task);
        t.setName("t");
        //启动线程
        t.start();

        //这里是main方法，这是在主线程中。
        //在主线程中，怎么获取t线程的返回结果呢？
        //get()方法的执行会导致“当前线程阻塞”
        Object object = task.get();
        System.out.println("线程执行的结果："+object);

    }
}

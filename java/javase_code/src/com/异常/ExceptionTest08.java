package com.异常;
/*
异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        String msg = exception.getMessage();
    打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        //这里只是new了异常对象，但是没有将异常对象抛出。JVM会认为这是一个普通的Java对象
        NullPointerException e = new NullPointerException("空指针异常");
        //获取异常简单描述信息：这个信息实际上就是构造方法上面的String参数
        String message = e.getMessage();
        System.out.println(message);

        //打印异常追踪的堆栈信息
        //java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的
        e.printStackTrace();

        System.out.println("hello");
    }
}

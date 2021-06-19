package com.异常;

public class ExceptionTest14 {
    public static void main(String[] args) {
        //创建异常对象(只new了异常对象，并没有手动抛出)
        MyException myException = new MyException("用户名不能为空！");

        //打印异常堆栈信息
        myException.printStackTrace();

        //获取异常简单的描述信息
        String message = myException.getMessage();
        System.out.println(message);
    }
}

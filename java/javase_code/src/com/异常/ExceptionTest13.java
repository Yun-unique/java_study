package com.异常;
/*
final、finally、finalize有什么区别？
    final   关键字
        final修饰的类无法继承
        final修饰的方法无法覆盖
        final修饰的变量不能重新赋值

    finally 关键字
        和try一起联合使用，finally语句块中的代码必须执行

    finalize    标识符
        是一个Object类中方法名
        这个方法是由垃圾回收期GC负责调用的
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        //final是一个关键字，表示最终的。不变的
        final int i = 100;

        //finally也是一个关键字。和try联合使用，使用在异常处理机制中
        //在finally语句块中的代码是一定会执行的
        try{

        }finally {
            System.out.println("finally...");
        }

        //finalize()是Object类中的一个方法。作为方法名出现
        //所以finalize是标识符

    }
}

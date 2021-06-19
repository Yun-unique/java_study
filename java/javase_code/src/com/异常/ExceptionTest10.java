package com.异常;
/*
finally语句
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗？可以
            try不能单独使用
            try、finally可以联合使用
        以下代码的执行顺序：
            先执行try...
            再执行finally...
            最后执行return（return语句一执行，方法结束）
         */
        try{
            System.out.println("try...");
            return;
            //System.out.println("hello");没有机会运行，报错
        }finally {
            System.out.println("finally...");
        }

        //System.out.println("hello");没有机会运行，报错
    }
}

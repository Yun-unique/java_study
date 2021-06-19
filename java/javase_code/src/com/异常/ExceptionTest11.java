package com.异常;
/*
finally
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        try{
            System.out.println("try...");
            //退出JVM
            System.exit(0);//退出JVM之后，finally语句中的代码就不执行了
        }finally {
            System.out.println("finally...");
        }
    }
}

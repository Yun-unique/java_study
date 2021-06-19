package com.exception.demon01;

public class Test3 {
    public static void main(String[] args) {

        try {
            new Test3().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }

    }
    public void test(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();//主动的抛出异常，一般在方法中使用
        }
    }
}

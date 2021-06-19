package com.exception.demon01;

public class Demon01 {
    public static void main(String[] args) {
        //new Demon01().a();//递归陷入死循环
        //System.out.println(11/0);//除数不能为0
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}

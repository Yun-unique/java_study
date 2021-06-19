package com.grammar.方法;
//递归
public class Demon05 {
    public static void main(String[] args) {
        Demon05 demon05 = new Demon05();
        demon05.test();
    }
    public void test(){//栈溢出
        test();
    }
}

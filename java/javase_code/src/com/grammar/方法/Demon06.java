package com.grammar.方法;
//递归的使用（ 能不用就不用）
public class Demon06 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    //5!   5*4*3*2*1
    //求阶层
    public static int f(int n){
        if (n == 1) {
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}

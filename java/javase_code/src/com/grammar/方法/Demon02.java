package com.grammar.方法;

public class Demon02 {
    public static void main(String[] args) {
        double max=max(30.0,40.0);
        System.out.println(max);
    }

    //比大小
    public static int max(int num1,int num2){
        int result;
        if (num1==num2){
            System.out.println("哈哈");
            return 0;//可以终止方法
        }
        if (num1>num2){
            result=num1;
        }else{
            result=num2;
        }
        return result;
    }
    //比大小
    /*
    方法重载规则：
        1、方法名称必须相同
        2、参数列表必须不同（个数不同、或类型不同，参数列表排序不同 ）
        3、方法的返回类型可以相同也可以不同
        4、仅仅返回类型不同不足以成为方法的重载
     */
    public static double max(double num1,double num2){
        double result;
        if (num1==num2){
            System.out.println("哈哈");
            return 0;//可以终止方法
        }
        if (num1>num2){
            result=num1;
        }else{
            result=num2;
        }
        return result;
    }
}

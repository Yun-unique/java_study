package com.grammar.方法;

//可变参数

public class Demon04 {
    public static void main(String[] args) {
        /*Demon04 demon04 = new Demon04();
        demon04.test(1,2,3,4);*/

        //调用可变参数的方法

        printMax(34,3,3,2,56,5);
        printMax(new double[]{1,2,3});
    }
    /*public void test(int... i){
        System.out.println(i[0]);
    }*/
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed");
            return;
        }

        double result=numbers[0];

        //排序
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("The max value is "+result);
    }
}

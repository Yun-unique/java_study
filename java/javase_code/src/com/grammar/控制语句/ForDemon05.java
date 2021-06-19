package com.grammar.控制语句;

public class ForDemon05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};//定义了一个数组

        for (int i = 0;i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------------------");

        //遍历数组的元素
        for(int x:numbers){//增强For循环
            System.out.println(x);
        }
    }
}

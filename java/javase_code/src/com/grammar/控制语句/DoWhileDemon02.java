package com.grammar.控制语句;

public class DoWhileDemon02 {
    public static void main(String[] args) {

        int a = 0;

        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("================================");

        do {
            System.out.println(a);
        }while (a<0);   //do...while循环至少将循环内容循环一次
    }
}

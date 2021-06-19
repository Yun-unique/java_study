package com.grammar.控制语句;

public class BreakDemon {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;//强制终止循环
            }
        }
    }
}

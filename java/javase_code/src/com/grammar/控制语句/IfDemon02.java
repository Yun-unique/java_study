package com.grammar.控制语句;

import java.util.Scanner;

public class IfDemon02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入分数：");
        int score = scanner.nextInt();
        if (score>=60){
            System.out.println("成绩合格！");
        }else{
            System.out.println("成绩不合格！");
        }

        scanner.close();
    }
}

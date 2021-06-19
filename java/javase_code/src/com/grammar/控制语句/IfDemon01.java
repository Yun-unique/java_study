package com.grammar.控制语句;

import java.util.Scanner;

public class IfDemon01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        if (s.equals("Hello")){
            System.out.println(s);
        }
        System.out.println("End");
        scanner.close();
    }
}

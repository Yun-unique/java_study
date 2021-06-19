package 实训.作业.作业1_控制台输出;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入节目：");
        String string1 = scanner.next();

        System.out.print("请输入收件人的姓名：");
        String string2 = scanner.next();

        System.out.print("请输入送件人的姓名：");
        String string3 = scanner.next();

        System.out.println("——*——*——*——*——*——*——*——*——*——*——");
        System.out.println("    节    日    祝     福");
        System.out.println(string2);
        System.out.println();
        System.out.println("       祝您 "+string1+" 快乐！");
        System.out.println();
        System.out.println("                       "+string3);
        System.out.println("——*——*——*——*——*——*——*——*——*——*——");

        scanner.close();
    }
}

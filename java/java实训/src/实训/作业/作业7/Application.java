package 实训.作业.作业7;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //创建群主
        GroupLeader groupLeader = new GroupLeader("张三",1000.0);
        //创建群成员
        GroupMembers groupMembers1 = new GroupMembers("李四",0.0);
        GroupMembers groupMembers2 = new GroupMembers("王五",0.0);
        GroupMembers groupMembers3 = new GroupMembers("赵六",0.0);
        System.out.println("========================================");
        groupLeader.show();
        groupMembers1.show();
        groupMembers2.show();
        groupMembers3.show();
        System.out.print("请输入发红包的金额：");
        int money = scanner.nextInt();
        System.out.print("请输入发红包的个数：");
        int num = scanner.nextInt();
        ArrayList<Double> arrayList = groupLeader.giveRedEnvelop(money, num);
        System.out.println("========================================");
        groupMembers1.grabRedEnvelop(arrayList);
        groupMembers2.grabRedEnvelop(arrayList);
        groupMembers3.grabRedEnvelop(arrayList);
        groupLeader.show();
        groupMembers1.show();
        groupMembers2.show();
        groupMembers3.show();
    }
}

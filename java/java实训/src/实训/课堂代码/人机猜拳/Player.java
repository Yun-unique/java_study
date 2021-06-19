package 实训.课堂代码.人机猜拳;

import java.util.Scanner;

public class Player {
    private String name;
    int count;
    static Scanner scanner = new Scanner(System.in);
    public Player() {
    }

    public Player(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int showFist(){
        System.out.print("请出拳：1.剪刀 2.石头 3.布(输入相应的数字)：");
        int flag = scanner.nextInt();
        switch (flag){
            case 1:
                System.out.println(this.name+"出拳：剪刀");
                break;
            case 2:
                System.out.println(this.name+"出拳：石头");
                break;
            case 3:
                System.out.println(this.name+"出拳：布");
                break;
            default:
                System.out.println("请输入规定的值！");
        }
        return flag;
    }

    public void showResult(String name){
        System.out.println(this.name+"\tVS\t"+name);
        System.out.println("对战次数：");
    }
}

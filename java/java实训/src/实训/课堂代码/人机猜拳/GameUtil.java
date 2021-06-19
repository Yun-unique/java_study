package 实训.课堂代码.人机猜拳;

import java.util.Scanner;

public class GameUtil {
    static Scanner scanner = new Scanner(System.in);
    Player user = new User();
    Player calculator = new Calculator();
    public void util() {
        System.out.println("----------------------------欢迎进入游戏世界----------------------------");
        System.out.println("\n\t\t\t\t\t\t\t*******************");
        System.out.println("\t\t\t\t\t\t\t**\t猜拳，开始\t**");
        System.out.println("\t\t\t\t\t\t\t*******************\n");
        System.out.println("游戏规则：1.剪刀 2.石头 3.布(剪刀>布>石头>剪刀)");
        System.out.print("请选择对方角色：(1：刘备 2：孙权 3：曹操)：");
        int flag = scanner.nextInt();
        switch (flag) {
            case 3:
                System.out.println("你选择了曹操对战");
                calculator.setName("曹操");
                break;
            case 2:
                System.out.println("你选择了孙权对战");
                calculator.setName("孙权");
                break;
            case 1:
                System.out.println("你选择了刘备对战");
                calculator.setName("刘备");
                break;
            default:
                System.out.println("请输入规定的值");
        }
        System.out.print("请输入你的姓名：");
        user.setName(scanner.next());
        System.out.println(user.getName()+" VS "+calculator.getName());
        System.out.print("要开始游戏吗？(y/n)：");
        String start = scanner.next();
        while (start.equals("y")) {
            user.showFist();
            calculator.showFist();
            win();
            System.out.println("要继续吗？(y/n):");
            start = scanner.next();
        }
    }
    public void win(){
        int userCount = user.getCount();
        int calculatorCount = calculator.getCount();
        if (user.showFist()==calculator.showFist()){
            System.out.println("和局");
        }else if((user.showFist()==1 && calculator.showFist()==2)
        || (user.showFist()==2&&calculator.showFist()==3)
        || (user.showFist()==3&&calculator.showFist()==1)) {
            System.out.println(calculator.getName()+"：哈哈你真苯，这都输！");
            calculatorCount++;
            calculator.setCount(calculatorCount);
        }else{
            System.out.println(user.getName()+"：好耶，我赢了！");
            userCount++;
            user.setCount(userCount);
        }
    }
}

package 实训.作业.作业4_双色球;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
数组：双色球中奖
red:6个 号码取值[1~33]   每个球的号码不能相同
blue:1个 号码取值[1~12]
*/
public class ArrayHomeWork4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int[] buys = new int[7];
    static int[] randoms = new int[7];
    //买球
    public static void buy(){
        System.out.println("请挑选红色球号码：");
        for (int i = 0; i < buys.length-1; i++) {
            System.out.print("请输入第" + (i + 1) + "个红球的号码：");
            int bollNumber = scanner.nextInt();
            if (bollNumber<=0 || bollNumber>33){
                System.out.println("请输入符合要求的号码！");
                i--;
                continue;
            }
            for (int j = 0; j <= i; j++){
                if (bollNumber == buys[j]){
                    System.out.println("号码有重复，请重新选择！");
                    i--;
                    break;
                }
            }
            buys[i] = bollNumber;
        }
        System.out.print("请挑选蓝色球号码：");
        int bollNumber = scanner.nextInt();
        while (bollNumber<=0 || bollNumber>12){
            System.out.println("请选择符合要求的号码！");
            System.out.print("请挑选蓝色球号码：");
            bollNumber = scanner.nextInt();
        }
        buys[buys.length-1] = bollNumber;
        Arrays.sort(buys,0,6);//左闭右开
        System.out.println("您挑选的双色球号码序列为："+ Arrays.toString(buys));
    }
    //随机生成各个球的号码
    public static void random(){
        for (int i = 0; i < randoms.length-1 ; i++) {
            randoms[i] = random.nextInt(33)+1;
            System.out.println("第"+(i+1)+"个红色球的中奖号码为："+randoms[i]);
        }
        Arrays.sort(randoms,0,6);
        randoms[randoms.length-1] = random.nextInt(12)+1;
        System.out.println("蓝色球中奖号码为："+randoms[randoms.length-1]);
        System.out.println("中奖号码为："+Arrays.toString(randoms));

    }
    //比较买入号码是否中奖
    public static void yes(){
        String flag = Arrays.equals(buys,randoms)?"恭喜您中奖了":"谢谢惠顾";
        System.out.println(flag);
    }

    public static void main(String[] args) {
        buy();
        random();
        yes();
    }
}

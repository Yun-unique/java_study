package 实训.作业.作业3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner scanner = new Scanner(System.in);
    static Random random =  new Random();
    //1、判断一个数的奇偶性
    public static void test1(){
        System.out.print("请输入一个整数：");
        int a = scanner.nextInt();
        if (a % 2 == 0){
            System.out.println("该数为偶数");
        }else {
            System.out.println("该数为奇数");
        }
    }
    //2、输入一个学生的考试成绩，判断级别，A，B，C，D，E，F
    public static void test2(){
        System.out.print("请输入该学生成绩：");
        double score = scanner.nextDouble();
        if (score > 100 || score < 0){
            System.out.println("输入的成绩不合法，请输入[0,100]区间的数！");
            return;
        }
        int grade = (int)score / 10;
        switch (grade){
            case 10:case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }
    }
    //3、手机设置指定数字的音乐（音乐名称就行）
    public static void test3(){
        System.out.print("输入的数字为：");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("播放音乐稻香");
                break;
            case 2:
                System.out.println("播放音乐告白气球");
                break;
            case 3:
                System.out.println("播放音乐听妈妈的话");
                break;
        }
    }
    //4、根据自己的小金库，确定今晚请客的菜肴
    public static void test4(){
        System.out.print("小金库剩余：");
        double money = scanner.nextDouble();
        if (money>=100){
            System.out.println("包食堂");
        }else if (money>50){
            System.out.println("吃麻辣烫");
        }else if (money>30){
            System.out.println("吃套餐");
        }else {
            System.out.println("喝西北风");
        }
    }
    //5、完成猜数字游戏
    public static void test5(){
        int number1 = random.nextInt(10);
        System.out.println("生成的随机数为："+number1);
        int number2 = number1<<2;
        System.out.println("加密后的数为："+number2);
        System.out.print("你猜加密前的数字为：");
        int number3 = scanner.nextInt();
        if (number2>>2==number3){
            System.out.println("猜对啦！");
        }else{
            System.out.println("猜错了！");
        }
    }
    //6、求10以内的奇数的阶乘
    public static void test6(){
        int factorial = 1;  //阶乘：factorial
        for (int i = 1; i <= 10 ; i++) {
            factorial *= i;
            if (i % 2 == 1){
                System.out.println(i+"的阶乘为："+factorial);
            }
        }
    }
    //7、完成空心菱形的打印
    public static void test7(){
        //实心菱形
        /*for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 9; k >= 2*i-1; k--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //空心菱形
        //上半部分
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                if (k == 1 || k == 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //下半部分
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 9; k >= 2*i-1;k--){
                if (k == 9 || k == 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //8、显示一个数字金字塔
    public static void test8(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                if (k == 1 || k == 2*i-1){
                    System.out.print(1);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 7; k >= 2*i-1;k--){
                if (k == 7 || k == 2*i-1){
                    System.out.print(1);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //9、打印九九乘法表
    public static void test9(){
        for (int i = 1; i <=9; i++){   //多少行？
            for (int j = 1; j <= i;j++){    //多少列？
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();*/
        test9();
    }
}

package 实训.作业.作业5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //1、数字炸弹（猜数字）
    public static void test1(){
        int randomNumber = random.nextInt(101);
        int minNum = 1;
        int maxNum = 100;
        System.out.println("随机生成的数为："+randomNumber);
        System.out.print("请输入一个"+minNum+"~"+maxNum+"之间的数：");
        int guessNumber = scanner.nextInt();
        while (guessNumber!=randomNumber){
            if (guessNumber<randomNumber){
                System.out.println("雷在["+guessNumber+","+maxNum+"]区间");
                minNum = guessNumber;
            }else {
                System.out.println("雷在[" + minNum + "," + guessNumber + "]区间");
                maxNum = guessNumber;
            }
            System.out.print("请输入一个"+minNum+"~"+maxNum+"之间的数：");
            guessNumber = scanner.nextInt();
        }
        System.out.println("哎呀，踩雷啦!");
    }
    //2.键盘输入三个数字并获得最大值
    public static void test2(){
        System.out.print("输入第一个数：");
        int number1 = scanner.nextInt();
        System.out.print("输入第二个数：");
        int number2 = scanner.nextInt();
        System.out.print("输入第三个数：");
        int number3 = scanner.nextInt();
        if (number1>=number2){
            if (number2>=number3){
                System.out.println("最大的数为："+number1);
            }else if (number3>=number1){
                System.out.println("最大的数为："+number3);
            }else {
                System.out.println("最大的数为："+number2);
            }
        }else if (number2>=number3){
            System.out.println("最大的数为："+number2);
        }else{
            System.out.println("最大的数为："+number3);
        }
    }
    //3、完成计算器的编写，可以累加、减、乘、除。
    public static void test3(){
        int id = 1;
        int plusNum;
        int minusNum;
        int multiplyNum;
        int divisionNum;
        System.out.println("简单计算器");
        System.out.println("*******************************");
        System.out.println("1、输入+进行加运算");
        System.out.println("2、输入-进行减运算");
        System.out.println("3、输入/进行除运算");
        System.out.println("4、输入*进行乘运算");
        System.out.println("5、输入任意整数");
        System.out.println("*******************************");
        System.out.print("请输入计算符号：");
        String flag = scanner.next();
        System.out.print("输入第"+id+"个数：");
        int number1 = scanner.nextInt();
        id++;
        System.out.print("输入第"+id+"个数：");
        int number2 = scanner.nextInt();
        id++;
        switch (flag) {
            case "+":
                plusNum = number1 + number2;
                System.out.println("相加结果=" + plusNum);
                while(flag.equals("+")) {
                    System.out.print("是否继续，输入true继续，输入false退出：");
                    boolean target = scanner.nextBoolean();
                    if (target) {
                        System.out.print("输入第"+id+"个数：");
                        int number = scanner.nextInt();
                        id++;
                        plusNum += number;
                        System.out.println("相加结果为=" + plusNum);
                    }else break;
                }
                break;
            case "-":
                minusNum = number1 - number2;
                System.out.println("相减结果=" + minusNum);
                while(flag.equals("-")) {
                    System.out.print("是否继续，输入true继续，输入false退出：");
                    boolean target = scanner.nextBoolean();
                    if (target) {
                        System.out.print("输入第"+id+"个数：");
                        int number = scanner.nextInt();
                        minusNum -= number;
                        System.out.println("相减结果为=" + minusNum);
                    } else break;
                }
                break;
            case "*":
                multiplyNum = number1 * number2;
                System.out.println("相乘结果=" + multiplyNum);
                while(flag.equals("*")) {
                    System.out.print("是否继续，输入true继续，输入false退出：");
                    boolean target = scanner.nextBoolean();
                    if (target) {
                        System.out.print("输入第"+id+"个数：");
                        int number = scanner.nextInt();
                        multiplyNum *= number;
                        System.out.println("相乘结果为=" + multiplyNum);
                    } else break;
                }
                break;
            case "/":
                divisionNum = number1 / number2;
                System.out.println("相除结果=" + divisionNum);
                while (flag.equals("/")) {
                    System.out.print("是否继续，输入true继续，输入false退出：");
                    boolean target = scanner.nextBoolean();
                    if (target) {
                        System.out.print("输入第"+id+"个数：");
                        int number = scanner.nextInt();
                        divisionNum /= number;
                        System.out.println("相除结果为=" + divisionNum);
                    } else break;
                }
                break;
            default:
                System.out.println("请输入正确的计算符号！");
    }

    }
    public static void main(String[] args) {
        /*test1();
        test2();*/
        test3();
    }
}
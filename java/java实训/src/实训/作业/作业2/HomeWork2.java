package 实训.作业.作业2;

import java.util.Scanner;

public class HomeWork2 {

    //1、简单计算器
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第1个数i1=");
        int i1 = scanner.nextInt();
        System.out.print("请输入第2个数i2=");
        int i2 = scanner.nextInt();
        //加
        System.out.println("i1+i2="+(i1+i2));
        //减
        System.out.println("i1-i2="+(i1-i2));
        //乘
        System.out.println("i1*i2="+(i1*i2));
        //除
        System.out.println("i1/i2="+(i1/i2));
        scanner.close();
    }

    //2、计算半径为5cm的圆的周长和面积
    public static void yuan(int r){
        final double PI = 3.14;
        System.out.println("当圆的半径r=："+r);
        System.out.println("圆的周长为："+2*r*PI);
        System.out.println("圆的面积为："+PI*r*r);
    }

    //3、使用三种方式实现两个变量的互换
    public static void huHuan(int a,int b){
        //第一种互换
        int temp;
        temp=a;
        a = b;
        b = temp;
        System.out.println("交换后第一个数为："+a+"第二个数为："+b);
    }

    //4、使用三元判断数字是否为“水仙花数”
    public static void shuiXianHua(int a){
        int ge = a % 10;
        int shi = (a / 10) % 10;
        int bai = a / 100;
        String  flag = a == ge*ge*ge+shi*shi*shi+bai*bai*bai?"是水仙花数":"不是水仙花数";
        System.out.println(flag);
    }

    //5、使用三元判断数字是奇数还是偶数？
    public static void jiOrOu(int a){
        String flag = a % 2 == 0?"是偶数":"是奇数";
        System.out.println(flag);
    }

    //6、实现密码的加密
    public static void jiMi(int a){
        System.out.println("密码加密后的数字为："+(a<<2));
    }

    //7、判断加密后两次密码的一致性？
    public static void yiZhiXing(int a){
        String flag = a == (a<<2)?"一致":"不一致";
        System.out.println(flag);
    }

    //8、使用byte类型计算118+128的值
    public static void jiSuan(){
        byte a = 118;
        byte b = 127;
        int i = b + a;
        System.out.println(i);
    }

    public static void main(String[] args) {
        //calc();
        yuan(5);
        huHuan(2,3);
        shuiXianHua(153);
        jiOrOu(11);
        jiMi(2);
        yiZhiXing(2);
        jiSuan();
    }
}

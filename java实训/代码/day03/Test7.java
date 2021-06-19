package day02;

import java.util.Scanner;

public class Test7 {
	/**
	 * 方法的定义：
	 * 格式
	 * public static void 标识符(){}
	 * 
	 * @param args
	 */
	//自定义的方法  相同的代码提取  调用
public static void suanshu() {
	int  a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	//% 
	c=a%3;
	System.out.println(c);
}
public static void suanshu2() {
	int a=153;
	int ge=153%10;//3
	int shiwei=153/10%10; //5
	int bai=153/100;//1
boolean flag=	a==ge*ge*ge+shiwei*shiwei*shiwei+bai*bai*bai;
	System.out.println(flag);
}
public static void add() {
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt(); //键盘的输入
	int b=scanner.nextInt(); //键盘的输入
	int c=a+b;
	System.out.println(c);
	
}
public static void main(String[] args) {
	//方法定义后不会被执行  调用后执行
	//调用的方法  名字（）
//	suanshu();
//	suanshu2();
	add();
}
}

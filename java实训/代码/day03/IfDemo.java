package day03;

import java.util.Scanner;

public class IfDemo {
	// 定义的变量----在所有的方法中使用
	static Scanner scanner = new Scanner(System.in);

	public static void test1() {
		/**
		 * 1. if(boolean){执行语句}
		 */
		System.out.println("number:");
		int c = scanner.nextInt();
		boolean flag = c > 0;
		if (flag) {
			System.out.println("执行");
		}
	}

	public static void test2() {
		/**
		 *2.  if(boolean){ 执行语句1; }else{ 执行语句2; }
		 */
		System.out.print("score:");
		double score = scanner.nextDouble();
		if (score > 90) {
			System.out.println("多给100元");
		} else {
			System.out.println("少给100");
		}
	}
	public static void test3() {
		/**
		 * 判断数字的奇数偶数
		 * if(boolean){ 执行语句1; }else{ 执行语句2; }
		 */
		System.out.print("number:");
		int number = scanner.nextInt();
		if (number % 2==1) {
			System.out.println("奇数");
		} else {
			System.out.println("偶数");
		}

	}
	public static void test4() {
		/**
		 * 
		 * if(boolean){ 
		 * 执行语句1; 
		 * }else if(boolean){ 执行语句2; }
		 * else{ 执行语句2; }
		 */
		System.out.print("money:");
		double money = scanner.nextDouble();
		if (money >10) {  //money>10
			System.out.println("包食堂");
		}else if(money>5) { //10>=money>5
			System.out.println("吃花荤菜");
		} else if(money>7) { //永远被执行 //10>=money>7
			System.out.println("食堂肉菜");
		}else if(money>3) {
			System.out.println("吃特价价--萝卜、外婆菜");
		}

	}
	public static void test5() {
		/**
		 * 
		 * 嵌套if ----条件
		 */
		int  number=scanner.nextInt();
//		if(number%3==0) {
//			System.out.println("被3整除的数");
//			if(number%2==0) {
//				System.out.println("被2整除的数");
//			}
//		}
		if(number%3==0 && number%2==0) {
			System.out.println("被3，2整除的数");
//			if(number%2==0) {
//				System.out.println("被2整除的数");
//			}
		}
		
		
	}

	public static void main(String[] args) {
		test5();
	}
}

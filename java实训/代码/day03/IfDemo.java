package day03;

import java.util.Scanner;

public class IfDemo {
	// ����ı���----�����еķ�����ʹ��
	static Scanner scanner = new Scanner(System.in);

	public static void test1() {
		/**
		 * 1. if(boolean){ִ�����}
		 */
		System.out.println("number:");
		int c = scanner.nextInt();
		boolean flag = c > 0;
		if (flag) {
			System.out.println("ִ��");
		}
	}

	public static void test2() {
		/**
		 *2.  if(boolean){ ִ�����1; }else{ ִ�����2; }
		 */
		System.out.print("score:");
		double score = scanner.nextDouble();
		if (score > 90) {
			System.out.println("���100Ԫ");
		} else {
			System.out.println("�ٸ�100");
		}
	}
	public static void test3() {
		/**
		 * �ж����ֵ�����ż��
		 * if(boolean){ ִ�����1; }else{ ִ�����2; }
		 */
		System.out.print("number:");
		int number = scanner.nextInt();
		if (number % 2==1) {
			System.out.println("����");
		} else {
			System.out.println("ż��");
		}

	}
	public static void test4() {
		/**
		 * 
		 * if(boolean){ 
		 * ִ�����1; 
		 * }else if(boolean){ ִ�����2; }
		 * else{ ִ�����2; }
		 */
		System.out.print("money:");
		double money = scanner.nextDouble();
		if (money >10) {  //money>10
			System.out.println("��ʳ��");
		}else if(money>5) { //10>=money>5
			System.out.println("�Ի����");
		} else if(money>7) { //��Զ��ִ�� //10>=money>7
			System.out.println("ʳ�����");
		}else if(money>3) {
			System.out.println("���ؼۼ�--�ܲ������Ų�");
		}

	}
	public static void test5() {
		/**
		 * 
		 * Ƕ��if ----����
		 */
		int  number=scanner.nextInt();
//		if(number%3==0) {
//			System.out.println("��3��������");
//			if(number%2==0) {
//				System.out.println("��2��������");
//			}
//		}
		if(number%3==0 && number%2==0) {
			System.out.println("��3��2��������");
//			if(number%2==0) {
//				System.out.println("��2��������");
//			}
		}
		
		
	}

	public static void main(String[] args) {
		test5();
	}
}

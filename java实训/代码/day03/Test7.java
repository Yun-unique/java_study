package day02;

import java.util.Scanner;

public class Test7 {
	/**
	 * �����Ķ��壺
	 * ��ʽ
	 * public static void ��ʶ��(){}
	 * 
	 * @param args
	 */
	//�Զ���ķ���  ��ͬ�Ĵ�����ȡ  ����
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
	int a=scanner.nextInt(); //���̵�����
	int b=scanner.nextInt(); //���̵�����
	int c=a+b;
	System.out.println(c);
	
}
public static void main(String[] args) {
	//��������󲻻ᱻִ��  ���ú�ִ��
	//���õķ���  ���֣���
//	suanshu();
//	suanshu2();
	add();
}
}

package day04;

import java.util.Arrays;

public class ArrayDemo {
	private static void test1() {
		//1.�ȶ�����������ʹ��  new
		int[] nt=new int[1];
		System.out.println(nt);
		//2.����������Arrays 
		//Arrays: �����������
		System.out.println(Arrays.toString(nt));

	}
	private static void test2() {
		//2.����ʱ��ֵ{}
		int[] nt={1,2,3,4,5};
		System.out.println(nt);
		//2.����������Arrays 
		//Arrays: �����������
		System.out.println(Arrays.toString(nt));

	}
	private static void test3() {
		//3.����ʱ��ֵ{}  ������ʹ��
		int[] nt=new int[]{11,21,31,41,51};
		System.out.println(nt);
		//2.����������Arrays 
		//Arrays: �����������
		System.out.println(Arrays.toString(nt));

	}
	private static void test4() {
		//4.��������
		int[] nt={11,21,31,41,51};
		//4.1 ȷ������ĳ��� �����ԣ�
		int  length=nt.length;
//		System.out.println(length);
		//4.2 ���� �±�  ��0��ʼ
//		System.out.println(nt[0]);//11
		//4.3 ��������
		//4.3.1 ʹ��forѭ������
//		for (int i = 0; i < nt.length; i++) {
//			System.out.println(nt[i]);
//		}
		//4.3.1 ʹ����ǿforѭ��
//		for(int value:nt) {
//			System.out.println(value);
//		}

	}
	private static void test5() {
		//5.�޸ķ�������
		int[] nt={11,21,31,41,51};
		//5.1 ȷ������ĳ��� �����ԣ�
		System.out.println(Arrays.toString(nt));
		nt[1]=13; //��21 �޸ĳ�13
		System.out.println(Arrays.toString(nt));
		
		}
	private static void test6() {
		//6.���������
		int[] nt={31,41,51,11,21};
		  Arrays.sort(nt);
		System.out.println(Arrays.toString(nt));
		
		//6.���������
			int[] nt1={31,41,51,11,21};
			 Arrays.sort(nt1,0,4); //�������еĲ�����������
			System.out.println(Arrays.toString(nt1));
				
	}

public static void main(String[] args) {
	//test1();  //[I@7852e922 �ڴ��ַ---��
//	test2();
//	test3();
//	test4();
//	test5();
	test6();
}
}

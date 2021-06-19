package day04;

import java.util.Arrays;

public class ArrayDemo {
	private static void test1() {
		//1.先定义容器，后使用  new
		int[] nt=new int[1];
		System.out.println(nt);
		//2.借助帮助类Arrays 
		//Arrays: 操作数组的类
		System.out.println(Arrays.toString(nt));

	}
	private static void test2() {
		//2.定义时赋值{}
		int[] nt={1,2,3,4,5};
		System.out.println(nt);
		//2.借助帮助类Arrays 
		//Arrays: 操作数组的类
		System.out.println(Arrays.toString(nt));

	}
	private static void test3() {
		//3.定义时赋值{}  不建议使用
		int[] nt=new int[]{11,21,31,41,51};
		System.out.println(nt);
		//2.借助帮助类Arrays 
		//Arrays: 操作数组的类
		System.out.println(Arrays.toString(nt));

	}
	private static void test4() {
		//4.访问数组
		int[] nt={11,21,31,41,51};
		//4.1 确定数组的长度 （属性）
		int  length=nt.length;
//		System.out.println(length);
		//4.2 索引 下标  从0开始
//		System.out.println(nt[0]);//11
		//4.3 遍历数组
		//4.3.1 使用for循环遍历
//		for (int i = 0; i < nt.length; i++) {
//			System.out.println(nt[i]);
//		}
		//4.3.1 使用增强for循环
//		for(int value:nt) {
//			System.out.println(value);
//		}

	}
	private static void test5() {
		//5.修改访问数组
		int[] nt={11,21,31,41,51};
		//5.1 确定数组的长度 （属性）
		System.out.println(Arrays.toString(nt));
		nt[1]=13; //将21 修改成13
		System.out.println(Arrays.toString(nt));
		
		}
	private static void test6() {
		//6.数组的排序
		int[] nt={31,41,51,11,21};
		  Arrays.sort(nt);
		System.out.println(Arrays.toString(nt));
		
		//6.数组的排序
			int[] nt1={31,41,51,11,21};
			 Arrays.sort(nt1,0,4); //对数组中的部分数据排序
			System.out.println(Arrays.toString(nt1));
				
	}

public static void main(String[] args) {
	//test1();  //[I@7852e922 内存地址---类
//	test2();
//	test3();
//	test4();
//	test5();
	test6();
}
}

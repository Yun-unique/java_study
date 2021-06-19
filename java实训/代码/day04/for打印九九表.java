 package day04;

public class ForDemo {
	private static void testfor() {
		/**
		 * 1.for(int i=0;i<10;i++){}
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}

	}
	private static void testWhile() {
		/**
		 * 1.格式:
		 * while(boolean){
		 * }
		 * 2.确定循环的跳出语句
		 * 3.变量的初始化和确定变量的使用范围
		 */
//		int i=10;
//		while(i<11) {
//			System.out.println("i="+i);
//			i++;
//		}
		int i=1; //1.初始化
		while(i<10) { //2.判断
			int j=1;
			while(j<10) {
				System.out.println("i="+i+" j="+j);
			 j++;
			}
			i++; //3.运算
		}

	}

	public static void main(String[] args) {
		testWhile();

	}

}

package day03;

public class ForDemo2 {
	/**
	 * 阶乘10
	 */
	public static void test1() {
		/**
		 * 1.确定循环，输出所有的数字
		 */
		int jie=1;
		int sum=0;
		for(int i=1;i<=5;i++) {
//			System.out.print(i+" ");
			jie*=i;
			sum+=jie;
			System.out.println(jie+" "+sum);			
		}	
	}
	public static void test2() {
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		for (int i = 0; i < 5; i++) {
////			System.out.println("*****");
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 1; i < 5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	public static void test3() {

		for (int i = 1; i < 10; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}		
	}
	public static void test4() {
		/**
		**
					****
					***
					**
					*
		 * 
		 */

		for (int i = 5; i >0; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	public static void test5() {
		/***
		 *      +++*
		 *      ++**
		 *      +***
		 *      ****
		 * 
		 * 
		 */

		for (int i = 5; i >=0; i--) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
	
	}
public static void main(String[] args) {
	test5();
}
}

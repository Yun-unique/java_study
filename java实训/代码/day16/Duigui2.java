package day16;

public class Duigui2 {
	// 递归和迭代
	public Duigui2() {
		int a = 10;
		// 1：3个月后每个月生一对兔子
		// 12 数学问题  （斐波那契)
		/**
		 *   f1        f2       f3=f1  4
		 *   1(小)     1(小)     2(1(大)+1(小))   
		 *   2(1+1)    3（1+2）
		 *   5(2+3)    8(3+5)
		 *   13(5+8)
		 * 
		 */
		
		int f1=1; int f2=1;
		System.out.println("f1\tf2");
		for (int i = 0; i < 12; i++) {
			System.out.println(f1+"\t"+f2);
//			  if(i%3==0) {
////				  System.out.println();
//			  }
			  f1=f1+f2;
			  f2=f1+f2;
		}

	}

	public static void main(String[] args) {
		new Duigui2();
	}
}

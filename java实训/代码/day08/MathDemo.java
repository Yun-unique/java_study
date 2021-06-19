package day08;

public class MathDemo {
	public MathDemo() {
		test4();
	}

	// 四舍五入方法
	private void test4() {
		long d1 = Math.round(5.5); // d1的值为6.0
		long d2 = Math.round(5.4); // d2的值为5.0
      System.out.println(d1+" "+d2);
	}

	// 返回小于等于参数最大的整数。
	private void test3() {
		double d1 = Math.floor(3.3); // d1的值为3.0
		double d2 = Math.floor(-3.3); // d2的值为‐4.0
		double d3 = Math.floor(5.1); // d3的值为 5.0
	}

	// 返回大于等于参数的最小的整数。
	private void test2() {
		double d1 = Math.ceil(3.3); // d1的值为 4.0
		double d2 = Math.ceil(-3.3); // d2的值为 ‐3.0
		double d3 = Math.ceil(5.1); // d3的值为 6.0

	}

	// 返回 double 值的绝对值
	private void test1() {
		double d1 = Math.abs(-5); // d1的值为5
		System.out.println(d1);
		double d2 = Math.abs(5); // d2的值为5
		System.out.println(d2);
		System.out.println(Math.min(1, 2));;
	System.out.println(Math.random());
	  //1-33    1<=x<34
	   int shu=(int)(Math.random()*33+1);
	   System.out.println(shu);
	   System.out.println(Math.pow(2,3));;
	
	}

	public static void main(String[] args) {
		new MathDemo();
//		System.out.println(Math.E);
//		System.out.println(Math.PI);
	}

}

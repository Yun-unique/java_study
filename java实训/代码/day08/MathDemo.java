package day08;

public class MathDemo {
	public MathDemo() {
		test4();
	}

	// �������뷽��
	private void test4() {
		long d1 = Math.round(5.5); // d1��ֵΪ6.0
		long d2 = Math.round(5.4); // d2��ֵΪ5.0
      System.out.println(d1+" "+d2);
	}

	// ����С�ڵ��ڲ�������������
	private void test3() {
		double d1 = Math.floor(3.3); // d1��ֵΪ3.0
		double d2 = Math.floor(-3.3); // d2��ֵΪ�\4.0
		double d3 = Math.floor(5.1); // d3��ֵΪ 5.0
	}

	// ���ش��ڵ��ڲ�������С��������
	private void test2() {
		double d1 = Math.ceil(3.3); // d1��ֵΪ 4.0
		double d2 = Math.ceil(-3.3); // d2��ֵΪ �\3.0
		double d3 = Math.ceil(5.1); // d3��ֵΪ 6.0

	}

	// ���� double ֵ�ľ���ֵ
	private void test1() {
		double d1 = Math.abs(-5); // d1��ֵΪ5
		System.out.println(d1);
		double d2 = Math.abs(5); // d2��ֵΪ5
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

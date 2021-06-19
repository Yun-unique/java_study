package day08;

public class Baozhuanglei {
	public Baozhuanglei() {
		// 构造函数是非静态的资源可以直接调用方法
		init1();
	}

	// int
	int a = 10;// 为基本默认数据类型

	private void init1() {
		Integer i = 10; // int的包装类 可以使用类调用对应的方法
		// 1.属性
		// Integer max = Integer.MAX_VALUE;
		// System.out.println(max);
		// int min = Integer.MIN_VALUE;
		// System.out.println(min);
		// int size=Integer.SIZE;
		// System.out.println(size);
		// 2.jdk 1.6 包装类自动转换成基本数据类型(拆箱)
		// Integer s1=12;
		// int s2=s1;
		// System.out.println(s2);
		// s2=11;
		// s1=s2;
		// System.out.println(s1);
		// 3.构造函数
		// 将基本数据类型转换成包装类
		// int s2 = 12;
		// Integer s3 = new Integer(12); // 装箱
		// String id = "122";
		// // 使用构造函数将字符串类型转换成integer
		// s3 = new Integer(id);
		// System.out.println(s3);
		// 4.方法
		//4.1 完成字符串转换成整数类型
		String id="1001";
		Integer id2=0;
		id2=new Integer(id); //4.1.1
		System.out.println(id2);
		id2=Integer.parseInt(id);//4.1.2
		System.out.println(id2);
		id2=Integer.valueOf(id);//4.1.3
		System.out.println(id2);
		//4.2.转换成基本数据类型
		Integer value=new Integer(12);
		byte a=value.byteValue();
		short a2=value.shortValue();
		long a3=value.longValue();
		float a4=value.floatValue();
		double a5=value.doubleValue();
		int value2=value;
		char a6=(char)value2;
		System.out.println("--------");
		//5.将整数类型转换成字符串：
		String val=Integer.toString(12);
		System.out.println(val);
		val=Integer.toString(12,2);
		System.out.println(val);
		val=Integer.toString(12,16);
		System.out.println(val);
		val=Integer.toString(12,7);
		System.out.println(val);
		

	}

	// byte
	// short
	// long
	// float
	// double
	// boolean
	// char
	// String--char类型的组合

	public static void main(String[] args) {
		new Baozhuanglei();// 调用构造函数
	}

}

package day08;

public class Baozhuanglei {
	public Baozhuanglei() {
		// 构造函数是非静态的资源可以直接调用方法
		init8();
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
		// 4.1 完成字符串转换成整数类型
		// String id="1001";
		// Integer id2=0;
		// id2=new Integer(id); //4.1.1
		// System.out.println(id2);
		// id2=Integer.parseInt(id);//4.1.2
		// System.out.println(id2);
		// id2=Integer.valueOf(id);//4.1.3
		// System.out.println(id2);
		// 4.2.转换成基本数据类型
		// Integer value=new Integer(12);
		// byte a=value.byteValue();
		// short a2=value.shortValue();
		// long a3=value.longValue();
		// float a4=value.floatValue();
		// double a5=value.doubleValue();
		// int value2=value;
		// char a6=(char)value2;
		// System.out.println("--------");
		// //5.将整数类型转换成字符串：
		// String val=Integer.toString(12);
		// System.out.println(val);
		// val=Integer.toString(12,2);
		// System.out.println(val);
		// val=Integer.toString(12,16);
		// System.out.println(val);
		// val=Integer.toString(12,7);
		// System.out.println(val);
		// 6.进制之间的转换
		int value = 12;
		// static String toBinaryString(int i)
		// 以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。
		String val = Integer.toBinaryString(value);
		System.out.println(val);
		// static String toHexString(int i)
		// 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。
		val = Integer.toHexString(value);
		System.out.println(val);

		// static String toOctalString(int i)
		// 以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式
		val = Integer.toOctalString(value);
		System.out.println(val);

	}

	// byte 二进制的表示形式
	private void init2() {
		byte b1 = 12;
		Byte b = new Byte(b1);
		b = new Byte("11");
	}

	// short
	private void init3() {
		short b1 = 12;
		Short b = new Short(b1);
		b = new Short("11");
	}

	// long
	private void init4() {
		Long b1 = 12L;
		Long b = new Long(b1);
		b = new Long("11");
	}

	// float
	private void init5() {
		Float b1 = 12F;
		Float b = new Float(b1);
		b = new Float("11");
	}

	// double
	private void init6() {
		int c = 12;
		double c1 = c;// 基本数据类型能完成自动类型转换
		Double b1 = c1;// 装箱不会完成自动类型转换
		// 只能同一种数据类型转换
		// Double b1=12.0;
		Double b = new Double(b1);
		b = new Double("11");
	}

	// boolean
	private void init7() {
      Boolean bool1=new Boolean(true);  //类的比较比较的是地址
      Boolean bool2=new Boolean("true");
      System.out.println(bool1==bool2);
      String s=Boolean.toString(bool1);
      System.out.println(s);
      
      
      
//      bool=new Boolean("1");
      
	}

	// char
	private void init8() {
		Character c='a';
		System.out.println(c.BYTES);
		String name="zhang";
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
	}
	// String--char类型的组合

	public static void main(String[] args) {
		new Baozhuanglei();// 调用构造函数
	}

}

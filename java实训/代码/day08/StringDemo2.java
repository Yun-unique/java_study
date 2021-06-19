package day08;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
	public StringDemo() {
		try {
			test9();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// 编码转换
	private void test9() throws Exception {
		String a = "张";
		// char as[]=a.toCharArray();
		// System.out.println(Arrays.toString(as));
		byte as[] = a.getBytes();
		System.out.println(Arrays.toString(as));
//		String s = new String(as, "iso-8859-1");
//		System.out.println(s);
		as[0]=12;
		String s = new String(as, "gbk");	
		System.out.println(s);
		
	}

	// 分割的方法
	private void test8() {
		// 创建字符串对象
		String s = "aa bb cc";
		String[] strArray = s.split(" "); // ["aa","bb","cc"]
		System.out.println(Arrays.toString(strArray));
		for (int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]); // aa bb cc }
		}
	}

	// 转换功能的方法
	private void test7() {
		// 创建字符串对象
		String s = "abcde";
		// char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		// byte[] getBytes ():把字符串转换为字节数组
		byte[] bytes = s.getBytes();
		for (int x = 0; x < bytes.length; x++) {
			System.out.println(bytes[x]);
		}
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

		// 替换字母c为大写C
		String str = "chuanxijiaoyu";
		String replace = str.replace("c", "C").replace("x", " X");
		System.out.println(replace);
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
	}

	// 获取功能的方法
	private void test6() {
		// 创建字符串对象
		String s = "helloworld";
		// int length():获取字符串的长度，其实也就是字符个数
		System.out.println(s.length());
		System.out.println("‐‐‐‐‐‐‐‐");
		// String concat (String str):
		// 将将指定的字符串连接到该字符串的末尾.
		s = "helloworld";
		String s2 = s.concat("**hello zhang");
		System.out.println(s2);//
		// char charAt(int index):获取指定索引处的字符
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("‐‐‐‐‐‐‐‐");
		// 获取str在字符串对象中第一次出现的索引,没有返回‐1
		// int indexOf(String str):

		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("h"));
		System.out.println(s.indexOf("ow"));
		System.out.println("‐‐‐‐‐‐‐‐");
		// 从start开始截取字符串到字符串结尾
		// String substring(int start):

		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		// System.out.println("‐‐‐‐‐‐‐‐");
		// // 从start到end截取字符串。含start，不含end。
		// // String substring(int start,int end):
		//
		System.out.println(s.substring(0, s.length()));
		System.out.println(s.substring(0, 1));
	}

	// 判断功能的方法
	private void test5() {
		// 创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		// boolean equals(Object obj):比较字符串的内容是否相同
		// 比较字符串中相同位置的字符
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		// 比较字符串的内容是否相同,忽略大小写
		// boolean equalsIgnoreCase(Stringstr):
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
	}

	// 构造函数
	private void test4() throws Exception {
		// 无参数构造
		String str = new String();
		System.out.println(str);
		// 通过字符数组构造
		char data[] = { 's', 'a', 'n' };// char--ASICC--byte
		String name = new String(data);
		System.out.println(name);
		// 通过字节数组构造
		byte bytes[] = { 97, 98, 99 };
		name = new String(bytes, "utf-8");
		System.out.println(name);

	}

	// 3. "abc" 等效于 char[] data={ 'a' , 'b' , 'c' }
	private void test3() {
		String name = "san";
		char data[] = { 's', 'a', 'n' };
		String name2 = new String(data);
		// 字符串的底层都是靠字符数组实现的
		// 操作字符串实际操作的初始字符数组
	}

	// 2. 因为String对象是不可变的，所以它们可以被共享。
	private void test2() {
		String name = "zhangsan";
		String name2 = "zhangsan";
		// 内存中的常量池有zhangsan一个对象
		System.out.println(name == name2);
		// name和name2都指向 zhangsan
	}

	// 1.字符串不变：字符串的值在创建后不能被更改
	private void test1() {
		String name = "zhang";
		name += "san";
		System.out.println(name);// zhangsan
		// 内存中的常量池有zhang，zhangsan两个对象
		// name从指向zhang改变指向 zhangsan
	}

	public static void main(String[] args) {
		new StringDemo();

	}
}

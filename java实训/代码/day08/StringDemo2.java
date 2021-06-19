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

	// ����ת��
	private void test9() throws Exception {
		String a = "��";
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

	// �ָ�ķ���
	private void test8() {
		// �����ַ�������
		String s = "aa bb cc";
		String[] strArray = s.split(" "); // ["aa","bb","cc"]
		System.out.println(Arrays.toString(strArray));
		for (int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]); // aa bb cc }
		}
	}

	// ת�����ܵķ���
	private void test7() {
		// �����ַ�������
		String s = "abcde";
		// char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		// byte[] getBytes ():���ַ���ת��Ϊ�ֽ�����
		byte[] bytes = s.getBytes();
		for (int x = 0; x < bytes.length; x++) {
			System.out.println(bytes[x]);
		}
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");

		// �滻��ĸcΪ��дC
		String str = "chuanxijiaoyu";
		String replace = str.replace("c", "C").replace("x", " X");
		System.out.println(replace);
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
	}

	// ��ȡ���ܵķ���
	private void test6() {
		// �����ַ�������
		String s = "helloworld";
		// int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
		System.out.println(s.length());
		System.out.println("�\�\�\�\�\�\�\�\");
		// String concat (String str):
		// ����ָ�����ַ������ӵ����ַ�����ĩβ.
		s = "helloworld";
		String s2 = s.concat("**hello zhang");
		System.out.println(s2);//
		// char charAt(int index):��ȡָ�����������ַ�
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("�\�\�\�\�\�\�\�\");
		// ��ȡstr���ַ��������е�һ�γ��ֵ�����,û�з��ة\1
		// int indexOf(String str):

		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("h"));
		System.out.println(s.indexOf("ow"));
		System.out.println("�\�\�\�\�\�\�\�\");
		// ��start��ʼ��ȡ�ַ������ַ�����β
		// String substring(int start):

		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		// System.out.println("�\�\�\�\�\�\�\�\");
		// // ��start��end��ȡ�ַ�������start������end��
		// // String substring(int start,int end):
		//
		System.out.println(s.substring(0, s.length()));
		System.out.println(s.substring(0, 1));
	}

	// �жϹ��ܵķ���
	private void test5() {
		// �����ַ�������
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
		// �Ƚ��ַ�������ͬλ�õ��ַ�
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		// �Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		// boolean equalsIgnoreCase(Stringstr):
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
	}

	// ���캯��
	private void test4() throws Exception {
		// �޲�������
		String str = new String();
		System.out.println(str);
		// ͨ���ַ����鹹��
		char data[] = { 's', 'a', 'n' };// char--ASICC--byte
		String name = new String(data);
		System.out.println(name);
		// ͨ���ֽ����鹹��
		byte bytes[] = { 97, 98, 99 };
		name = new String(bytes, "utf-8");
		System.out.println(name);

	}

	// 3. "abc" ��Ч�� char[] data={ 'a' , 'b' , 'c' }
	private void test3() {
		String name = "san";
		char data[] = { 's', 'a', 'n' };
		String name2 = new String(data);
		// �ַ����ĵײ㶼�ǿ��ַ�����ʵ�ֵ�
		// �����ַ���ʵ�ʲ����ĳ�ʼ�ַ�����
	}

	// 2. ��ΪString�����ǲ��ɱ�ģ��������ǿ��Ա�����
	private void test2() {
		String name = "zhangsan";
		String name2 = "zhangsan";
		// �ڴ��еĳ�������zhangsanһ������
		System.out.println(name == name2);
		// name��name2��ָ�� zhangsan
	}

	// 1.�ַ������䣺�ַ�����ֵ�ڴ������ܱ�����
	private void test1() {
		String name = "zhang";
		name += "san";
		System.out.println(name);// zhangsan
		// �ڴ��еĳ�������zhang��zhangsan��������
		// name��ָ��zhang�ı�ָ�� zhangsan
	}

	public static void main(String[] args) {
		new StringDemo();

	}
}

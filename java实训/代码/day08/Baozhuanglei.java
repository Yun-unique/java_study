package day08;

public class Baozhuanglei {
	public Baozhuanglei() {
		// ���캯���ǷǾ�̬����Դ����ֱ�ӵ��÷���
		init1();
	}

	// int
	int a = 10;// Ϊ����Ĭ����������

	private void init1() {
		Integer i = 10; // int�İ�װ�� ����ʹ������ö�Ӧ�ķ���
		// 1.����
		// Integer max = Integer.MAX_VALUE;
		// System.out.println(max);
		// int min = Integer.MIN_VALUE;
		// System.out.println(min);
		// int size=Integer.SIZE;
		// System.out.println(size);
		// 2.jdk 1.6 ��װ���Զ�ת���ɻ�����������(����)
		// Integer s1=12;
		// int s2=s1;
		// System.out.println(s2);
		// s2=11;
		// s1=s2;
		// System.out.println(s1);
		// 3.���캯��
		// ��������������ת���ɰ�װ��
		// int s2 = 12;
		// Integer s3 = new Integer(12); // װ��
		// String id = "122";
		// // ʹ�ù��캯�����ַ�������ת����integer
		// s3 = new Integer(id);
		// System.out.println(s3);
		// 4.����
		//4.1 ����ַ���ת������������
		String id="1001";
		Integer id2=0;
		id2=new Integer(id); //4.1.1
		System.out.println(id2);
		id2=Integer.parseInt(id);//4.1.2
		System.out.println(id2);
		id2=Integer.valueOf(id);//4.1.3
		System.out.println(id2);
		//4.2.ת���ɻ�����������
		Integer value=new Integer(12);
		byte a=value.byteValue();
		short a2=value.shortValue();
		long a3=value.longValue();
		float a4=value.floatValue();
		double a5=value.doubleValue();
		int value2=value;
		char a6=(char)value2;
		System.out.println("--------");
		//5.����������ת�����ַ�����
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
	// String--char���͵����

	public static void main(String[] args) {
		new Baozhuanglei();// ���ù��캯��
	}

}

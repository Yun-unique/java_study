package day08;

public class Baozhuanglei {
	public Baozhuanglei() {
		// ���캯���ǷǾ�̬����Դ����ֱ�ӵ��÷���
		init8();
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
		// 4.1 ����ַ���ת������������
		// String id="1001";
		// Integer id2=0;
		// id2=new Integer(id); //4.1.1
		// System.out.println(id2);
		// id2=Integer.parseInt(id);//4.1.2
		// System.out.println(id2);
		// id2=Integer.valueOf(id);//4.1.3
		// System.out.println(id2);
		// 4.2.ת���ɻ�����������
		// Integer value=new Integer(12);
		// byte a=value.byteValue();
		// short a2=value.shortValue();
		// long a3=value.longValue();
		// float a4=value.floatValue();
		// double a5=value.doubleValue();
		// int value2=value;
		// char a6=(char)value2;
		// System.out.println("--------");
		// //5.����������ת�����ַ�����
		// String val=Integer.toString(12);
		// System.out.println(val);
		// val=Integer.toString(12,2);
		// System.out.println(val);
		// val=Integer.toString(12,16);
		// System.out.println(val);
		// val=Integer.toString(12,7);
		// System.out.println(val);
		// 6.����֮���ת��
		int value = 12;
		// static String toBinaryString(int i)
		// �Զ����ƣ����� 2���޷���������ʽ����һ�������������ַ�����ʾ��ʽ��
		String val = Integer.toBinaryString(value);
		System.out.println(val);
		// static String toHexString(int i)
		// ��ʮ�����ƣ����� 16���޷���������ʽ����һ�������������ַ�����ʾ��ʽ��
		val = Integer.toHexString(value);
		System.out.println(val);

		// static String toOctalString(int i)
		// �԰˽��ƣ����� 8���޷���������ʽ����һ�������������ַ�����ʾ��ʽ
		val = Integer.toOctalString(value);
		System.out.println(val);

	}

	// byte �����Ƶı�ʾ��ʽ
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
		double c1 = c;// ������������������Զ�����ת��
		Double b1 = c1;// װ�䲻������Զ�����ת��
		// ֻ��ͬһ����������ת��
		// Double b1=12.0;
		Double b = new Double(b1);
		b = new Double("11");
	}

	// boolean
	private void init7() {
      Boolean bool1=new Boolean(true);  //��ıȽϱȽϵ��ǵ�ַ
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
	// String--char���͵����

	public static void main(String[] args) {
		new Baozhuanglei();// ���ù��캯��
	}

}

package day08;

public class StringBufferDemo {
	public StringBufferDemo() {
		init();
	}
	private void init() {
		//����һ�����в����ַ����ַ�������������ʼ����Ϊ 16 ���ַ���
		StringBuffer buffer=new StringBuffer();
		
		//super(16); //�ַ�����ĳ�����16
		int size=buffer.capacity();//�������鳤��
		System.out.println(size);
		buffer=new StringBuffer(2);
		buffer.append('a');
		buffer.insert(1, "ac");
		System.out.println(buffer);
		buffer.append("abcdfg");
		System.out.println(buffer);
		size=buffer.capacity();
		System.out.println(size);
		int length=buffer.length();//ʵ���ַ�����
		System.out.println(length);
		
		
//		 buffer=new StringBuffer(16);
//		 buffer=new StringBuffer("abc");//�ַ�������+16
//		 buffer.append("sefsefsefsefsefsefsefsefsefsef");
//		 buffer.insert(6, "g");
//		 char c=buffer.charAt(4);
//		 System.out.println(buffer);
//		 System.out.println(c);
		
	}
	public static void main(String[] args) {
		new StringBufferDemo();
	}

}

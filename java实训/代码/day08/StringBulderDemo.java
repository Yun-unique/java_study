package day08;

public class StringBulderDemo {
	public StringBulderDemo() {
		init();
	}
	private void init() {
		//����һ�����в����ַ����ַ�������������ʼ����Ϊ 16 ���ַ���
		StringBuilder buffer=new StringBuilder();
		//this(16);
		 buffer=new StringBuilder(16);
		 buffer=new StringBuilder("abc");//�ַ�������+16
		 buffer.append("sefsefsefsefsefsefsefsefsefsef");
		 buffer.insert(6, "g");
		 char c=buffer.charAt(4);
		 System.out.println(buffer);
		 System.out.println(c);
		
	}
	public static void main(String[] args) {
		new StringBulderDemo();
	}

}

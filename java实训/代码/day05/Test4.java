package day05;
/**
 * this�ؼ��ֵ��ù��캯��---��ѭ��
 * @author fan
 *
 */
public class Test4 {
	int a=10;
	public Test4() {
		this(1);//this������ʾ���ù��캯��
		System.out.println("�޲���1");
	}
	public Test4(int  a) {
		this("");
		System.out.println("����int");
	}
	public Test4(byte  a) {
		System.out.println("����byte");
	}
	public Test4(String  a) {
		System.out.println("����string");
	}
	public Test4(String  a,int b) {
		System.out.println("����string,int");
	}
public static void main(String[] args) {
	 new  Test4();
}
}

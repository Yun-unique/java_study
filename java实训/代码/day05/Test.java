package day05;
/**
 * ����ķ���----���캯��
 * 1.����:
 *   ��ʼ������
 *   �����Ը�ֵ
 * 2.���ã� ���캯���ڴ�������ʱ����
 * 3.���ݲ��������Ĳ�ͬ�����߲��������͵Ĳ�ͬ
 *   ����ָ���Ĺ��캯��  
 * 4.���캯��û�з���ֵ�����͡�Ҳû�з���ֵ
 *   ��������������ͬ  
 * 5.����ָ���Ĺ��캯��  
 * @author fan
 *
 */
public class Test {
	int a=10;
	public Test() {
		System.out.println("�޲���1");
	}
	public Test(int  a) {
		System.out.println("����int");
	}
	public Test(byte  a) {
		System.out.println("����byte");
	}
	public Test(String  a) {
		System.out.println("����string");
	}
	public Test(String  a,int b) {
		System.out.println("����string,int");
	}
public static void main(String[] args) {
	/**
	 * ͨ��ʵ�ε��ö�Ӧ�Ĺ���
	 */
	new Test();
	new Test(1);  //1Ĭ����int
	byte a=10;
	new Test(a);
	new Test("1");
	new Test("1",1);
//	new Test(1,"1");
	
	
	
//	//ÿ����һ�ζ��󣬵���һ�ι��캯������ʼ������
//	Test test1=new Test();
//	     test1.a=1;
//	     System.out.println(test1.a);//1
//	Test test2=new Test();
//	System.out.println(test2.a);//10
//	test2.a=30;
//	     test2=new Test();
//	     System.out.println(test2.a);//10
}
}

package day05;
/**
 * ���ԣ�ȫ������
 * ������
 *   ���췽��
 *   һ�㷽��
 *   �����
 * @author fan
 *
 */
public class Test5 {
	public Test5() {//2.���캯���ڴ�������ʱ����
		System.out.println("a2:"+a);
		}
	int  a=10;  //1.������������ͬ��
	//1.1 ���Ժʹ�����ڼ������Ǳ�����
	{
		System.out.println(a);
//		System.out.println(b);
	}
	//3.������ִ���ڴ��������ִ��
	private void eat() {//c
		System.out.println("Eat");

	}
	
	int  b=10;
	
	
public static void main(String[] args) {
	/**
	 * �ڼ������Ժʹ����
	 * �ڴ���������ù��캯��
	 * ���󴴽���ɺ󣬵��ü��صķ���
	 */
	 new Test5().eat();;
}
}

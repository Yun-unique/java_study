package day03;

/**
 * ��ʽ�� for(��ʼ��;�ж�;����){ ��ѭ��}
 * 
 * @author fan
 *
 */
public class ForDemo {
	private static void test1() {
		int i = 0;  //1.�������
		for (; i < 10;) { //2.�ж�����
			System.out.println(i);
			i++;  //3.��������
		}

	}
	private static void test2() {
		 //1.�������
		for (int i = 0;  i < 10;i++) { //2.�ж�����
			System.out.print(i+" "); 
			  //3.��������
			//ע�⣺forѭ����ִ�з�����������������
		}

	}
	private static void test3() {
		 //1.debugģʽ�鿴����  ���Թ���
		for (int i = 0;  i < 10;i++) { 	
			System.out.print(i+" "); 
			
		}

	}

	public static void main(String[] args) {
		test3();
	}
}

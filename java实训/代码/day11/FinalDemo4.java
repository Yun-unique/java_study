package day12.finals;

/**
 * 3.��������--���Բ��ɱ� 
 * 3.1�ֲ�����--������������
 * 3.1�ֲ�����--������������
 * 3.2 ��Ա����
 * 
 * @author fan
 *
 */
public class FinalDemo4 {
	public void eat() {
		final String name;// �ȶ�������
		name = "zhang";// ������Ը�ֵ
//		name = "zhang";// final���ε����Բ��ܸı�
		System.out.println(name);
	}
//	public void testForm() {
//		final int c=0;
//		for (int i = 0; i < 10; i++) {
//			c=i; //c�Ĳ��ɱ�
//			System.out.println(c);
//		}
//
//	}
	public void testForm2() {
		for (int i = 0; i < 10; i++) {
			final int 	c=i; //ÿ�ζ������¶������
			//��������Ч��Χ��forѭ��
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		FinalDemo4 demo4 = new FinalDemo4();
//		demo4.eat();
		demo4.testForm2();
	}

}

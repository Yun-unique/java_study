 package day04;

public class ForDemo {
	private static void testfor() {
		/**
		 * 1.for(int i=0;i<10;i++){}
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}

	}
	private static void testWhile() {
		/**
		 * 1.��ʽ:
		 * while(boolean){
		 * }
		 * 2.ȷ��ѭ�����������
		 * 3.�����ĳ�ʼ����ȷ��������ʹ�÷�Χ
		 */
//		int i=10;
//		while(i<11) {
//			System.out.println("i="+i);
//			i++;
//		}
		int i=1; //1.��ʼ��
		while(i<10) { //2.�ж�
			int j=1;
			while(j<10) {
				System.out.println("i="+i+" j="+j);
			 j++;
			}
			i++; //3.����
		}

	}

	public static void main(String[] args) {
		testWhile();

	}

}

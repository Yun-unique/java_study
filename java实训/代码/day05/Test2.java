package day05;
/**
 * ��Ա������
 *   1.��ʽ�� ���δ�  ����ֵ������  ��ʶ�� ([�����б�]){
 *   }
 *   2.���δʣ�
 *      public������������Ŀ�¿���ֱ�ӷ���
 *      private��˽�еģ�ֻ���ڱ����з���
 *      default��Ĭ�ϵĲ�д��ͬ���·���
 *      protected: �ܱ����ģ�ͨ���·���
 *   2������ֵ������
 *   	2.1 �з���ֵ����
 *   	2.2 �޷���ֵ���ͣ�ʹ��void����
 *   	2.3 ���ã���÷�����Ψһ���
 *   3.�����б�
 *   	3.1 �в���
 *  	3.2 �޲���
 *   	3.3 ���ã� ���ⲿ���ݴ��ݵ�������
 *   	3.4 �βΣ� ����,ֻ���ڷ�����ʹ��
 *       ʵ�Σ� ������ֵ
 *   4.ע�⣺ �����ڶ�����ɺ󲻻ᱻִ��
 *           ͨ������ִ��    
 * @author fan
 *
 */
public class Test2 {
	/**
	 * ���ã� ��Ҫ�Ա�������ݲ���
	 */
	public void add() {
		System.out.println("�޲����޷���ֵ����");
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		System.out.println("�в����޷���ֵ����");
	}
	public int add2(int a,int b) {
		int c=a+b;
		System.out.println("�в����з���ֵ����");
	   return c;
	}
	
public static void main(String[] args) {
	Test2 test2=new Test2();
	test2.add();
	int  add=test2.add2(1, 3);
	System.out.println(add);
	
	
}
}

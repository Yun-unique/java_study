package day07;

public  class  StaticTest {
	
	  
	
	public static void main(String[] args) throws Exception {
		//������
		//�������Ժʹ����
		//��������--���ù���
//		StaticDemo demo=new StaticDemo();
	   //��̬��Դ�ڼ�����ʱ����---������
	Class clazz=Class.forName("day07.StaticDemo");
	//ÿ�δ�������Ǿ�̬����Դ���¼���
	clazz.newInstance();  //�������� 
	clazz.newInstance();  //�������� 	
		
		//private ֻ���ڱ����з���
//		StaticDemo.id=1002;
//		System.out.println(StaticDemo.id);
//		//������������¼��ؾ�̬
//
//		StaticDemo demo=new StaticDemo();
//		demo.id=1004;
//		System.out.println(demo.id);
//		
//		demo=new StaticDemo();
//		System.out.println(demo.id);
	}

}

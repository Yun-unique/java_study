package day07;
/**
 * 
 *static��
 * 1.��������
 *   ͨ��������������
 * 2.���η���
 * 3.���壺 
 * ʹ��static���ε����ݿ���ͨ����������
 * 4.���ã�
 *    ���ݹ���
 *    ����������
 *    ��̬��Դֻ����һ��,�ʹ��������޹�ϵ
 *5.����˳��
 *6.���ã�
 *   ��̬��Դ���ܵ��÷Ǿ�̬��Դ
 *   �Ǿ�̬��Դ���Ե��þ�̬��Դ
 *  
 */
public  class  StaticDemo {
	/***********�Ǿ�̬����*************/ 
	  public  String name="a";//2.1
	  public int i=eat();
	  {//2.2  ����������ͬ�� ��ʽԭ��
		  System.out.println("name="+name);
		  System.out.println("id="+id);
		  System.out.println("i="+i);
		   name="zhang";
		   eat();
	  }
	
	  //���캯��
	  public StaticDemo() { //2.3 ���������ù��캯��
		System.out.println("id="+id);
		  System.out.println("name2="+name);
	  }	 
	  //2.4���󴴽���ɺ���÷���
	  public void play() {
		  eat();
		System.out.println(name);
	  }
	/***********��̬����*************/
	  public static int id=1001;//1.1��̬��Դ--
	  static {
		  //�����������
		  System.out.println("��̬�����"+id);
	  }
	  public static int eat() {
		System.out.println("eat");
		return 1;
	  }

	
	public static void main(String[] args) {
//		StaticDemo demo=new StaticDemo();
		
//		System.out.println(StaticDemo.id);
//		StaticDemo.eat();
		
	}

}

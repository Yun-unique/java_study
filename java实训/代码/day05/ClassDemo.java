package day05;

public class ClassDemo {
/**
 * 1.���� ����ı���--�����Ķ����ʽ��
 *   ��������  ������=ֵ
 *   �������ͣ� ������������
 *   �����������ͣ�
 * 2.��Ϊ��--����
 *   2.1������ʽ��
 *   ����ֵ����  ���������֣�[�б����]��{
 *     //������ִ����
 *   } 
 *   2.2[���δ�] ����ֵ���ͣ���ͨ��������ʹ��return ���ص�ֵ
 *               ȷ������������
 *   2.3 ע�⣺return û�����ֵ��Ĭ��ʹ��void
 *          ͬһ������ֻ��һ������ֵ����
 * 3.���е����ݿ���ͨ���������
 * 3.1 ���� 
 *    ��������ľ���ʵ��
 * 3.2 ��������ĸ�ʽ
 *     �����Ķ����ʽ
 *     ��ֵʹ�õ�ʹnew�ؼ���
 *     ������  ��ʶ��=new  ������()   
 * 3.3 ��������
 *     ����.������ �� �����Ҫ���ܣ�ʹ�ö�Ӧ������
 *     ����.����()
 * 4.���ص����ã�
 *     ������Ψһ���    
 * 5.ע�⣺��static���εķ���������main������ֱ�ӵ���
 *        ����ͨ�������������    
 */
	public void eat(){ //1.ȷ�������� 3.���ݷŻ�ֵȷ������
		return ; //2.ȷ������ֵ
	}
	public float eat1(){ //1.ȷ�������� 3.���ݷŻ�ֵȷ������
		//1��������  byte  short  int long float double
		//2.�Զ�����ת��
		return 1; //2.ȷ������ֵ
	}
	public String eat2(){ //1.ȷ�������� 3.���ݷŻ�ֵȷ������
		//1��������  byte  short  int long float double
		//2.�Զ�����ת��
		return "1"; //2.ȷ������ֵ
	}
	/**
	 * ͬһ�������з���ֵ��������ͳһ��
	 * ����ֵ��ֵ���Բ�ͬ
	 * @return
	 */
	public String eat3(){ //1.ȷ�������� 3.���ݷŻ�ֵȷ������
		int a=10;
		if(a>10) {
			return "2";  //����ֵ������Ĭ��Ϊint
		}else {
			return "1" ;//����ֵ������ΪString
		}
	}
	
	int  age=12;//���������
	String name="��";
	public static void main(String[] args) {
//		3.2 ��������ĸ�ʽ
		ClassDemo classDemo=null; //�������
		classDemo=new ClassDemo();//��������
//		3.3 �������е�����
//		ע�⣺����з���ֵ��
//		       ����ʹ�÷���ֵ��Ӧ�����ͽ���
//		3.3.1 ��������
		  System.out.println(classDemo.age); ;
		int age=classDemo.age;
		String name=classDemo.name;
		System.out.println(name);
//		3.3.2 ���÷���
//		��������Ϊvoid�Ĳ��ܽ��ܲ��ܴ�ӡ
		classDemo.eat(); //void
	float a=	classDemo.eat1(); //float
	System.out.println(a);
	String a2=	classDemo.eat2(); //String
	String a3=	classDemo.eat3(); //String
	}
	
	
}

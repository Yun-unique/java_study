package day06;

import java.lang.reflect.Constructor;

/**
 * ��������
 * 1.new ���ù��캯�� ������еĹ���
 * 2.������---����� newInstance  ����
 * 3.Constructor ����newInstance
 * 4.clone
 * 5.��
 * @author fan
 *
 */
public class StuBean4 {
	private int id=1;
	public StuBean4() {
		System.out.println("StuBean4");
	}
	public StuBean4(int id) {
		System.out.println("StuBean4 id");
	}
public static void main(String[] args) throws Exception {
	StuBean4 stu= (StuBean4)Class.forName("day06.StuBean4").newInstance();
	StuBean4 stu1=(StuBean4) stu.clone();
	System.out.println(stu1);
	System.out.println(stu);
	
//	Class  clazz=	StuBean4.class;
//	Constructor constructor= clazz.getConstructor();
//	String name=constructor.getName();
//	System.out.println(name);
//	constructor.newInstance(); //���ù��캯��
//	Class  clazz=	StuBean4.class;
//	Constructor constructor= clazz.getConstructor(int.class);
//	String name=constructor.getName();
//	System.out.println(name);
//	constructor.newInstance(1); //���ù��캯��
	
	//	StuBean4 stu= new StuBean4();
	//������ص��ڴ�
//	  Class  clazz=	StuBean4.class;
////    Class  clazz=	 Class.forName("day06.StuBean4");//������  ��������
//	//������  ��������
//	
//	//���ù��캯��--ʵ�ʵ��÷���
//   StuBean4 obj= (StuBean4)clazz.newInstance();
//       obj.id=11;
//       obj=   (StuBean4)clazz.newInstance();//��ʼ������
//   System.out.println(obj.id);
}
}

package day10.extend;

public class EmployeeTeacher extends Employee {
   //1.��Ա����
	//1.1 ����͸��಻ͬ��ȫ�ֱ���
	String sex="��";
	//1.2 ����͸�����ͬ��ȫ�ֱ���
	String name="Teacher";
	//2.��Ա����
	//2.1 ���岻ͬ���ֵķ���
	public void print() {
		//�����������ķ�������������ķ���
		System.out.println("name="+name);
		System.out.println("supername="+super.name);

	}
//	2.2 ������ͬ���ֵķ���
	public void work() {
		System.out.println("tacher �����Ĺ���");
	}
	public static void main(String[] args) {
		EmployeeTeacher teacher=new EmployeeTeacher();
		System.out.println(teacher.name);//Teacher
		System.out.println(teacher.sex);
		//��������ķ���
		teacher.print();
		//���ø���ķ�������������������ĵ�������ķ���
		teacher.work();
		System.out.println("-------------");
	
//		
		//����˭�Ķ���  ����˭������
		Employee employee=new Employee();
		System.out.println(employee.name); //Ա��
       employee.work();//���಻�ܵ������������
		System.out.println("-------------");
       //		//???
		employee=new EmployeeTeacher();
		System.out.println(employee.name); //Ա��
		 employee.work();
		 System.out.println("----------");
	}
}

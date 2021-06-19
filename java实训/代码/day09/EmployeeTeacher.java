package day10.extend;

public class EmployeeTeacher extends Employee {
   //1.成员变量
	//1.1 定义和父类不同的全局变量
	String sex="男";
	//1.2 定义和父类相同的全局变量
	String name="Teacher";
	//2.成员方法
	//2.1 定义不同名字的方法
	public void print() {
		//子类有重名的方法，调用子类的方法
		System.out.println("name="+name);
		System.out.println("supername="+super.name);

	}
//	2.2 定义相同名字的方法
	public void work() {
		System.out.println("tacher 尽力的工作");
	}
	public static void main(String[] args) {
		EmployeeTeacher teacher=new EmployeeTeacher();
		System.out.println(teacher.name);//Teacher
		System.out.println(teacher.sex);
		//调用子类的方法
		teacher.print();
		//调用父类的方法，如果子类有重名的调用子类的方法
		teacher.work();
		System.out.println("-------------");
	
//		
		//创建谁的对象  调用谁的属性
		Employee employee=new Employee();
		System.out.println(employee.name); //员工
       employee.work();//父类不能调用子类的类型
		System.out.println("-------------");
       //		//???
		employee=new EmployeeTeacher();
		System.out.println(employee.name); //员工
		 employee.work();
		 System.out.println("----------");
	}
}

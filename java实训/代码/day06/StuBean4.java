package day06;

import java.lang.reflect.Constructor;

/**
 * 创建对象：
 * 1.new 调用构造函数 完成所有的功能
 * 2.加载类---类加载 newInstance  反射
 * 3.Constructor 调用newInstance
 * 4.clone
 * 5.流
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
//	constructor.newInstance(); //调用构造函数
//	Class  clazz=	StuBean4.class;
//	Constructor constructor= clazz.getConstructor(int.class);
//	String name=constructor.getName();
//	System.out.println(name);
//	constructor.newInstance(1); //调用构造函数
	
	//	StuBean4 stu= new StuBean4();
	//将类加载到内存
//	  Class  clazz=	StuBean4.class;
////    Class  clazz=	 Class.forName("day06.StuBean4");//加载类  完成类加载
//	//加载类  完成类加载
//	
//	//调用构造函数--实际调用方法
//   StuBean4 obj= (StuBean4)clazz.newInstance();
//       obj.id=11;
//       obj=   (StuBean4)clazz.newInstance();//初始化属性
//   System.out.println(obj.id);
}
}

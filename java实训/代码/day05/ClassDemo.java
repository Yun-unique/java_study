package day05;

public class ClassDemo {
/**
 * 1.属性 定义的变量--变量的定义格式：
 *   数据类型  变量名=值
 *   数据类型： 基本数据类型
 *   引用数据类型：
 * 2.行为：--方法
 *   2.1方法格式：
 *   返回值类型  方法的名字（[列表参数]）{
 *     //方法的执行体
 *   } 
 *   2.2[修饰词] 返回值类型：是通过方法中使用return 返回的值
 *               确定的数据类型
 *   2.3 注意：return 没有添加值，默认使用void
 *          同一个方法只有一个返回值类型
 * 3.类中的内容可以通过对象调用
 * 3.1 对象： 
 *    对象是类的具体实现
 * 3.2 创建对象的格式
 *     变量的定义格式
 *     赋值使用的使new关键字
 *     类类型  标识符=new  类类型()   
 * 3.3 调用属性
 *     对象.属性名 ： 如果需要接受，使用对应的类型
 *     对象.方法()
 * 4.返回的作用：
 *     方法的唯一结果    
 * 5.注意：无static修饰的方法不能在main方法中直接调用
 *        可以通过创建对象调用    
 */
	public void eat(){ //1.确定方法名 3.根据放回值确定类型
		return ; //2.确定返回值
	}
	public float eat1(){ //1.确定方法名 3.根据放回值确定类型
		//1整数类型  byte  short  int long float double
		//2.自定类型转换
		return 1; //2.确定返回值
	}
	public String eat2(){ //1.确定方法名 3.根据放回值确定类型
		//1整数类型  byte  short  int long float double
		//2.自定类型转换
		return "1"; //2.确定返回值
	}
	/**
	 * 同一个方法中返回值的类型是统一的
	 * 返回值的值可以不同
	 * @return
	 */
	public String eat3(){ //1.确定方法名 3.根据放回值确定类型
		int a=10;
		if(a>10) {
			return "2";  //返回值的类型默认为int
		}else {
			return "1" ;//返回值的类型为String
		}
	}
	
	int  age=12;//定义的属性
	String name="帐";
	public static void main(String[] args) {
//		3.2 创建对象的格式
		ClassDemo classDemo=null; //定义变量
		classDemo=new ClassDemo();//创建对象
//		3.3 调用类中的内容
//		注意：如果有返回值，
//		       可以使用返回值对应的类型接受
//		3.3.1 调用属性
		  System.out.println(classDemo.age); ;
		int age=classDemo.age;
		String name=classDemo.name;
		System.out.println(name);
//		3.3.2 调用方法
//		返回类型为void的不能接受不能打印
		classDemo.eat(); //void
	float a=	classDemo.eat1(); //float
	System.out.println(a);
	String a2=	classDemo.eat2(); //String
	String a3=	classDemo.eat3(); //String
	}
	
	
}

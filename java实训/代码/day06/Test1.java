package day06;


/**
 * 1.重载
 *   方法名相同
 *   参数类型不同
 *   参数个数不同
 *   和参数名没有任何关系
 * 2.调用：
 *   默认调用空参数的构造函数
 *   如果写了构造函数，默认构造会取消
 *   每个类必须重写无参数的构造函数
 * 3.构造的作用：
 *   初始化属性  
 *   给属性赋值
 *   
 *   
 * @author fan
 *
 */
public class Test1 {
	private int  id;
	private String name;
	
	public Test1() {
		init();//方法的调用
		System.out.println("Test1");
	}
	public Test1(int id,String name) {//初始化属性
		  this.id=id;
		  this.name=name;
		  System.out.println("Test1  int string");
	}
//	public Test1(int a,String b) {
//		System.out.println("Test1  int string");
//	}
	
	public void init() {//初始化属性
		  this.id=12;
		  this.name="zhang";
	}
	public void show() {
		System.out.println("id="+id+",name="+name);
	}
	public Test1(byte a) {
		System.out.println("Test1 byte");
	}
	public Test1(int a) {
		System.out.println("Test1  int");
	}

	public Test1(String b,int a) {
		System.out.println("Test1   string int");
	}
	public static void main(String[] args) {
//		new Test1().show();//调用空参数的构造
//		new Test1(1); //1默认是int类型 调用int类型的构造
//		new Test1((byte)1); //调用byte类型的构造
//		new Test1((byte)1,"1");//自动类型转换  byte转换成int
//		new Test1("1",(byte)1);//自动类型转换  byte转换成int
	    new Test1(1,"a").show();;
	
	}

}

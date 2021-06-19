package day05;
/**
 * 特殊的方法----构造函数
 * 1.作用:
 *   初始化属性
 *   给属性赋值
 * 2.调用： 构造函数在创建对象时调用
 * 3.根据参数个数的不同，或者参数的类型的不同
 *   调用指定的构造函数  
 * 4.构造函数没有返回值的类型。也没有返回值
 *   函数名和类名相同  
 * 5.调用指定的构造函数  
 * @author fan
 *
 */
public class Test {
	int a=10;
	public Test() {
		System.out.println("无参数1");
	}
	public Test(int  a) {
		System.out.println("参数int");
	}
	public Test(byte  a) {
		System.out.println("参数byte");
	}
	public Test(String  a) {
		System.out.println("参数string");
	}
	public Test(String  a,int b) {
		System.out.println("参数string,int");
	}
public static void main(String[] args) {
	/**
	 * 通过实参调用对应的构造
	 */
	new Test();
	new Test(1);  //1默认是int
	byte a=10;
	new Test(a);
	new Test("1");
	new Test("1",1);
//	new Test(1,"1");
	
	
	
//	//每创建一次对象，调用一次构造函数，初始化属性
//	Test test1=new Test();
//	     test1.a=1;
//	     System.out.println(test1.a);//1
//	Test test2=new Test();
//	System.out.println(test2.a);//10
//	test2.a=30;
//	     test2=new Test();
//	     System.out.println(test2.a);//10
}
}

package day05;
/**
 * 属性：全局属性
 * 方法：
 *   构造方法
 *   一般方法
 *   代码块
 * @author fan
 *
 */
public class Test5 {
	public Test5() {//2.构造函数在创建对象时调用
		System.out.println("a2:"+a);
		}
	int  a=10;  //1.代码块和属性是同级
	//1.1 属性和代码块在加载类是被加载
	{
		System.out.println(a);
//		System.out.println(b);
	}
	//3.方法的执行在创建对象后执行
	private void eat() {//c
		System.out.println("Eat");

	}
	
	int  b=10;
	
	
public static void main(String[] args) {
	/**
	 * 在加载属性和代码块
	 * 在创建对象调用构造函数
	 * 对象创建完成后，调用加载的方法
	 */
	 new Test5().eat();;
}
}

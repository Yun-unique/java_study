package day12.finals;

/**
 * 3.修饰属性--属性不可变 
 * 3.1局部变量--基本数据类型
 * 3.1局部变量--引用数据类型
 * 3.2 成员变量
 * 
 * @author fan
 *
 */
public class FinalDemo4 {
	public void eat() {
		final String name;// 先定义属性
		name = "zhang";// 后给属性赋值
//		name = "zhang";// final修饰的属性不能改变
		System.out.println(name);
	}
//	public void testForm() {
//		final int c=0;
//		for (int i = 0; i < 10; i++) {
//			c=i; //c的不可变
//			System.out.println(c);
//		}
//
//	}
	public void testForm2() {
		for (int i = 0; i < 10; i++) {
			final int 	c=i; //每次都是重新定义变量
			//变量的有效范围是for循环
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		FinalDemo4 demo4 = new FinalDemo4();
//		demo4.eat();
		demo4.testForm2();
	}

}

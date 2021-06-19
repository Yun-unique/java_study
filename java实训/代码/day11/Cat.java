package day12.duotai;

public class Cat extends Animal {

	@Override //重写
	public void eat() {
//		super.eat();//调用父类的方法
		System.out.println("Cat 吃鱼");

	}
	public static void main(String[] args) {
		// 1.多态的体现格式
//		父类类型  变量名=new  子类类型
		//2.同一种事物的多种形态
		Animal animal=new Cat();
		animal.eat();//子类重写父类的方法，默认的super调用取消
		/**
		 * 父类继承子类的内容是通过super关键字调用的
		 * 神奇的类结构
		 */
		animal=new Animal();
		animal.eat();//方法的调用
		animal=new Dog();
		animal.eat();
	}
	

}

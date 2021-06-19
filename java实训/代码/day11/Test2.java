package day12.duotai;

public class Test2 {
	public static void main(String[] args) {
        //4.类型转换
		//4.1 向上类型转换（自动完成的）
//		Animal animal=new Dog();
		Dog dog=new Dog(); //创建对象  
//		子类的内容也有父类的内容
		Animal animal=dog; //获得对象中父类的内容
		animal.eat();//在子类中没有使用super调用父类的内容
//		animal.play();
		//4.2 向下类型转换(强制类型转换)
		dog=(Dog)animal;//在子类中获得包含父类的内容
		dog.eat();
		dog.play();
		//类的名字不匹配
		Cat cat=(Cat)animal;//子类的父类的子类不是本类
		//非独生子女（两个儿子）
		//你的父类的儿子不是你（兄弟）
		cat.eat();//Cateat  dogeat
		
	}
	public static void showAnimal(Animal animal) {
		animal.eat();
	}
}

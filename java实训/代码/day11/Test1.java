package day12.duotai;

public class Test1 {
	public static void main(String[] args) {
	//3.多态的好处
		//3.1 使用重载实现多态
//		Cat cat=new Cat();
//		showAnimal(cat);//类类型作为参数使用
//		//就是将类的所有内容加载到方法中
//		Dog dog=new  Dog();
//		showAnimal(dog);
		//3.2  类重写实现多态
		Animal animal=new Dog();
		showAnimal(animal);
		animal=new Cat();
		showAnimal(animal);
		animal=new Bird();
		showAnimal(animal);
		
	}
	public static void showAnimal(Cat cat) {
		 cat.eat();
	}
	public static void showAnimal(Dog dog) {
		 dog.eat();
	}
	public static void showAnimal(Animal animal) {
		animal.eat();
	}
	
} 

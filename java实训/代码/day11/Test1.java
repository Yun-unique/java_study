package day12.duotai;

public class Test1 {
	public static void main(String[] args) {
	//3.��̬�ĺô�
		//3.1 ʹ������ʵ�ֶ�̬
//		Cat cat=new Cat();
//		showAnimal(cat);//��������Ϊ����ʹ��
//		//���ǽ�����������ݼ��ص�������
//		Dog dog=new  Dog();
//		showAnimal(dog);
		//3.2  ����дʵ�ֶ�̬
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

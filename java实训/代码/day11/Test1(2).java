package day12.duotai2;
/**
 * ����Աι����ʳ��
 * @author fan
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Animal animal=new Animal("����");
		Animal animal2=new Animal("����");
		Food food1=new Food("ƻ��");
//		animal.eat(food1);
		Food food2=new Food("�㽶");
//		animal.eat(food2);
		Person person=new Person("С��");
		Person person2=new Person("С��");
		person.feedAnimal(animal, food1);
		person.feedAnimal(animal, food2);
		person.feedAnimal(animal2, food1);
		person2.feedAnimal(animal2, food1);
		
		
	}

}

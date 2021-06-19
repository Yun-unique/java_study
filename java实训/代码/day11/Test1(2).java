package day12.duotai2;
/**
 * 饲养员喂动物食物
 * @author fan
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Animal animal=new Animal("大象");
		Animal animal2=new Animal("猴子");
		Food food1=new Food("苹果");
//		animal.eat(food1);
		Food food2=new Food("香蕉");
//		animal.eat(food2);
		Person person=new Person("小李");
		Person person2=new Person("小张");
		person.feedAnimal(animal, food1);
		person.feedAnimal(animal, food2);
		person.feedAnimal(animal2, food1);
		person2.feedAnimal(animal2, food1);
		
		
	}

}

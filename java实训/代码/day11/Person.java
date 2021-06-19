package day12.duotai2;

public class Person {
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public void feedAnimal(Animal animal,Food food) {
		System.out.print(name+"ι");
		animal.eat(food);
	}
	

}

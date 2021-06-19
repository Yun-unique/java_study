package day12.duotai2;

public class Animal {
	private String name;
	
	public void eat(Food food) {// 使用参数实现多态
		String foodName = food.getName();
		System.out.println(name+"吃"+foodName);

	}
	//set/get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}

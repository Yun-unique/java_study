package day12.duotai2;

public class Animal {
	private String name;
	
	public void eat(Food food) {// ʹ�ò���ʵ�ֶ�̬
		String foodName = food.getName();
		System.out.println(name+"��"+foodName);

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

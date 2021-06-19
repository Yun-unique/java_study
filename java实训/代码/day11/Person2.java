package day12.niname;

public class Person {
	private String name;
	private boolean live=true;

	class Heart {
		 public void jump() {
			 System.out.println(name);
			 if(live) {
				 System.out.println("心跳");
			 }else {
				 System.out.println("停止心跳");
			 }
		 }
	}
	public static void main(String[] args) {
//		Heart heart=new Person().new Heart();
//		heart.jump();
		Person person=new Person();// 创建一个外部类对象
		person.name="三";
		person.live=false;
		Heart heart=person.new Heart();
		heart.jump();
	}
}

package day12.niname;

public class Person {
	private String name;
	private boolean live=true;

	class Heart {
		 public void jump() {
			 System.out.println(name);
			 if(live) {
				 System.out.println("����");
			 }else {
				 System.out.println("ֹͣ����");
			 }
		 }
	}
	public static void main(String[] args) {
//		Heart heart=new Person().new Heart();
//		heart.jump();
		Person person=new Person();// ����һ���ⲿ�����
		person.name="��";
		person.live=false;
		Heart heart=person.new Heart();
		heart.jump();
	}
}

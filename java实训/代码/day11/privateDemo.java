package day12.packages;


public class privateDemo {
	private String name1;
	String name2;
	protected String name3;
	public String name4;

	public static void main(String[] args) {
		privateDemo demo=new privateDemo();
		System.out.println(demo.name1);
		System.out.println(demo.name2);
		System.out.println(demo.name3);
		System.out.println(demo.name4);
		
	}
}

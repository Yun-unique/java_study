package day14.set1;

public class KeBi {
	 //可变参数
	public static void eat(String... strings) {
		//可变长度相当于数据
		System.out.println(strings.length);
	}
	public static void main(String[] args) {
		eat();eat("1");eat("1","2");
	}
}

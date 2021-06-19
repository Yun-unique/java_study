package day05;
/**
 * this关键字调用构造函数---死循环
 * @author fan
 *
 */
public class Test4 {
	int a=10;
	public Test4() {
		this(1);//this方法表示调用构造函数
		System.out.println("无参数1");
	}
	public Test4(int  a) {
		this("");
		System.out.println("参数int");
	}
	public Test4(byte  a) {
		System.out.println("参数byte");
	}
	public Test4(String  a) {
		System.out.println("参数string");
	}
	public Test4(String  a,int b) {
		System.out.println("参数string,int");
	}
public static void main(String[] args) {
	 new  Test4();
}
}

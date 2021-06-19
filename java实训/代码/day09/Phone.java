package day10.extend;

/**
 * 重写
 * 
 * @author fan
 *
 */
public class Phone {
	static int id=101;
	static{
		System.out.println("static Phone{}");
	}
	{
		System.out.println("Phone{}");
	}
	String name="phone";
	public Phone() {
		this("Phone");
		System.out.println("Phone");
		
		
	}
	public Phone(String price) {
		System.out.println("Phone price="+price);
	}
	public void sendMessage() {
		System.out.println("发信息");
	}

	public void call() {
		System.out.println("打电话");
	}

	public void showNum() {
		System.out.println("来电显示");
	}
}

package day10.extend;

/**
 * ��д
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
		System.out.println("����Ϣ");
	}

	public void call() {
		System.out.println("��绰");
	}

	public void showNum() {
		System.out.println("������ʾ");
	}
}

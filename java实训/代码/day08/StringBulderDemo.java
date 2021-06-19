package day08;

public class StringBulderDemo {
	public StringBulderDemo() {
		init();
	}
	private void init() {
		//构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
		StringBuilder buffer=new StringBuilder();
		//this(16);
		 buffer=new StringBuilder(16);
		 buffer=new StringBuilder("abc");//字符串长度+16
		 buffer.append("sefsefsefsefsefsefsefsefsefsef");
		 buffer.insert(6, "g");
		 char c=buffer.charAt(4);
		 System.out.println(buffer);
		 System.out.println(c);
		
	}
	public static void main(String[] args) {
		new StringBulderDemo();
	}

}

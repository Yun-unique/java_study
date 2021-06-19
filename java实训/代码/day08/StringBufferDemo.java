package day08;

public class StringBufferDemo {
	public StringBufferDemo() {
		init();
	}
	private void init() {
		//构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
		StringBuffer buffer=new StringBuffer();
		
		//super(16); //字符数组的长度是16
		int size=buffer.capacity();//容器数组长度
		System.out.println(size);
		buffer=new StringBuffer(2);
		buffer.append('a');
		buffer.insert(1, "ac");
		System.out.println(buffer);
		buffer.append("abcdfg");
		System.out.println(buffer);
		size=buffer.capacity();
		System.out.println(size);
		int length=buffer.length();//实际字符长度
		System.out.println(length);
		
		
//		 buffer=new StringBuffer(16);
//		 buffer=new StringBuffer("abc");//字符串长度+16
//		 buffer.append("sefsefsefsefsefsefsefsefsefsef");
//		 buffer.insert(6, "g");
//		 char c=buffer.charAt(4);
//		 System.out.println(buffer);
//		 System.out.println(c);
		
	}
	public static void main(String[] args) {
		new StringBufferDemo();
	}

}

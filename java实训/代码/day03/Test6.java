package day02;

public class Test6 {
	public static void main(String[] args) {
	
		
		//自动类型转换
		byte a1=10;		
		short a2=a1; 
		int a3=a2;
		long a4=a3;
		float a5=a4;
		double a6=a5;
		System.out.println(a6);
		 // 强制类型转换
		char b='a'; //char类型和int类型转换
		//ASCII
		System.out.println(b);
		a3=b;
		System.out.println(a3);
		double c=10;
		float  c2=(float)c;
		long  c3=(long)c;
		int  c4=(int)c;
		byte  c5=(byte)c;
		
		
	}

}

package day05;

import java.util.Scanner;

public class Test1 {
	private int jian(int a, int b) {
		int c = a - b;
		return c;
	}

	private int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int xuanze(int a, String fu, int b) {
		int sum = 0;
		switch (fu) {
		case "+":
			sum = add(a, b);break;
		case "-":
			sum = jian(a, b);break;
		default:break;
		}
		return sum;

	}

	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     int a=scanner.nextInt();
     while(true) {
    	 String fu=scanner.next();
         int  b=scanner.nextInt();
         Test101 test101=new Test101();
         a=test101.xuanze(a, fu, b);
         System.out.println(a);
     }
     
	}
}

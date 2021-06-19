package day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class ScannerDemo {
	public static void main(String[] args) throws IOException {
    //System:
		//in  “标准”输入流。
//		InputStream in= System.in;
//		int c=in.read(); //控制台获得所有内容为字符串
//		System.out.println(c);	
		//err
		PrintStream err=System.err;
		err.println(13);
		//out
	PrintStream out=	System.out;
		
	out.println(12);
	}
}

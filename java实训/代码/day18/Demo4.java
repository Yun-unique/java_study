package day18;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 打印流---日志文件上
 * @author fan
 *
 */
public class Demo4 {
	public Demo4() throws IOException {
		System.out.println("97");
		//日志文件的工作原理
		//1.PrintStream
		//2.反射
		//3.拦截器
		File file=new File("log.log");
		PrintStream out=new PrintStream(file);
		System.setOut(out);
		System.out.println(Demo4.class.getClass());
		System.out.println(33);
	}


	public static void main(String[] args) {
		try {
			new Demo4();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

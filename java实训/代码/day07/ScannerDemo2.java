package day07;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
/**
 * 使用现有类的步骤
 * 1.System:
 * 1.1 导入包 :
 * java.lang下的所有类不导入包
 * 1.2 查看类
 * 1.2.1 查看构造函数
 *    私有修饰的构造默认为没有构造函数
 * 1.2.2 查看属性和方法   
 * 2.Scanner
 * 2.1 导入包 :
 *   使用 alt+\ 导入package
 * 2.2 查看类的说明
 * 2.3 查看构造并创建对象  
 * 2.4 能创建对象属性私有化，方法公开
 * 2.5 调用指定的方法获得想要的结果
 * @author fan
 *
 */
public class ScannerDemo2 {
	public static void main(String[] args) throws IOException {
	  
		//3.文件
		File file=new File("aa.txt");
		Scanner scanner=new Scanner(file);
		String line=scanner.nextLine();
		System.out.println(line);
		line=scanner.nextLine();
		System.out.println(line);
		line=scanner.nextLine();
		System.out.println(line);
		// System:
		// 2.in “标准”输入流。
//		InputStream in = System.in;
//		Scanner scanner=new Scanner(in);
//		String line=scanner.next();
//		System.out.println(line);
//		String line=scanner.nextLine();
//		System.out.println(line);
//		int line=scanner.nextInt();
//		System.out.println(line);
//		char s=scanner.next().charAt(0);
//		System.out.println(s);
		
		
		//1.参数是字符串可以获得参数
//		Scanner scanner=new Scanner("zhang");
//		String line=scanner.next();
//		System.out.println(line);

	}
}

package day07;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
/**
 * ʹ��������Ĳ���
 * 1.System:
 * 1.1 ����� :
 * java.lang�µ������಻�����
 * 1.2 �鿴��
 * 1.2.1 �鿴���캯��
 *    ˽�����εĹ���Ĭ��Ϊû�й��캯��
 * 1.2.2 �鿴���Ժͷ���   
 * 2.Scanner
 * 2.1 ����� :
 *   ʹ�� alt+\ ����package
 * 2.2 �鿴���˵��
 * 2.3 �鿴���첢��������  
 * 2.4 �ܴ�����������˽�л�����������
 * 2.5 ����ָ���ķ��������Ҫ�Ľ��
 * @author fan
 *
 */
public class ScannerDemo2 {
	public static void main(String[] args) throws IOException {
	  
		//3.�ļ�
		File file=new File("aa.txt");
		Scanner scanner=new Scanner(file);
		String line=scanner.nextLine();
		System.out.println(line);
		line=scanner.nextLine();
		System.out.println(line);
		line=scanner.nextLine();
		System.out.println(line);
		// System:
		// 2.in ����׼����������
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
		
		
		//1.�������ַ������Ի�ò���
//		Scanner scanner=new Scanner("zhang");
//		String line=scanner.next();
//		System.out.println(line);

	}
}

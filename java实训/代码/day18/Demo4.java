package day18;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * ��ӡ��---��־�ļ���
 * @author fan
 *
 */
public class Demo4 {
	public Demo4() throws IOException {
		System.out.println("97");
		//��־�ļ��Ĺ���ԭ��
		//1.PrintStream
		//2.����
		//3.������
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

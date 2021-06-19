package day17.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ֽ����� ������ֽڣ������ƣ�
 * 
 * @author fan
 *
 */
public class FileOutputStreamDemo {
	File file = new File("src/file//bb.txt");

	public FileOutputStreamDemo() throws IOException {
		// �ļ��Ĳ�����Ϊ���ļ���д�ļ�
		// ����д�Ǹ����������ģ������෴
		// init1();// д�ļ�
		// init2();// д�ļ�
		// init3();// д�ļ�
//		init4();
//		init5();
//		init6();
		init7();

	}
	private void init7() throws IOException {
		//��־�ļ���
		OutputStream out = new FileOutputStream(file,true);
		String s="abcde3";
	    out.write("\r\n".getBytes());
	    out.write(s.getBytes());
	}
	private void init6() throws IOException {
		//��־�ļ���
		OutputStream out = new FileOutputStream(file,true);
		String s="abcde";
	    out.write(s.getBytes());
	}

	private void init5() throws IOException {
		OutputStream out = new FileOutputStream(file);
		String s="abcde";
		s="������һ������";
		byte[] bs = s.getBytes();
		out.write(bs,1,4);
		out.close();
	}

	private void init4() throws IOException {
		OutputStream out = new FileOutputStream(file);
		String s="abcde";
		s="����";
		byte[] bs = s.getBytes();
		out.write(bs);
		out.close();
	}

	private void init3() throws IOException {
		OutputStream out = new FileOutputStream(file);
		byte[] bs = { 97, 98, 99 };
		out.write(bs);
		out.close();
	}

	private void init2() throws IOException {
		// ����gc�в����Զ����գ���Ҫ�ֶ�����
		OutputStream out = new FileOutputStream(file);
		// 1.д��һ���ֽ� int
		out.write(1); // ��1ת�����ַ�����
		System.out.println((char) 1);
		out.write(97); // ��1ת�����ַ�����
		System.out.println((char) 97);
		out.write(65); // ��1ת�����ַ�����
		System.out.println((char) 65);
		// �ͷ���Դ
		out.close();

	}

	/**
	 * 1.���캯��
	 * 
	 * @throws IOException
	 */
	private void init1() throws IOException {
		// ʹ���ֽ�����������ļ�
		/**
		 * OutputStream:���Զ������ļ������Զ�����Ŀ¼
		 */
		OutputStream out = new FileOutputStream(file);
		out = new FileOutputStream("aa.txt");

	}

	public static void main(String[] args) {
		try {
			new FileOutputStreamDemo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

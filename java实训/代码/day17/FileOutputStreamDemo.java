package day17.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 字节流： 万物皆字节（二进制）
 * 
 * @author fan
 *
 */
public class FileOutputStreamDemo {
	File file = new File("src/file//bb.txt");

	public FileOutputStreamDemo() throws IOException {
		// 文件的操作分为读文件和写文件
		// 读和写是根据流操作的，和你相反
		// init1();// 写文件
		// init2();// 写文件
		// init3();// 写文件
//		init4();
//		init5();
//		init6();
		init7();

	}
	private void init7() throws IOException {
		//日志文件中
		OutputStream out = new FileOutputStream(file,true);
		String s="abcde3";
	    out.write("\r\n".getBytes());
	    out.write(s.getBytes());
	}
	private void init6() throws IOException {
		//日志文件中
		OutputStream out = new FileOutputStream(file,true);
		String s="abcde";
	    out.write(s.getBytes());
	}

	private void init5() throws IOException {
		OutputStream out = new FileOutputStream(file);
		String s="abcde";
		s="还是有一个人在";
		byte[] bs = s.getBytes();
		out.write(bs,1,4);
		out.close();
	}

	private void init4() throws IOException {
		OutputStream out = new FileOutputStream(file);
		String s="abcde";
		s="还是";
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
		// 流在gc中不会自动回收，需要手动回收
		OutputStream out = new FileOutputStream(file);
		// 1.写入一字字节 int
		out.write(1); // 将1转换成字符出现
		System.out.println((char) 1);
		out.write(97); // 将1转换成字符出现
		System.out.println((char) 97);
		out.write(65); // 将1转换成字符出现
		System.out.println((char) 65);
		// 释放资源
		out.close();

	}

	/**
	 * 1.构造函数
	 * 
	 * @throws IOException
	 */
	private void init1() throws IOException {
		// 使用字节输出流操作文件
		/**
		 * OutputStream:会自动创建文件不会自定创建目录
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

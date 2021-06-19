package day17.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class ReaderDemo {
	File oldfile = new File("src/file/aa.txt");
	File newfile = new File("src/file/bb.txt");
	public ReaderDemo() throws IOException {
		// init1();
		init2();
	}
	// 字符流复制文件
	private void init2() throws IOException {
		Reader reader=new FileReader(oldfile);
		Writer writer=new FileWriter(newfile);
		char[] cbuf=new char[10];
		int len=0;
		while((len=reader.read(cbuf))!=-1) {
			System.out.println(len);
			writer.write(cbuf,0,len);
			writer.flush();
		}
		writer.close();
		reader.close();

	}

	private void init1() throws IOException {
		Reader reader = new FileReader(oldfile);
		// int c=reader.read();//获得一个字节
		// System.out.println(c);
		char[] cbuf = new char[1024];
		int len = reader.read(cbuf);
		// System.out.println(Arrays.toString(cbuf));
		String str = new String(cbuf, 0, len);
		System.out.println(str.length());
	}

	public static void main(String[] args) {
		try {
			new ReaderDemo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

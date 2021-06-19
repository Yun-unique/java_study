package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流 reader---->bufferdReader writer---->
 * 
 * @author fan
 *
 */
public class Demo2 {
	public Demo2() throws IOException {
		// init1();
		// init2();
		// init3();
		init4();
	}

	String pathname = "E:\\zhuomian\\JDK_API_1_6_zh_CN.CHM";

	private void init4() throws IOException {
//		pathname="src/file/aa.txt";
		File file = new File(pathname);
		Reader reader = new FileReader(file);
        @SuppressWarnings("resource")
		BufferedReader bufferedReader=new BufferedReader(reader);
        String str=	bufferedReader.readLine();
        str=new String(str.getBytes("gb2312"),"utf-8");
        System.out.println(str);
        //乱码的处理
        String str2=new String("寮犱笁".getBytes("gbk"),"utf-8");
        System.out.println(str2);
       
	}

	private void init3() throws IOException {
		pathname = "src/file/aa.txt";
		File file = new File(pathname);
		// 字符流的操作
		Reader reader = new FileReader(file);
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		System.out.println(line);
		while (line != null) {
			line = bufferedReader.readLine();
			System.out.println(line);
		}
	}

	private void init2() throws IOException {
		pathname = "src/file/aa.txt";
		File file = new File(pathname);
		// 字符流的操作
		Writer writer = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write("zhangsan1".toCharArray());
		bufferedWriter.newLine();
		bufferedWriter.write("lisi1");
		bufferedWriter.flush();
		bufferedWriter.close();
	}

	private void init1() throws IOException {
		pathname = "src/file/aa.txt";
		File file = new File(pathname);
		// 字符流的操作
		Writer writer = new FileWriter(file, true);
		writer.write("zhangsan");
		writer.write("\n");
		writer.write("lisi");
		writer.flush();
		writer.close();

	}

	public static void main(String[] args) {
		try {
			new Demo2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

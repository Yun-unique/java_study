package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * 编码分类： --拉丁文 (高级英语) ascii编码 iso-8859-1 默认编码 GB 国标 GB2312：中文编码
 * GBK:中文码表--GB2312扩展的 GB18030 unicode UTF-8：为中国设计的---（繁体字） 汉字的抓换 转换流
 * 
 * @author fan
 *
 */
public class Demo3 {
	public Demo3() throws IOException {
//		init1();
		//编码处理
		init2();
	}

	private void init2() throws IOException {
		//--怎么读的怎么写
		//读取内容
		String oldpath="src/file/aa.txt";
		File oldfile=new File(oldpath);
		InputStream in=new FileInputStream(oldfile);
		InputStreamReader reader=new InputStreamReader(in,"UTF-8");
		BufferedReader reader2=new BufferedReader(reader);
//		String line=reader2.readLine();
//		System.out.println(line);
		
		//写入内容
		String newpath="src/file/bb.txt";
		File newfile=new File(newpath);
		OutputStream out=new FileOutputStream(newfile);
	    OutputStreamWriter writer=new OutputStreamWriter(out);
	    BufferedWriter writer2=new BufferedWriter(writer);
	    String line="";
	    while((line=reader2.readLine())!=null) {
	    	writer2.write(line);
	    	writer2.newLine();
	    	writer2.flush();
	    }
	    //关闭所有的流
	    out.close();
	    writer2.close();
	    writer.close();
	   
	    
	}

	private void init1() throws IOException {
		InputStream in = System.in;// 获得字节流
		// int c= in.read();
		// System.out.println(c);
		// 字节流转换成字符流
		Reader reader = new InputStreamReader(in);
		// reader.read();
		// 缓冲流
		BufferedReader scanner = new BufferedReader(reader);
		String sc = scanner.readLine();
		//类型转换
		System.out.println(sc);
		
	}

	public static void main(String[] args) {
		try {
			new Demo3();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

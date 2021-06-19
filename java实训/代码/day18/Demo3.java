package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
		init1();
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

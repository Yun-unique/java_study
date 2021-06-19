package day17.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ByteDemo {
	File file = new File("src/file/aa.txt");

	public ByteDemo() throws IOException {
		InputStream in = new FileInputStream(file);

		// int len=in.read();//读取一个字节或者字节对应的数字
		// 如果没有返回一个-1
		// System.out.println(len);
		byte[] buf = new byte[12];
		// 如果以数组获得数据，所有的数据保存在数组中
		// 返回结果为数组中的元素个数
		int len = in.read(buf);
		// 如果没有数据数组的长度默认为-1
		System.out.println(len);
		// 数组转换成字符串---只要有效数据
		System.out.println(Arrays.toString(buf));
		// 如果不定义长度，默认将数组中的数据数据转换
		String str = new String(buf);
		System.out.println(str.length());
		System.out.println(str);
		// 转换有效长度  截取数组的有效长度，转换成字符串
		str = new String(buf,0,len);
		System.out.println(str.length());
		System.out.println(str);
		//get请求----
		str = new String(buf,0,len,"utf-8");
		System.out.println(str.length());
		System.out.println(str);
		str = new String(buf,0,len,"gbk");
		System.out.println(str);
		str = new String(buf,0,len,"gb2312");
		System.out.println(str);
		str = new String(buf,0,len,"iso-8859-1");
		System.out.println(str);
		
		

	}

	public static void main(String[] args) {
		try {
			new ByteDemo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

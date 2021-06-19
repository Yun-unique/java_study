package day17.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符流操作汉字
 * 
 * @author fan
 *
 */
public class WriterDemo {
	File file = new File("src/file/aa.txt");

	public WriterDemo() throws IOException {
		init();
	}

	/**
	 * 构造函数
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	private void init() throws IOException {
		// 使用文件获得字符流
		Writer writer = new FileWriter(file);
		// //将字符串路径转换成字符流
//		Writer writer = new FileWriter("src/file/aa.txt");
		// 添加追加参数 默认是false true：表示追加内容
	    writer = new FileWriter(file, true);
		writer.write("你好7");
		writer.flush();
		writer.close();

	}

	public static void main(String[] args) {
		try {
			new WriterDemo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

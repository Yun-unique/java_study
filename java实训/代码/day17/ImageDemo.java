package day17.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 复制图片
 * 
 * @author fan
 *
 */
public class ImageDemo {
	File oldfile = new File("src/pic/logo.gif");
	File newfile = new File("src/file/logo.gif");

	public ImageDemo() throws Exception {
		 init1();
//		init2();
	}

	private void init2() throws IOException {
		// 读
		InputStream in = new FileInputStream(oldfile);
		// 写
		OutputStream out = new FileOutputStream(newfile);
		byte[] buf=new byte[1024];
		int len = 0;// 一个字节一个字节读
		while ((len = in.read(buf)) != -1) {
			// System.out.println(c);
			out.write(buf,0,len);
			out.flush();// 保存内容
		}
		out.close();
		in.close();

	}

	private void init1() throws Exception {
		// 读
		InputStream in = new FileInputStream(oldfile);
		// 写
		OutputStream out = new FileOutputStream(newfile);
		int c = 0;// 一个字节一个字节读
		while ((c = in.read()) != -1) {
			// System.out.println(c);
			out.write(c);
			out.flush();// 保存内容
		}
		out.close();
		in.close();

	}

	public static void main(String[] args) {
		try {
			new ImageDemo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package day16;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public FileDemo1() throws IOException {
		// init1();
		init2();
	}

	/**
	 * 构造函数
	 * @throws IOException 
	 */
	private void init2() throws IOException {
		// File(String pathname)
		// 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		String pathname="d:\\aa.txt";
		File file=new File(pathname);
		file.createNewFile(); //创建问文件
		
		// File(File parent, String child)
		// 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
		file=new File("d:\\aa\\aa\\aa\\aa");
        if(!file.exists()) {
        	file.mkdirs();
        }
        file=new File(file,"a.txt");
        if(!file.exists())
          file.createNewFile();
		
		// File(String parent, String child)
		// 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
	    String parent="d:\\aa";//目录  通过路径表示文件
	    String child="a.txt";//文件
	    file=new File(parent,child);
	    file.createNewFile();
        // File(URI uri)  tomcat  远程创建
		// 通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。

	}

	/**
	 * 基础部分
	 * 
	 * @throws IOException
	 */
	private void init1() throws IOException {
		// 通过文件夹路径创建
		String pathname = "d:\\aa.txt";
		// 将字符串转换成文件方便操作
		// file只能是文件或者目录,没有
		File file = new File(pathname);
		// 目录和文件
		// 目录： 文件夹 不占空间，目录下只有文件和目录
		// 文件： 文件不占空间，但是文件中的内容占空间
		// 判断 1.判断文件和目录
		boolean flag = file.isDirectory();
		System.out.println("目录：" + flag);
		flag = file.isFile();
		System.out.println("文件：" + flag);
		// 2.创建
		// 2.1 创建文件
		if (!file.isFile()) {
			flag = file.createNewFile();
			System.out.println("创建文件" + flag);
		}
		pathname = "d:/t";
		pathname = "d:\\ii"; // 防止转义字符
		file = new File(pathname);
		// 2.2 创建目录
		if (!file.isDirectory()) {
			flag = file.mkdir(); // 创建子目录
			System.out.println("创建目录" + flag);
		}
		pathname = "d:\\ii\\a\\a\\a"; // 防止转义字符
		file = new File(pathname);
		// 2.2 创建目录
		if (!file.isDirectory()) {
			flag = file.mkdirs(); // 创建目录
			System.out.println("创建目录" + flag);
		}

	}

	public static void main(String[] args) throws IOException {
		new FileDemo1();
	}
}

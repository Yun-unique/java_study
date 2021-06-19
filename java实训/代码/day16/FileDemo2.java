package day16;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileDemo2 {
	public FileDemo2() throws Exception {
		// // init1();
		// init3();
		// init4();
//		 init5();
		init6();
	}

	// 文件的状态
	private void init6() {
      //文件--只读  只写，读写  隐藏
		String path = "aa\\bb";
		String pathname = "aa.txt";
		File file = new File(path, pathname);
		System.out.println("隐藏:"+file.isHidden());
		System.out.println("只读:"+file.canRead());
		System.out.println("只写:"+file.canWrite());
		
		
//		path=file.getAbsolutePath();
//		System.out.println(path);
		
	}

	// 操作
	private void init5() throws IOException {
		// 创建
		String path = "aa\\bb";
		File file = new File(path);
		file.mkdirs(); // 创建目录
		String pathname = "aa.txt";
		file = new File(file, pathname);
		file.createNewFile(); // 创建文件
//		file = file.getAbsoluteFile();
//		file.delete();
//		for (int i = 1; i <= 2; i++) {
//			file = file.getParentFile();
//			file.delete();
//		}

		// path= file.getParent();
		// System.out.println(path);
		// file= new File(path);
		// file.delete();

		// path="aa\\bb\\aa.txt";
		// file= new File(path);
		// file.delete();
		// path="aa\\bb";
		// file= new File(path);
		// file.delete();
		// path="aa";
		// file= new File(path);
		// file.delete();

	}

	// 判断的方法
	private void init4() {
		// is
		String pathname = "D:\\daima\\xuexiao\\c.txt";
		File file = new File(pathname);
		System.out.println("是否存在：" + file.exists());
		System.out.println("判断目录：" + file.isDirectory());
		System.out.println("判断文件：" + file.isFile());

	}

	// 2.2路径 ????
	private void init3() throws Exception {
		String pathname = "http://img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg";
		URI url = new URI(pathname);
		File file = new File(pathname);
		boolean flag = file.exists();
		System.out.println(flag);

	}

	// 2.1 路径
	private void init2() {
		String pathname = "D:\\daima\\xuexiao\\c.txt";
		File file = new File(pathname);
		System.out.println("文件的绝对路径:" + file.getAbsolutePath());
		System.out.println("文件的父级目录:" + file.getParent());
		System.out.println("文件的父级目录:" + file.getPath());
		System.out.println("文件名:" + file.getName());
		System.out.println("文件名:" + file.length());
	}

	// 1.路径
	private void init1() throws IOException {
		// tomcat----windonws下的路径转换成linux下的路径
		// /root/user/
		// 图片和文件的处理
		// 1.1 绝对路径 相当于盘符
		String pathname = "d:\\aa\\aa\\b.txt";
		File file = new File(pathname);
		file.createNewFile();
		// 1.2 相对路径 --项目目录下
		// tomcat -- 图片服务器
		// img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg
		pathname = "b.txt";
		file = new File(pathname);
		file.createNewFile();
		// tomcat运行完成后，源码不发生改变，发布项目发生改变
		// String
		// url="img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg";

	}

	public static void main(String[] args) throws Exception {
		new FileDemo2();
	}
}

package day17.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public PropertiesDemo() throws IOException {
		// init1();
		// init2();
//		init3();
	}

	static {
		try {
			Properties properties = new Properties();
			String pathname = "jdbc.properties";
			InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream(pathname);
			properties.load(in);// 加载文件内容
			System.out.println(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void init3() throws IOException {
		// 核心文件
		Properties properties = new Properties();
		String pathname = "jdbc.properties";
		// 通过类加载器获得文件---确定有文件---找不到文件
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(pathname);
		System.out.println(in);
		properties.load(in);// 加载文件内容
		System.out.println(properties);

	}

	private void init2() throws IOException {
		// 核心文件
		Properties properties = new Properties();
		String pathname = "src/file/jdbc.properties";
		File file = new File(pathname);
		InputStream in = new FileInputStream(file);
		properties.load(in);// 加载文件内容
		System.out.println(properties);
	}

	private void init1() {
		// 键值对得类 键是字符串值也是字符串
		// 获得外部键值对得类
		Properties properties = new Properties();
		properties.setProperty("username", "root");
		properties.setProperty("password", "admin");
		properties.setProperty("driver", "com.mysql.jdbc.Driver");
		properties.setProperty("url", "jdbc:mysql://localhost:3306/yang");
		System.out.println(properties);
		Set<String> keys = properties.stringPropertyNames();
		for (String key : keys) {
			// 通过键获得值
			System.out.println(properties.get(key));
		}
	}

	public static void main(String[] args) {
		// mybatis
		// 读取外部文件部分失败
		try {
			new PropertiesDemo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

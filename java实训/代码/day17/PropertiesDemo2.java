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
			properties.load(in);// �����ļ�����
			System.out.println(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void init3() throws IOException {
		// �����ļ�
		Properties properties = new Properties();
		String pathname = "jdbc.properties";
		// ͨ�������������ļ�---ȷ�����ļ�---�Ҳ����ļ�
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(pathname);
		System.out.println(in);
		properties.load(in);// �����ļ�����
		System.out.println(properties);

	}

	private void init2() throws IOException {
		// �����ļ�
		Properties properties = new Properties();
		String pathname = "src/file/jdbc.properties";
		File file = new File(pathname);
		InputStream in = new FileInputStream(file);
		properties.load(in);// �����ļ�����
		System.out.println(properties);
	}

	private void init1() {
		// ��ֵ�Ե��� �����ַ���ֵҲ���ַ���
		// ����ⲿ��ֵ�Ե���
		Properties properties = new Properties();
		properties.setProperty("username", "root");
		properties.setProperty("password", "admin");
		properties.setProperty("driver", "com.mysql.jdbc.Driver");
		properties.setProperty("url", "jdbc:mysql://localhost:3306/yang");
		System.out.println(properties);
		Set<String> keys = properties.stringPropertyNames();
		for (String key : keys) {
			// ͨ�������ֵ
			System.out.println(properties.get(key));
		}
	}

	public static void main(String[] args) {
		// mybatis
		// ��ȡ�ⲿ�ļ�����ʧ��
		try {
			new PropertiesDemo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

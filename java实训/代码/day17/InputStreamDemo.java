package day17.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * ��ȡ�ļ��е�����
 * 
 * @author fan
 *
 */
public class InputStreamDemo {
	File file = new File("src/file//bb.txt");

	public InputStreamDemo() throws Exception {
		if (!file.exists()) {
			System.out.println("�ļ�������");
			return;
		}
		// init1();
		// init2();
		init3();

	}

	private void init3() throws IOException {
		InputStream in = new FileInputStream(this.file);
		byte[] buf = new byte[10]; // 1kb=1024b
		in.read(buf);// ����ý��������������
		System.out.println(Arrays.toString(buf));
		// ����ת�����ַ���
		String bufstr = new String(buf);
		System.out.println(bufstr);
	}

	private void init2() throws IOException {
		// ���ļ�ת�����ֽ�����������
		InputStream in = new FileInputStream(this.file);
		int c = in.read(); // ���һ���ֽ�
		System.out.println((char) c);
		while ((c = in.read()) != -1) {
			System.out.println((char) c);
		}
	}

	/**
	 * ���캯��
	 * 
	 * @throws IOException
	 */
	private void init1() throws IOException {
		// FileInputStream(File file)
		InputStream in = new FileInputStream(this.file);
		in = new FileInputStream("src/file//bb.txt");

	}

	public static void main(String[] args) {
		try {
			new InputStreamDemo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

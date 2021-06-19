package day17.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �ַ�����������
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
	 * ���캯��
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	private void init() throws IOException {
		// ʹ���ļ�����ַ���
		Writer writer = new FileWriter(file);
		// //���ַ���·��ת�����ַ���
//		Writer writer = new FileWriter("src/file/aa.txt");
		// ���׷�Ӳ��� Ĭ����false true����ʾ׷������
	    writer = new FileWriter(file, true);
		writer.write("���7");
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

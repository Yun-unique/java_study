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

		// int len=in.read();//��ȡһ���ֽڻ����ֽڶ�Ӧ������
		// ���û�з���һ��-1
		// System.out.println(len);
		byte[] buf = new byte[12];
		// ��������������ݣ����е����ݱ�����������
		// ���ؽ��Ϊ�����е�Ԫ�ظ���
		int len = in.read(buf);
		// ���û����������ĳ���Ĭ��Ϊ-1
		System.out.println(len);
		// ����ת�����ַ���---ֻҪ��Ч����
		System.out.println(Arrays.toString(buf));
		// ��������峤�ȣ�Ĭ�Ͻ������е���������ת��
		String str = new String(buf);
		System.out.println(str.length());
		System.out.println(str);
		// ת����Ч����  ��ȡ�������Ч���ȣ�ת�����ַ���
		str = new String(buf,0,len);
		System.out.println(str.length());
		System.out.println(str);
		//get����----
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

package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * ������ࣺ --������ (�߼�Ӣ��) ascii���� iso-8859-1 Ĭ�ϱ��� GB ���� GB2312�����ı���
 * GBK:�������--GB2312��չ�� GB18030 unicode UTF-8��Ϊ�й���Ƶ�---�������֣� ���ֵ�ץ�� ת����
 * 
 * @author fan
 *
 */
public class Demo3 {
	public Demo3() throws IOException {
		init1();
	}

	private void init1() throws IOException {
		InputStream in = System.in;// ����ֽ���
		// int c= in.read();
		// System.out.println(c);
		// �ֽ���ת�����ַ���
		Reader reader = new InputStreamReader(in);
		// reader.read();
		// ������
		BufferedReader scanner = new BufferedReader(reader);
		String sc = scanner.readLine();
		//����ת��
		System.out.println(sc);
		
	}

	public static void main(String[] args) {
		try {
			new Demo3();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

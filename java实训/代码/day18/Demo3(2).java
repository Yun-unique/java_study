package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
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
//		init1();
		//���봦��
		init2();
	}

	private void init2() throws IOException {
		//--��ô������ôд
		//��ȡ����
		String oldpath="src/file/aa.txt";
		File oldfile=new File(oldpath);
		InputStream in=new FileInputStream(oldfile);
		InputStreamReader reader=new InputStreamReader(in,"UTF-8");
		BufferedReader reader2=new BufferedReader(reader);
//		String line=reader2.readLine();
//		System.out.println(line);
		
		//д������
		String newpath="src/file/bb.txt";
		File newfile=new File(newpath);
		OutputStream out=new FileOutputStream(newfile);
	    OutputStreamWriter writer=new OutputStreamWriter(out);
	    BufferedWriter writer2=new BufferedWriter(writer);
	    String line="";
	    while((line=reader2.readLine())!=null) {
	    	writer2.write(line);
	    	writer2.newLine();
	    	writer2.flush();
	    }
	    //�ر����е���
	    out.close();
	    writer2.close();
	    writer.close();
	   
	    
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

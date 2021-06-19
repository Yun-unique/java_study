package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ������
 * inputStream---->
 * outputStream---->
 * @author fan
 *
 */
public class Demo1 {
	public Demo1() throws IOException {
		init1();
	}
	//inputStream---->BufferedInputStream
	private void init1() throws IOException {
		String pathname="D:\\java\\XMind.exe";//���ĵ�ַ������Ŀ�µ�·��
		//��·��ת�����ļ���  ���ڲ���
		File file=new File(pathname);
		//���ļ�ת�������ļ�
		InputStream in=new FileInputStream(file);
		OutputStream out=new FileOutputStream("src/file/XMind.exe");
		//��ӻ�������---����ٶ�
		BufferedInputStream bio=new  BufferedInputStream(in);
	    BufferedOutputStream bos=new BufferedOutputStream(out);
		byte[] buf=new byte[1024];
		int len=0;
		//��ʹ�û�����ʱ��
//		long cur=System.currentTimeMillis();
//		while((len=in.read())!=-1) {
//			System.out.println(1);
//			out.write(len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);
		//ʹ��������ʱ��
//		long cur=System.currentTimeMillis();
//		while((len=in.read(buf))!=-1) { 
//			out.write(buf,0,len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);//500
		//ʹ�û�����ʱ��
//		long cur=System.currentTimeMillis();
//		while((len=bio.read())!=-1) { //2297
//			bos.write(len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);
		//ʹ�û����������ʱ��
//		�ڶ�ȡ���ݵ�ʱ��һ��ʹ�û���+�������ʽ
		long cur=System.currentTimeMillis();
		while((len=bio.read(buf))!=-1) {
			bos.write(buf,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-cur); //126
	}
	public static void main(String[] args) {
		try {
			new Demo1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

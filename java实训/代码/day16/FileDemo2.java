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

	// �ļ���״̬
	private void init6() {
      //�ļ�--ֻ��  ֻд����д  ����
		String path = "aa\\bb";
		String pathname = "aa.txt";
		File file = new File(path, pathname);
		System.out.println("����:"+file.isHidden());
		System.out.println("ֻ��:"+file.canRead());
		System.out.println("ֻд:"+file.canWrite());
		
		
//		path=file.getAbsolutePath();
//		System.out.println(path);
		
	}

	// ����
	private void init5() throws IOException {
		// ����
		String path = "aa\\bb";
		File file = new File(path);
		file.mkdirs(); // ����Ŀ¼
		String pathname = "aa.txt";
		file = new File(file, pathname);
		file.createNewFile(); // �����ļ�
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

	// �жϵķ���
	private void init4() {
		// is
		String pathname = "D:\\daima\\xuexiao\\c.txt";
		File file = new File(pathname);
		System.out.println("�Ƿ���ڣ�" + file.exists());
		System.out.println("�ж�Ŀ¼��" + file.isDirectory());
		System.out.println("�ж��ļ���" + file.isFile());

	}

	// 2.2·�� ????
	private void init3() throws Exception {
		String pathname = "http://img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg";
		URI url = new URI(pathname);
		File file = new File(pathname);
		boolean flag = file.exists();
		System.out.println(flag);

	}

	// 2.1 ·��
	private void init2() {
		String pathname = "D:\\daima\\xuexiao\\c.txt";
		File file = new File(pathname);
		System.out.println("�ļ��ľ���·��:" + file.getAbsolutePath());
		System.out.println("�ļ��ĸ���Ŀ¼:" + file.getParent());
		System.out.println("�ļ��ĸ���Ŀ¼:" + file.getPath());
		System.out.println("�ļ���:" + file.getName());
		System.out.println("�ļ���:" + file.length());
	}

	// 1.·��
	private void init1() throws IOException {
		// tomcat----windonws�µ�·��ת����linux�µ�·��
		// /root/user/
		// ͼƬ���ļ��Ĵ���
		// 1.1 ����·�� �൱���̷�
		String pathname = "d:\\aa\\aa\\b.txt";
		File file = new File(pathname);
		file.createNewFile();
		// 1.2 ���·�� --��ĿĿ¼��
		// tomcat -- ͼƬ������
		// img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg
		pathname = "b.txt";
		file = new File(pathname);
		file.createNewFile();
		// tomcat������ɺ�Դ�벻�����ı䣬������Ŀ�����ı�
		// String
		// url="img.alicdn.com/bao/uploaded/i2/2099674228/O1CN012N922d1h6TFRWkQzA_!!2099674228.jpg_200x200q90.jpg";

	}

	public static void main(String[] args) throws Exception {
		new FileDemo2();
	}
}
